public class CommonOperations {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        int sum = 0;
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Sum of elements: " + sum);
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
