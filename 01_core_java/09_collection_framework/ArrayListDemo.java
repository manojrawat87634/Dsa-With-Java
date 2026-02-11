import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        // 1. Create ArrayList (programming to interface)
        List<Integer> list = new ArrayList<>();

        // 2. Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20); // duplicate allowed

        System.out.println("Initial List: " + list);

        // 3. Get element by index
        System.out.println("Element at index 1: " + list.get(1));

        // 4. Update element
        list.set(2, 99);
        System.out.println("After update: " + list);

        // 5. Remove element
        list.remove(1); // removes index 1
        System.out.println("After removal: " + list);

        // 6. Size of ArrayList
        System.out.println("Size: " + list.size());

        // 7. Check element existence
        System.out.println("Contains 20? " + list.contains(20));

        // 8. Iterate using for-each loop
        System.out.println("Iterating elements:");
        for (int num : list) {
            System.out.println(num);
        }
    }
}
