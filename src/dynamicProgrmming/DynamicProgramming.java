package dynamicProgrmming;

public class DynamicProgramming {
    // Fibonacci problem using dp

    // approach 1 : memoization (top down)
    static int fib1(int n, int[] dp) { // linear O(n)
        if (n <= 1) {
            return n;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = fib1(n - 1, dp) + fib1(n - 2, dp);
        return dp[n];
    }


    // approach 2 : tabulation  (bottom up) // O(n)
    static int fibTabulation(int n) {

        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;

        int[] dp = new int[n + 1];
        System.out.println(fib1(n, dp));
        System.out.println(fibTabulation(6));

    }
}