package D_Balanced_BST.topics.AVL_Tree.sub_problems.rotate_tree;

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
        int balance = getBalance(node);
        if (balance > 1 && val < node.left.data){
            return rightRotate(node);
        }
        if (balance < -1 && val > node.right.data){
            return leftRotate(node);
        }

        // LR Case
        if (balance > 1 && val > node.left.data){
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        // 
        if (balance < -1 && val < node.right.data){
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    int getBalance(Node node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    int height(Node node) {
        return node == null ? 0 : node.height;
    }
    Node leftRotate(Node x){
        Node y = x.right;
        Node T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));        
        return y;
    }

    Node rightRotate(Node x){
        Node y = x.left;
        Node T2 = y.right;
        y.right = x;
        x.left = T2;
         x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));        
        return y;
    }
}

public class Main {

}
