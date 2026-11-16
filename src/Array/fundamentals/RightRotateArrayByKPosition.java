package Array.fundamentals;

public class RightRotateArrayByKPosition {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int k = 2;

        if (arr.length == 0) {
            System.out.println("array is empty");
            return;
        }

        k = k % arr.length;

        // todo : approach 1 - brute force

        // todo : approach 2 - temporary array

        // reversal algorithm approach : optimized

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

}
