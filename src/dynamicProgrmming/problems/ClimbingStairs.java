package dynamicProgrmming.problems;

import java.util.Arrays;

/*
    Count ways to reach the nth stair.
    The person can climb either 1 stair or 2 stairs at a time.
*/
public class ClimbingStairs {

    // recursive way
    static int countWays(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        return countWays(n - 1) + countWays(n - 2);
    }

    // memoization : O(n)
    static int countWaysM(int n, int[] dp) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = countWays(n - 1) + countWays(n - 2) ;

        return dp[n];

    }


    // tabulation : O(n)
    static int countWaysT(int n) {
        int[] dp = new int[n + 1];

        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(countWays(n));

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(countWaysM(n, dp));

        System.out.println(countWaysT(n));
    }

}