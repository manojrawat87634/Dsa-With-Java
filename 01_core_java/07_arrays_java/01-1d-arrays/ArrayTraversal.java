public class ArrayTraversal {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        // Using for loop
        System.out.println("Traversal using for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Using enhanced for loop
        System.out.println("Traversal using enhanced for loop:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
