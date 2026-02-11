    import java.util.Comparator;
    import java.util.PriorityQueue;
    import java.util.Queue;
    public class PriorityQueueDemo {
        public static void main(String[] args) {
             Comparator<Integer> comp = (a, b) -> b - a;
             System.out.println("9 : " + comp.compare(10, 20));
            // 1. Create PriorityQueue (min-heap by default)
            Queue<Integer> pq = new PriorityQueue<>();
            // 2. Insert elements
            pq.offer(30);
            pq.offer(10);
            pq.offer(20);
            pq.offer(5);
            System.out.println("PriorityQueue: " + pq);
            // 3. Peek -> smallest element
            System.out.println("Highest priority (peek): " + pq.peek());
            // 4. Poll -> removes smallest element
            System.out.println("Removed element: " + pq.poll());
            System.out.println("After removal: " + pq);
            // 5. Poll all elements (sorted order)
            System.out.println("Polling all elements:");
            while (!pq.isEmpty()) {
                System.out.println(pq.poll());
            }
        }
    }
