package backtracking.practiceProblems;

import java.util.ArrayList;
import java.util.List;

public class RatInMaze {

    static int n;

    static List<String> result = new ArrayList<>();

    static int[] rowMove = {-1, 1, 0, 0,}; // U,D,L,R
    static int[] colMove = {0, 0, -1, 1,}; // U,D,L,R
    static char[] direction = {'U', 'D', 'L', 'R'};

    static boolean isSafe(
            int[][] maze,
            boolean[][] visited,
            int row,
            int col
    ) {
        // check maze boundaries
        if (row < 0 || col < 0 || row >= n || col >= n) {
            return false;
        }

        // reject blocked cells
        if(maze[row][col] == 0){
            return false;
        }

        // already visited in current path
        if (visited[row][col]) {
            return false;
        }

        return true;
    }

    static void solve(
            int[][] maze,
            boolean[][] visited,
            int row,
            int col,
            StringBuilder path
    ) {
        // base case : destination reached
        if (row == n - 1 && col == n - 1) {
            result.add(path.toString());
            return;
        }

        // mark the current cell
        visited[row][col] = true;

        // try U, D, L, R
        for (int i = 0; i < 4; i++) {
            int nextRow = row + rowMove[i];
            int nextCol = col + colMove[i];

            if (isSafe(maze, visited, nextRow, nextCol)) {
                // choose : add the direction
                path.append(direction[i]);

                // explore : move to the next cell
                solve(maze, visited, nextRow, nextCol, path);

                // undo : remove the last direction
                path.deleteCharAt(path.length() - 1);
            }
        }

        // backtrack : unmark the cell
        visited[row][col] = false;
    }

    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 1, 1},
                {0, 1, 1, 1},
                {1, 1, 1, 1}
        };

        n = maze.length;
        boolean[][] visited = new boolean[n][n];

        if (maze[0][0] == 1) {
            solve(maze, visited, 0, 0, new StringBuilder());
        }

        if (result.isEmpty()) {
            System.out.println("No path exists");
        } else {
            System.out.println("All possible paths: ");
            System.out.println("Total possible paths: " + result.size());
            for (String path : result) {
                System.out.println(path);
            }
        }
    }
}