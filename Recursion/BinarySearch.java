package Recursion;

public class BinarySearch {
    // 51

    // 1, 2, 3, ... 100 
    // 1.. 49, 50 , 51.. 100

    public static int binaryS(int [] arr, int left, int right, int target){
        int mid = left + (right - left) / 2;

        // Base 
        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]){
            return binaryS(arr, left, mid - 1, target);
        }
        if (target > arr[mid]){
            return binaryS(arr, mid + 1, right, target);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int index = binaryS(arr, 0, arr.length - 1, 14);
        if (index == -1){
            System.out.print("Element Not Found");
        }
        else{
            System.out.print("Element Found at index"  + index);
        }
    }
}
