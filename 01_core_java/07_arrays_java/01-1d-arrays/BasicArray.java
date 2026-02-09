public class BasicArray {

    public static void main(String[] args) {

        // Declaration
        int[] arr;

        // Initialization
        arr = new int[5];

        // Assigning values
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // Accessing elements
        System.out.println("First element: " + arr[0]);
        System.out.println("Last element: " + arr[arr.length - 1]);

        // Array length
        System.out.println("Array length: " + arr.length);
    }
}
