public class SimpleQueue {
    private int[] queue;
    private int size, rear, front;

    SimpleQueue(int capacity) {
        this.queue = new int[capacity];
        // [_, _, _, _, _]
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }

    public boolean offer(int value) {
        if (this.size == queue.length) {
            return false;
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        size++;
        return true;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % queue.length] + " ");
        }
    }

    public int poll() {
        if (this.size == 0) {
            return -1;
        }
        int item = queue[front];
        this.size--;
        return item;
    }

    public int peek() {
        if (size == 0) {
            return -1;
        }
        return queue[front];
    }

    public static void main(String[] args) {
        SimpleQueue q = new SimpleQueue(5);
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        q.offer(6);
        q.poll();
        q.offer(7);
        q.offer(8);
        q.offer(9);
        q.printQueue();
        q.poll();   
    }
}