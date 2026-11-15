package Array.fundamentals;

public class RightRotateAnArrayByOnePosition {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        if (arr.length == 0) {
            System.out.println("empty array");
            return;
        }

        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}