class Node{
    String data;
    Node next;
    Node(String value){
        this.data = value;
        this.next = null;
    }
}

public class InsertAtTail {
    Node head;
    void insertAtEnd(String value){
        Node newNode = new Node(value);
        if (head == null){
            head = newNode;
            return;
        }
        
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    };

    void printLinkedList (){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
       InsertAtTail list = new InsertAtTail();
       list.insertAtEnd("A");
       list.insertAtEnd("B");
       list.insertAtEnd("C");
       list.insertAtEnd("D");
       list.insertAtEnd("F");
       list.printLinkedList();
    }
}
