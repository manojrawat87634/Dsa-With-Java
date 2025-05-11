class Node {
    String data;
    Node next;

    Node(String value) {
        this.data = value;
        this.next = null;
    }
}

public class DeleteLinkedList {
    Node head;

    void deleteHead() {

        if (head == null) {
            System.out.println("This is list is Empty");
            return;
        }

        if (head != null && head.next == null) {
            head = null; // The list will be empty
            return;
        }

        head = head.next;
    }

    void deleteFromTail() {
        if (head == null) {
            return;
        }
        if (head.next == null){
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    void deleteFromNthPosition(int index) {
        if (index < 0) {
            System.out.println("Invalid Index");
            return;
        }
    
        if (head == null) {
            System.out.println("This list is empty");
            return;
        }
        if (index == 0){
            deleteHead();
        }
        Node temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Invalid index: No such node to delete");
            return;
        }

        temp.next = temp.next.next;
    }
}
