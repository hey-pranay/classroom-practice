package Array.fundamentals;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 4, 5};

        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int slow = 0;

        for (int fast = 1; fast < arr.length; fast++) {
            if (arr[fast] != arr[slow]) {
                slow++;
                arr[slow] = arr[fast];
            }
        }

        for (int i = 0; i < slow + 1; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}