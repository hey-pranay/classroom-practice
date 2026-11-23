package Array.fundamentals;

public class FindPeakElement {

    static int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }


    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 4, 2};

        int result = findPeakElement(nums);
        System.out.println("index : " + result);
        System.out.println("value : " + nums[result]);


    }

}
