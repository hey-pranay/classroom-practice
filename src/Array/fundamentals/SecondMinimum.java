package Array.fundamentals;

public class SecondMinimum {
    public static void main(String[] args) {
        int[] arr = {10, 8, 2, -5, 20};

        int minimum = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        boolean secondMinFound = false;

        for (int num : arr) {
            if (num < minimum) {
                secondMin = minimum;
                minimum = num;
                secondMinFound = true;
            } else if (num > minimum && (!secondMinFound || num < secondMin)) {
                secondMin = num;
            }
        }
        System.out.println(secondMin);


    }
}