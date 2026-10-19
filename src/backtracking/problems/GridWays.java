package backtracking.problems;

/*
Find number of ways to reach from
(0,0) to (N-1, M-1) in a NxM Grid.
Allowed moves - right or down.
*/

public class GridWays {

    static int gridWays(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == m - 1) { // condition for last cell
            return 1;
        } else if (i == n || j == n) { // condition for boundary cross
            return 0;
        }

        int w1 = gridWays(i + 1, j, n, m);
        int w2 = gridWays(i, j + 1, n, m);

        return w1 + w2;
    }

    public static void main(String[] args) {
        int n = 5, m = 5;
        System.out.println(gridWays(0, 0, n, m));
    }

    // by using the direct math formula permutation
    // (n-1+m-1)! / (n-1)!(m-1)!
    // give us the tC -> O(n+m) -> linear
}