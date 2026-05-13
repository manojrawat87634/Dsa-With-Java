// package D_Balanced_BST.topics.Red_Black_Tree;

class Node {
    int data;
    Node left, right, parent;
    boolean color; // true = RED, false = BLACK

    Node(int value) {
        this.data = value;
        this.left = null;
        this.right = null;
        this.parent = null;
        this.color = true; // new nodes are RED
    }
}

class RedBlackTree {

    Node root;

    // Left Rotation
    void leftRotate(Node x) {
        Node y = x.right;
        x.right = y.left;

        if (y.left != null)
            y.left.parent = x;

        y.parent = x.parent;

        if (x.parent == null)
            root = y;
        else if (x == x.parent.left)
            x.parent.left = y;
        else
            x.parent.right = y;

        y.left = x;
        x.parent = y;
    }

    // Right Rotation
    void rightRotate(Node x) {
        Node y = x.left;
        x.left = y.right;

        if (y.right != null)
            y.right.parent = x;

        y.parent = x.parent;

        if (x.parent == null)
            root = y;
        else if (x == x.parent.right)
            x.parent.right = y;
        else
            x.parent.left = y;

        y.right = x;
        x.parent = y;
    }

    // Insert Node
    void insert(int key) {
        Node node = new Node(key);

        Node parent = null;
        Node current = root;

        while (current != null) {
            parent = current;
            if (node.data < current.data)
                current = current.left;
            else
                current = current.right;
        }

        node.parent = parent;

        if (parent == null)
            root = node;
        else if (node.data < parent.data)
            parent.left = node;
        else
            parent.right = node;

        fixInsert(node);
    }

    // Fix Red-Black violations
    void fixInsert(Node node) {

        while (node != root && node.parent.color == true) {
            Node parent = node.parent;
            Node grandparent = parent.parent;
            if (parent == grandparent.left) {
                Node uncle = grandparent.right;
                // Case 1: Uncle is RED
                if (uncle != null && uncle.color == true) {
                    parent.color = false;
                    uncle.color = false;
                    grandparent.color = true;
                    node = grandparent;
                }

                else {

                    // Case 2: Left Right
                    if (node == parent.right) {
                        node = parent;
                        leftRotate(node);
                    }

                    // Case 3: Left Left
                    parent.color = false;
                    grandparent.color = true;
                    rightRotate(grandparent);
                }
            }

            else {

                Node uncle = grandparent.left;

                // Case 1
                if (uncle != null && uncle.color == true) {
                    parent.color = false;
                    uncle.color = false;
                    grandparent.color = true;
                    node = grandparent;
                }

                else {

                    // Case 2
                    if (node == parent.left) {
                        node = parent;
                        rightRotate(node);
                    }

                    // Case 3
                    parent.color = false;
                    grandparent.color = true;
                    leftRotate(grandparent);
                }
            }
        }

        root.color = false;
    }

    // Inorder traversal
    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + (node.color ? "R " : "B "));
            inorder(node.right);
        }
    }

}

public class Main {
    public static void main(String[] args) {

        RedBlackTree tree = new RedBlackTree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(15);
        tree.insert(25);
        tree.insert(5);

        // tree.inorder(tree.root);
        // tree.printTree(tree.root, "", true);
    }
}