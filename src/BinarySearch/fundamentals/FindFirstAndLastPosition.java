package BinarySearch.fundamentals;

import java.util.Arrays;

public class FindFirstAndLastPosition {


    public static int firstOccurrence(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                ans = mid;
                right = mid - 1;
            }
        }
        return ans;
    }

    public static int lastOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                ans = mid;
                left = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 4, 7};
        int target = 4;

        int first = firstOccurrence(arr, target);
        int last = lastOccurrence(arr, target);

        int[] ans = {first, last};

        System.out.println(Arrays.toString(ans));


    }

}
