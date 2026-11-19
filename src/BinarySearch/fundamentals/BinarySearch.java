package BinarySearch.fundamentals;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                System.out.println(mid);
                break;
            }
        }

    }
}
