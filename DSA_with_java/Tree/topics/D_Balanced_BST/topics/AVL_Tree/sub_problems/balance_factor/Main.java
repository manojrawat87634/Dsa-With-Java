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

class AVL_Tree{
    private Node root;
    void insert(int value){
        root = insertRec(root, value);
    }
    
    Node insertRec(Node root, int _pval){
        if (root == null)  return new Node(_pval); 
        if (_pval > root.data){
            root.right = insertRec(root, _pval);
        }
        else if (_pval < root.data){
            root.left = insertRec(root, _pval);
        }
        root.height = 1 + Math.max(height(root.left), height(root.right));
        return root;
    }

    int getBalance(Node root){ 
        return root == null ? 0 : height(root.left) - height(root.right);  
    }
    
    int height(Node r){
        return  r == null ? 0 : r.height;
    }
}



public class Main {
    
}
