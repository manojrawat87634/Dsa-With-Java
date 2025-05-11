class Node {
    String data;
    Node next;

    Node(String value) {
        this.data = value;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    void insertAtHead(String value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    void insertAtTail(String value) {
        Node newNode = new Node(value);
        Node temp = head;
        if (head == null) {
            insertAtHead(value);
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void insertAtNth(String value, int index) {
        if (index < 0) {
            System.out.println("Invalid Index");
            return;
        }
        if (index == 0){
            insertAtHead(value);
            return;
        }
        Node temp = head;
        Node newNode = new Node(value);
        if (head == null && index == 0) {
            insertAtHead(value);
            return;
        }
        for (int i = 1; i <= index - 1; i++) {
            if (temp == null) {
                System.out.println("Index Out Of Bound");
                return;
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    void deleteFromTail() {
        if (head == null) {
            System.out.println("List Is empty!!");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    void deleteFromHead() {
        if (head == null) {
            System.out.println("List is Null");
            return;
        }

        if (head.next == null) {
            head = null;
        }

        head = head.next;
    }

    void deleteFromNthPosition(int index) {

        if (index < 0) {
            System.out.println("Invalid Index");
            return;
        }

        if (index == 0) {
            deleteFromHead();
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        if (temp.next == null || temp == null) {
            System.out.println("Index Out of bound");
            return;
        }
        temp.next = temp.next.next;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtHead("C");
        list.insertAtHead("B");
        list.insertAtHead("A");

        list.insertAtTail("X");
        list.insertAtTail("Y");
        list.insertAtTail("Z");

        list.insertAtNth("D", 3);
        list.printList();
    }
}