package Array.fundamentals;

public class MaximumSumSubarrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 1};
        int k = 3;

        int windowSum = 0;
        int maxSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, windowSum);

        }

        System.out.println(maxSum);
    }
}
