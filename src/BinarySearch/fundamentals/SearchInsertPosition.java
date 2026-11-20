package BinarySearch.fundamentals;

public class SearchInsertPosition {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 6};
        int target = 4;

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
                return;
            }
        }
        System.out.println(left);
    }
}
