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
    private Node root;

    void leftRotate(Node x){
        Node y = x.right;
        x.right = y.left;
        if (x.parent == null){
            root = y;
        }
        y.parent = x.parent;
        if (x == x.parent.left){
            x.parent.left = y;
        }
        else if (x == x.parent.right){
            x.parent.right = y;
        }
        y.left = x;
        x.parent = y;
    }

    void rightRotate(Node x){
        Node y = x.left;
        x.left = y.right;

        if (x.parent == null){
            root = y;
        }
        y.parent = x.parent;
        if (x == x.parent.right){
            x.parent.right = y;
        }
        else if (x == x.parent.left){
            x.parent.left = y;
        }

        y.right = x;
        x.parent = y;

    }
    void insert(int key){
        Node node = new Node(key);
        Node parent = null;
        Node current = this.root;
        while (current != null){
            parent = current;
            if (key > current.data){
                current = current.right;
            }
            else{
                current = current.left;
            }
        }

        node.parent = parent;
        if (parent == null){
            root = node;
        }
        else if (node.data < parent.data){
            parent.left = node;
        }
        else {
            parent.right = node;
        }

    }
    void buildTree(int arr[]){
        for (int i : arr){
            insert(i);
        }
    }
    void _inorder(){
        inorder(root);
    }
    private void inorder(Node node){
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + ", ");
        inorder(node.right);
    }
}
public class Main {
    public static void main(String[] args) {
    int arr [] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        RedBlackTree tree = new RedBlackTree();
        tree.buildTree(arr);
        tree._inorder();
    }
}
