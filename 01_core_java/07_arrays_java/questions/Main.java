import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = { 12, 4, 56, 78, 9, 12 };
        int min = arr[0];
        int s_min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                s_min = min;
                min = arr[i];
            } else if (arr[i] < s_min) {
                s_min = arr[i];
            }
        }
        System.out.println(s_min);
    }
}