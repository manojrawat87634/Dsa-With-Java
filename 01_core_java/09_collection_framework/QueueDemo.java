import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // 1. Create Queue (program to interface)
        Queue<Integer> queue = new LinkedList<>();
        // 2. add / offer -> insert at rear
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println("Queue after insertion: " + queue);
        // 3. peek -> view front element (no removal)
        System.out.println("Front element (peek): " + queue.peek());
        // 4. poll -> remove front element (FIFO)
        int removed = queue.poll();
        System.out.println("Removed element: " + removed);
        System.out.println("Queue after removal: " + queue);
        // 5. size
        System.out.println("Queue size: " + queue.size());
        // 6. isEmpty
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
