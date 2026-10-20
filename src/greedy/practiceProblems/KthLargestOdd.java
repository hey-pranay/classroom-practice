package greedy.practiceProblems;

public class KthLargestOdd {

    static int findKthLargestOdd(int L, int R, int K) {
        int largestOdd = (R % 2 != 0) ? R : R - 1;

        if (largestOdd < L) {
            return 0;
        }

        int count = (largestOdd - L) / 2 + 1;

        if (K > count || K <= 0) {
            return 0;
        }

        return largestOdd - 2 * (K - 1);
    }

    public static void main(String[] args) {
        int L = -3;
        int R = 10;
        int K = 3;

        System.out.println(findKthLargestOdd(L, R, K));
    }
}