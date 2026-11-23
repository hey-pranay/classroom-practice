package Array.fundamentals;

public class SearchInRotatedSortedArrayII {
    public static boolean search(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Step 1: Check if target is found
            if (arr[mid] == target) {
                return true;
            }

            // Step 2: Handle duplicates
            if (arr[left] == arr[mid] && arr[mid] == arr[right]) {
                left++;
                right--;
            }

            // Step 3: Check if the left half is sorted
            else if (arr[left] <= arr[mid]) {

                // Step 4: Check if target lies in the left half
                if (target >= arr[left] && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            // Step 5: Otherwise, the right half is sorted
            else {

                // Check if target lies in the right half
                if (target > arr[mid] && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        // Target was not found
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 6, 0, 0, 1, 2};
        int target = 0;

        System.out.println(search(arr, target));
    }

}
