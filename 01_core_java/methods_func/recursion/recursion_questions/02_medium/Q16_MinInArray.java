public class Q16_MinInArray {

    static int findMin(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }

        int minOfRest = findMin(arr, index + 1);
        return Math.min(arr[index], minOfRest);
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 1, 7};
        System.out.println(findMin(arr, 0)); // 1
    }
}
