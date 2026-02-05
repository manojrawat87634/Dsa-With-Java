import java.util.*;

class LongestZeroSumSubarray {
    public static int longestZeroSumSubarray(int[] arr) {
        // HashMap to store first occurrence of prefix sums
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            
            if (prefixSum == 0) {
                maxLen = i + 1;
            }
            if (map.containsKey(prefixSum)) {
                // Calculate length of subarray between previous index +1 and current i
                int len = i - map.get(prefixSum);
                if (len > maxLen) {
                    maxLen = len;
                }
            } else {
                // Store first occurrence of this prefix sum
                map.put(prefixSum, i);
            }
        }
        return maxLen;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 2, -3, 3, 1, -1, 2 };
        int result = LongestZeroSumSubarray.longestZeroSumSubarray(arr);
        System.out.println("Length of longest subarray with sum 0: " + result);
    }
}