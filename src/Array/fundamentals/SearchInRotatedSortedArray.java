package Array.fundamentals;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            //  1. check whether the element is the target
            if (arr[mid] == target) {
                System.out.println(mid);
                return;
            }

            // 2. check whether the left half is sorted
            if (arr[left] <= arr[mid]) {

                // 3 check whether the taget is in left half
                if (target >= arr[left] && target < arr[mid]) {
                    // taget is in the left half
                    right = mid - 1;
                } else {
                    //target is in the right half
                    left = mid + 1;
                }
            } else {
                // 4. check whether the target is in right half
                if (target > arr[mid] && target <= arr[right]) {
                    // target is in the right half
                    left = mid + 1;
                } else {
                    //target is in the left half
                    right = mid - 1;
                }
            }

        }
        System.out.println("not found");
    }
}
