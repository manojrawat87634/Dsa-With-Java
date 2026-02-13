class Node<T> {

    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}


public class GenericsDemo {
    public static void main(String[] args) {

        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);

        n1.next = n2;

        System.out.println(n1.data);
        System.out.println(n1.next.data);
    }
}
