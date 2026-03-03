package D_Balanced_BST.topics.Heap.topics.min_heap;

class MinHeap {
    int[] heap;
    int size;
    int capacity;

    MinHeap(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity];
        this.size = 0;
    }

    int parent(int i) {
        return (i - 1) / 2;
    };

    int leftChild(int i) {
        return 2 * i + 1;
    };

    int rightChild(int i) {
        return 2 * i + 2;
    };

    void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap is full");
            return;
        }
        heap[size] = value;
        heapifyUp(size); // ← call heapifyUp to restore heap property
        size++;
    }

    int extractMin() {
        if (size == 0) {
            return -1;
        }
        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return min;
    }

    void heapifyDown(int index) {
        int smallest = index;
        int left = leftChild(index);
        int right = rightChild(index);
        if (left < size && heap[left] < heap[smallest]) {
            smallest = left;
        }
        if (right < size && heap[right] < heap[smallest]) {
            smallest = right;
        }
        if (smallest != index) {
            swap(index, smallest);
            heapifyDown(smallest);
        }
    }

    void heapifyUp(int index) {
        if (index == 0)
            return;
        int p = parent(index);

        if (heap[index] < heap[p]) {
            swap(p, index);
            heapifyUp(p);
        }
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
        MinHeap heap = new MinHeap(10);

        heap.insert(10);
        heap.insert(5);
        heap.insert(20);
        heap.insert(3);
        heap.insert(7);

        System.out.print("Heap array: ");
        heap.printHeap();

        System.out.println("Extracted Min: " + heap.extractMin());
        System.out.print("Heap after extract: ");
        heap.printHeap();
    }
}
