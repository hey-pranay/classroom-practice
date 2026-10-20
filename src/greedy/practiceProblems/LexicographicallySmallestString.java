package greedy.practiceProblems;

import java.util.Arrays;

public class LexicographicallySmallestString {

    static String findString(int n, int k) {
        // min sum is n (all 'a')
        // max sum is 26 * n (all 'z')

        if (k < n || k > 26 * n) {
            return "Not possible";
        }

        // start with all 'a'
        char[] result = new char[n];

        // Arrays.fill(result, 'a');
        for (int i = 0; i < n; i++) {
            result[i] = 'a';
        }

        // extra value beyond the min sum
        int remaining = k - n;

        // distribute extra value from right to left
        for (int i = n - 1; i >= 0; i--) {
            // each character can gain at most 25
            int add = Math.min(25, remaining);
            result[i] = (char) (result[i] + add);
            remaining -= add;

            if (remaining == 0) {
                break;
            }
        }
        return new String(result);
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 42;

        System.out.println(findString(n, k));

    }

}