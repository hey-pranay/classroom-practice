package Array.fundamentals;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {7, 8, 10};
        int start = arr[0];
        int end = arr[arr.length - 1];

        int actualSum = 0;
        for (int i : arr) {
            actualSum += i;
        }

        int expectedSum = ((start + end) * (end - start + 1)) / 2;

        int missingNo = expectedSum - actualSum;
        System.out.println(missingNo);
    }
}
