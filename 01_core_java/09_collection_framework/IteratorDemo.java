import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class IteratorDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Map<String, String> data = new HashMap<>();
        data.put("A", "Manoj");
        data.put("B", "Redima Sharma");
        Iterator<Map.Entry<String, String>> mpItr = data.entrySet().iterator();
        while (mpItr.hasNext()){
             Map.Entry<String, String> entry = mpItr.next();

            System.out.print(entry.getKey() + " : ");
            System.out.println(entry.getValue());
        }
        list.add("Rahul");
        list.add("Amit");
        list.add("Neha");
        // Creating Iterator
        
        Iterator<String> itr = list.iterator();
        // Traversing using Iterator
        System.out.println("Using Iterator:");

        while (itr.hasNext()) {
            String name = itr.next();
            System.out.println(name);
        }
    }
}
