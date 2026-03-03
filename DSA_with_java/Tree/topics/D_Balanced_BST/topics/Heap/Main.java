package D_Balanced_BST.topics.Heap;

class Heap {

    int[] heap;
    int size;
    int capacity;

    Heap(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity];
        this.size = 0;
    }

    // Get parent index
    int parent(int i) {
        return (i - 1) / 2;
    }

    // Get left child index
    int leftChild(int i) {
        return 2 * i + 1;
    }

    // Get right child index
    int rightChild(int i) {
        return 2 * i + 2;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == capacity;
    }
}

public class Main {
    public static void main(String[] args) {

        Heap heap = new Heap(10);
        heap.isEmpty();
        System.out.println("Heap created successfully.");
    }
}