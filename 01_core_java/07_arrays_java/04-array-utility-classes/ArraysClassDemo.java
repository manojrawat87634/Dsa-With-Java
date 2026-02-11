import java.util.Arrays;

public class ArraysClassDemo {

    public static void main(String[] args) {

        int[] arr = { 5, 2, 9, 1, 7 };

        // Print array
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Sort array
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // Binary Search (array must be sorted)
        int index = Arrays.binarySearch(arr, 5);
        System.out.println("Index of 5: " + index);

        // Fill array
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 10);
        System.out.println("Filled Array: " + Arrays.toString(filledArray));

        // Copy array
        int[] copiedArray = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));

        // Compare arrays
        boolean isEqual = Arrays.equals(arr, copiedArray);
        System.out.println("Arrays equal: " + isEqual);
    }
}
