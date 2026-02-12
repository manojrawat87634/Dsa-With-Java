import java.util.PriorityQueue;
import java.util.Comparator;

public class DescPriorityQueueDemo {

    public static void main(String[] args) {

        // Descending Priority Queue
        PriorityQueue<Integer> pq =
        new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(10);
        pq.add(30);
        pq.add(20);
        pq.add(5);
        System.out.println("Removing elements:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
