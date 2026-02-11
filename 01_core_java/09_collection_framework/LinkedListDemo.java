import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {

        // 1. Creating LinkedList using List reference
        List<Integer> list = new LinkedList<>();

        // 2. Add elements
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Initial List: " + list);

        // 3. Access element by index
        System.out.println("Element at index 1: " + list.get(1));

        // 4. Update element
        list.set(1, 99);
        System.out.println("After update: " + list);

        // 5. Remove element
        list.remove(0);
        System.out.println("After removal: " + list);

        // 6. Size
        System.out.println("Size: " + list.size());

        // 7. Iteration
        System.out.println("Iterating:");
        for (int num : list) {
            System.out.println(num);
        }

        /*
         IMPORTANT NOTE:
         LinkedList ALSO supports stack and queue operations
         but only when referenced as LinkedList, not List
        */

        LinkedList<Integer> ll = new LinkedList<>();

        // Queue operations
        ll.offer(10);   // add at end
        ll.offer(20);
        ll.poll();      // remove from front

        // Stack operations
        ll.push(100);   // add at front
        ll.pop();       // remove from front

        System.out.println("LinkedList after stack/queue ops: " + ll);
    }
}
