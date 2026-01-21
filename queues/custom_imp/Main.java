import java.util.ArrayList;

class MyPriorityQueue {
    private ArrayList<Integer> heap;

    public MyPriorityQueue() {
        heap = new ArrayList<>();
    }

    void insert(int value) {
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }

    int poll() {
        if (heap.isEmpty())
            return -1;
        int root = heap.get(0);
        int lastValue = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, lastValue);
            heapifyDown(0);
        }
        return root;
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap.get(index) < heap.get(parent)) {
                swap(index, parent);
                index = parent;
            } else {
                break;
            }
        }
    }

    boolean isEmpty() {
        return heap.isEmpty();
    }

    private void heapifyDown(int index) {
        int size = heap.size();
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int smallest = index;
        if (left < size && heap.get(left) < heap.get(smallest)) {
            smallest = left;
        }
        if (right < size && heap.get(right) < heap.get(smallest)) {
            smallest = right;
        }
        if (smallest != index) {
            swap(smallest, index);
            heapifyDown(smallest);
        }
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

}

public class Main {
    public static void main(String[] args) {
        MyPriorityQueue q = new MyPriorityQueue();
        q.insert(23);
        q.insert(25);
        q.insert(53);
        q.insert(64);
        q.insert(85);
        q.insert(95);
        q.insert(15);
        q.insert(5);
        while (!q.isEmpty()) {
            System.out.print(q.poll());
            System.out.print(", ");
        }
    }
}