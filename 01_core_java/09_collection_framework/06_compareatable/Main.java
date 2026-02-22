import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        Comparator<Integer> c = new Comparator<>() {
          @Override
          public int compare(Integer a, Integer b){
            return b - a;
          }  
        };
        arr.add(23);
        arr.add(12);
        arr.add(21);
        arr.add(42);
        arr.add(52);
        arr.add(2);
        Collections.sort(arr, c);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}