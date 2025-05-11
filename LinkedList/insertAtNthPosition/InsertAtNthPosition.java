class Node {
    String data;
    Node next;

    Node (String value){
        this.data = value;
        this.next = null;
    }
}

public class InsertAtNthPosition {
    Node head;
    void insertAtNth(String value, int index){
        if (index < 0){
            System.out.println("Invalid Index");
            return;
        }
        Node newNode = new Node(value);

        if (index == 0){
            newNode.next = head; 
              head = newNode;
              return;
        }
        Node temp = head;
        for (int i = 1; i <= index - 1; i++){
            if (temp == null){
                System.out.println("Index out of bounds");
                
                return;
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void printList (){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
       InsertAtNthPosition list = new InsertAtNthPosition();
       list.insertAtNth("A", 0);
       list.insertAtNth("B", 10);
       list.insertAtNth("C", 1);
       list.insertAtNth("D", 1);
       list.insertAtNth("E", 1);
       list.insertAtNth("F", 2);
       list.insertAtNth("G", 4);
       list.printList();
    }    
}
