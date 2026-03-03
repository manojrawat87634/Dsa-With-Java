package D_Balanced_BST.topics.Heap.topics.heap_array_representation;


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

    // Insert without heap logic (just structure demo)
    void add(int value) {
        if (size == capacity) {
            System.out.println("Heap is full");
            return;
        }
        heap[size] = value;
        size++;
    }

    void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Heap heap = new Heap(10);

        heap.add(10);
        heap.add(20);
        heap.add(30);
        heap.add(40);
        heap.add(50);

        heap.printHeap();
    }
}