package C_Binary_Search_Tree;

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

class BinarySearch {
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

    public Node binarySearch(int target) {
        return _binarySearch(root, target);
    }

    private Node _binarySearch(Node r, int target) {
        if (r == null)
            return null;
        if (target > r.data)
            return _binarySearch(r.right, target);
        if (target < r.data)
            return _binarySearch(r.left, target);
        return r;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] values = { 50, 40, 39, 45, 40, 60, 80 };
        // BinaryTree tree = new BinaryTree();
        BinarySearch tree = new BinarySearch();
        tree.buildTree(values);
        Node t = tree.binarySearch(90);
        if (t != null) {
            System.out.println(t.data);
        }
        else{
            System.out.print("Element Not Found");
        }
    }
}
