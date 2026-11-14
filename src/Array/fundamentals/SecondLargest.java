package Array.fundamentals;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = {10, 10, 10, 5};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        boolean secondLargestFound = false;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
                secondLargestFound = true;
            } else if (num < largest && (!secondLargestFound || num > secondLargest)) {
                secondLargest = num;
                secondLargestFound = true;
            }
        }
        System.out.println(secondLargest);
    }

}