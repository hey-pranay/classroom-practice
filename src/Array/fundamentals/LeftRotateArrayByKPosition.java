package Array.fundamentals;

public class LeftRotateArrayByKPosition {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int k = 5;

        if (arr.length == 0) {
            System.out.println("empty array");
            return;
        }

        k = k % arr.length;

        /*
        // approach 1 : brute force
        for (int j = 0; j < k; j++) {
            int first = arr[0];

            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[arr.length - 1] = first;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
*/

        /*
        // approach 2 : Temporary Array approach
        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        for (int i = k; i < arr.length; i++) {
            arr[i-k] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            arr[arr.length - k + i] = temp[i];
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

        */

        // approach 3
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }


    // approach 3 : Reversal Algorithm
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
