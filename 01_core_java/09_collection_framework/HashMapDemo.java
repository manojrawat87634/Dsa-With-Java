import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        // Creating HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Adding data (put)
        map.put(101, "Rahul");
        map.put(102, "Amit");
        map.put(103, "Neha");

        // Printing whole map
        System.out.println("Full Map: " + map);

        // Getting value using key
        System.out.println("Student with Roll 102: " + map.get(102));

        // Checking key existence
        System.out.println("Contains key 101? " + map.containsKey(101));

        // Removing a key
        map.remove(103);

        System.out.println("After Removing 103: " + map);

        // Looping through HashMap
        System.out.println("---- Looping ----");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + " Value: " + map.get(key));
        }
    }
}
