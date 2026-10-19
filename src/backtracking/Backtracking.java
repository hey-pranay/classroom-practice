package backtracking;

public class Backtracking {

    // backtracking on array
    static void changeArr(int[] arr, int idx, int val) {
        // base case
        if (idx == arr.length) {
            printArr(arr);
            return;
        }

        // recursion
        arr[idx] = val;
        changeArr(arr, idx + 1, val + 1); // recursion call
        arr[idx] = arr[idx] - 2; // backtracking step : always after the recursion call

    }

    static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        printArr(arr);
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}