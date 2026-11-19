package Array.fundamentals;

public class LongestSubarraySumWithGivenSum {
    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 1, 1, 3, 2};

        int k = 6;
        int maxLength = 0;

        /*
        // approach : traversal
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum == k) {
                    int length = j - i + 1;
                    maxLength = Math.max(maxLength, length);
                }
            }
        }
        */

        // approach : sliding window

        int left = 0;
        int sum = 0;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                int length = right - left + 1;
                maxLength = Math.max(maxLength, length);
            }

        }

        System.out.println(maxLength);
    }
}
