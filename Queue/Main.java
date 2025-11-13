import java.util.LinkedList;
import java.util.Queue;

public class Main {
  public static void main(String[] args) {
      Queue <Integer> q = new LinkedList<>(); 
      System.out.print(q.isEmpty());
      q.offer(1);
      q.offer(11);
      q.offer(22);
      q.offer(33);
      q.offer(44);
      q.add(55);

      System.out.println(q);
      // q.poll();
      // q.poll();
      // q.poll();
      // q.poll();
      // q.poll();
      // q.poll();
      // q.poll();
      // q.poll();
      // q.poll();
      // q.poll();
      // q.poll();
      // q.remove();
      // q.remove();
      // q.remove();
      // q.remove();
      // q.remove();
      // q.remove();
      // System.out.print(q.size());
      // System.out.print(q.isEmpty());
      // System.out.println(q.peek());
      // System.out.println(q);
  } 
}