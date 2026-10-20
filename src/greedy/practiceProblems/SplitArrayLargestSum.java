package greedy.practiceProblems;

public class SplitArrayLargestSum {
    // check whether we can split the array
    // so that each subarray sum is <= limit
    static boolean canSplit(int[] arr, int k, long limit) {
        int subarrays = 1;
        long currentSum = 0;

        for (int num : arr) {
            // start a new subarray if adding num
            // would exceed the allowed limit
            if (currentSum + num > limit) {
                subarrays++;
                currentSum = num;
            } else {
                currentSum += num;
            }
        }

        // if we need at most k subarrays
        // we can form exactly k when k <= arr.length
        return subarrays <= k;
    }

    static long splitArray(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k < 1 || k > arr.length) {
            throw new IllegalArgumentException("Invalid input");
        }

        long low = 0;
        long high = 0;

        // find binary-search boundaries
        for (int i : arr) {
            low = Math.max(low, i);
            high += i;
        }

        while (low < high) {
            long mid = low + (high - low) / 2;

            if (canSplit(arr, k, mid)) {
                // this limit works . try smaller one
                high = mid;
            } else {
                // this limit is too small
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        int k = 2;

        System.out.println(splitArray(arr, k));
    }
}