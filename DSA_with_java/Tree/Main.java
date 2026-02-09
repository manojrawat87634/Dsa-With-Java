import java.util.*;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class Main {
    // Build tree recursively from array
    public static Node buildTree(int[] arr, int index) {
        // int[] arr = {1, 2, 3, 4, -1, 5, 6};

        if (index >= arr.length || arr[index] == -1) {
            return null; // null node
        }

        Node root = new Node(arr[index]);
        // Recursively construct children
        root.left = buildTree(arr, 2 * index + 1);
        root.right = buildTree(arr, 2 * index + 2);
        return root;
    }

    // Preorder (Root → Left → Right)
    public static void preorder(Node root, List<Integer> result) {
        if (root == null)
            return;
        result.add(root.val);
        preorder(root.left, result);
        preorder(root.right, result);
    }

    // Inorder (Left → Root → Right)
    public static void inorder(Node root, List<Integer> result) {
        if (root == null)
            return;
        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right, result);
    }

    // Postorder (Left → Right → Root)
    public static void postorder(Node root, List<Integer> result) {
        if (root == null)
            return;
        postorder(root.left, result);
        postorder(root.right, result);
        result.add(root.val);
    }

    // Level order (BFS)
    public static List<Integer> levelOrder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node node = q.poll();
            result.add(node.val);

            if (node.left != null)
                q.add(node.left);
            if (node.right != null)
                q.add(node.right);
        }
        return result;
    }

    // Demo
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 10, 5, 6 };

        Node root = buildTree(arr, 0);

        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        preorder(root, pre);
        inorder(root, in);
        postorder(root, post);

        System.out.println("Preorder: " + pre);
        System.out.println("Inorder: " + in);
        System.out.println("Postorder: " + post);
        System.out.println("Level Order: " + levelOrder(root));
    }
}
