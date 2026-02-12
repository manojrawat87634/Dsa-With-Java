import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        // Creating HashSet
        HashSet<String> set = new HashSet<>();
        // Adding elements
        set.add("Rahul");
        set.add("Amit");
        set.add("Neha");
        set.add("Rahul");  // Duplicate

        // Printing HashSet
        System.out.println("HashSet Elements: " + set);

        // Checking if element exists
        System.out.println("Contains Amit? " + set.contains("Amit"));

        // Removing element
        set.remove("Neha");

        System.out.println("After Removing Neha: " + set);

        // Looping through HashSet
        System.out.println("---- Looping ----");
        for (String name : set) {
            System.out.println(name);
        }
    }
}
