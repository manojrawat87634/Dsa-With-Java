public class InsertAtHead {
    // Node class
    static class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    // Head pointer of the list
    Node head;

    // Method to insert at head
    public void insertIntoHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to print the list
    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to run the program
    public static void main(String[] args) {
        InsertAtHead list = new InsertAtHead();
        list.insertIntoHead(56);
        list.insertIntoHead(6);
        list.insertIntoHead(68);
        list.insertIntoHead(89);
        list.printLinkedList();  // Output: 89 -> 68 -> 6 -> 56 -> null
    }
}
