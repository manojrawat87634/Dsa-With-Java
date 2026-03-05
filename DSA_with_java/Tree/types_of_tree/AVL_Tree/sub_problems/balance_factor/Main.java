package D_Balanced_BST.topics.AVL_Tree.sub_problems.balance_factor;

class Node {
    int data;
    Node left;
    Node right;
    int height;

    Node(int value) {
        this.data = value;
        this.left = null;
        this.right = null;
        this.height = 1;
    }
}

class AVL_Tree {
    private Node root;

    void insert(int val) {
        root = insertRec(root, val);
    }

    Node insertRec(Node node, int val) {
        if (node == null)
            return new Node(val);
        if (val > node.data) {
            node.right = insertRec(node, val);
        } else if (val < node.data) {
            node.left = insertRec(node, val);
        }
        node.height = 1 + Math.max(height(node.left), height(node.right));
        return node;
    }

    int getBalance(Node node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    int height(Node node) {
        return node == null ? 0 : node.height;
    }
}

public class Main {

}
