package Array.fundamentals;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};


        int slow = 0;

        for (int fast = 0; fast < arr.length; fast++) {
            if (arr[fast] != 0) {
                arr[slow] = arr[fast];
                slow++;
            }
        }

        for (int i = slow; i < arr.length; i++) {
            arr[i] = 0;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}