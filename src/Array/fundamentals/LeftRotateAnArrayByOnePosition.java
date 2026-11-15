package Array.fundamentals;

public class LeftRotateAnArrayByOnePosition {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        if (arr.length == 0) {
            System.out.println("empty array");
            return;
        }

        int first = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}