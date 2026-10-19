package greedy.problems;

/*

Fractional Knapsack
    Given the weights and values of N items, put these items in a knapsack of
    capacity W to get the maximum total value in the knapsack.

    value [60, 100, 120]
    weight [10, 20, 30]
    w: 50
    ans = 240

*/

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] val = {60, 100, 120};
        int[] weight = {10, 20, 30};
        int W = 50;

        double[][] ratio = new double[val.length][2];

        for (int i = 0; i < ratio.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }

        // ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(a -> a[1]));

        int capacity = W;
        int finaVal = 0;

        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {
                finaVal += val[idx];
                capacity -= weight[idx];
            } else {
                finaVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }

        System.out.println("Final val : " + finaVal);
    }
}