package Array.fundamentals;

public class FindMinimum {
    public static void main(String[] args) {
        int[] arr = {12, 45, 23, 67, 89, 10};

        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        // find minimum
        int min = Integer.MAX_VALUE;

        for (int num : arr) {
            if (min > num) {
                min = num;
            }
        }

        System.out.println(min);
    }
}