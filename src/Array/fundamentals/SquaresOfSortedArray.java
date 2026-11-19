package Array.fundamentals;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-7, -3, 2, 3, 11};

        int[] result = new int[nums.length];

        int index = result.length - 1;


        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[index] = nums[left] * nums[left];
                left++;
            } else {
                result[index] = nums[right] * nums[right];
                right--;
            }

            index--;
        }

        for (int i : result) {
            System.out.print(i + " ");
        }

    }
}