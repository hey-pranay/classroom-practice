package Array.fundamentals;

public class MoveZerosToStart {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 13};

        int slow = arr.length - 1;

        for (int fast = arr.length - 1; fast >= 0; fast--) {
            if (arr[fast] != 0) {
                arr[slow] = arr[fast];
                slow--;
            }
        }

        for (int i = slow; i > 0; i--) {
            arr[i] = 0;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}