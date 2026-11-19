package Array.fundamentals;

public class TwoSumSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 9};
        int target = 15;

        int left = 0;
        int right = arr.length - 1;



        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println(left);
                System.out.println(right);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(" no combination found");


    }
}