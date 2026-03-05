package D_Balanced_BST.topics.AVL_Tree;

class Node {
    int data;
    Node left;
    Node right;
    int height; // Needed for AVL balancing

    Node(int value) {
        this.data = value;
        this.left = null;
        this.right = null;
        this.height = 1; // new node has height 1
    }
}

class AVLTree {
    private Node root;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node node, int value) {
        if (node == null)
            return new Node(value);

        if (value < node.data)
            node.left = insertRec(node.left, value);
        else if (value > node.data)
            node.right = insertRec(node.right, value);
        else
            return node; 
        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        // Check 4 AVL cases

        // Left-Left Case
        if (balance > 1 && value < node.left.data)
            return rightRotate(node);

        // Right-Right Case
        if (balance < -1 && value > node.right.data)
            return leftRotate(node);

        // Left-Right Case
        if (balance > 1 && value > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right-Left Case
        if (balance < -1 && value < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Build tree from an array
    public void buildTree(int[] arr) {
        for (int val : arr) {
            insert(val); // Use the AVL insert method
        }
    }

    // Height of a node
    private int height(Node node) {
        return node == null ? 0 : node.height;
    }

    // Balance factor
    private int getBalance(Node node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    // Right rotation
    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Left rotation
    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

     

    // Inorder traversal (sorted output)
    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node node) {
        if (node != null) {
            inorderRec(node.left);
            System.out.print(node.data + " ");
            inorderRec(node.right);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[] values = { 1, 2, 3 };
        AVLTree tree = new AVLTree();
        tree.buildTree(values);

        System.out.println("Inorder traversal of AVL tree (should be sorted):");
        tree.inorder();
    }
}