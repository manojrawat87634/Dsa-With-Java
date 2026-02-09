public class Q17_MaxInArray {

    static int findMax(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }

        int maxOfRest = findMax(arr, index + 1);
        return Math.max(arr[index], maxOfRest);
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 1, 7};
        System.out.println(findMax(arr, 0)); // 9
    }
}
