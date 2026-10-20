package greedy.problems;

/*

Indian Coins
    We are given an infinite supply of denominations
    [1, 2, 5, 10, 20, 50, 100, 500, 2000].
    Find min no. of coins / notes to make change for a value V.
    v: 121
    ans : 3 (100+20+1)
    v: 590
    ans : 4 (500+50+20+20)

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {

    public static void main(String[] args) {

        Integer[] coins = {1, 2, 5, 10, 20, 50, 100, 200, 500};

        Arrays.sort(coins, Comparator.reverseOrder());

        int count = 0;
        int amount = 1351;

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    count++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }

        System.out.println("Total min no of coins for  590  : " + count);
        for (int i : ans) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}