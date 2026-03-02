package B_Binary_Tree;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    private Node root;

    public void insert(int value) {
        root = insertRec(root, value);
    }
    private Node insertRec(Node node, int value) {
        if (node == null) {
            return new Node(value); // Create new node if current position is null
        }
        if (value < node.data) {
            node.left = insertRec(node.left, value);
        } else if (value > node.data) {
            node.right = insertRec(node.right, value);
        }
        // duplicates are ignored
        return node;
    }
    // Build tree from array
    public void buildTree(int[] arr) {
        for (int val : arr) {
            insert(val); // Uses the internal insert method
        }
    }
    public void inorder() {
        _inorder(root);
    }
   public void preorder() {
        _preorder(root);
    }
   public void postorder() {
        _postorder(root);
    }
     private void _inorder(Node r) {
        if (r == null)
            return;
        _inorder(r.left);
        System.out.print(r.data + ", ");
        _inorder(r.right);
    }
     private void _preorder(Node r) {
        if (r == null)
            return;
        System.out.print(r.data + ", ");
        _preorder(r.left);
        _preorder(r.right);
    }
     private void _postorder(Node r) {
        if (r == null) return;
        _postorder(r.left);
        _postorder(r.right);
        System.out.print(r.data + ", ");
    }
}

public class Main {
    public static void main(String[] args) {
        int[] values = { 50, 40, 39, 45, 40, 60, 80 };
        BinaryTree tree = new BinaryTree();
        tree.buildTree(values);
        System.out.print("\nIn Order : ");
        tree.inorder();
        System.out.print("\nPre Order : ");
        tree.preorder();
        System.out.print("\nPost Order : ");
        tree.postorder();
    }
}
