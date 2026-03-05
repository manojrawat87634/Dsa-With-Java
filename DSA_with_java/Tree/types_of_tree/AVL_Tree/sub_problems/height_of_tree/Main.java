package D_Balanced_BST.topics.AVL_Tree.sub_problems.height_of_tree;

class Node {
    int data;
    Node left;
    Node right;
    int height;

    Node(int value) {
        this.data = value;
        this.left = null;
        this.right = null;
        this.height = 1; // leaf node height = 1
    }
}

class BST {

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
        // ONLY HEIGHT UPDATE (no balancing)
        node.height = 1 + Math.max(height(node.left), height(node.right));
        return node;
    }

    private int height(Node node) {
        return node == null ? 0 : node.height;
    }

    // Print inorder with height
    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node node) {
        if (node != null) {
            inorderRec(node.left);
            System.out.println("Node: " + node.data + " Height: " + node.height);
            inorderRec(node.right);
        }

    }

    void buildTree(int [] arr){
        for (int i : arr){
            insert(i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();

        // tree.insert(1);
        // tree.insert(2);
        // tree.insert(3);

        tree.inorder();
    }
}