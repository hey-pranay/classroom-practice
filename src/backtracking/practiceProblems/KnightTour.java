package backtracking.practiceProblems;


public class KnightTour {

    // all 8 possible knight moves
    static int[] rowMove = {-2, -2, -1, -1, 1, 1, 2, 2};
    static int[] colMove = {-1, 1, -2, 2, -2, 2, -1, 1};

    static boolean solve(int[][] board, int row, int col, int movNo) {
        int n = board.length;

        // base case : every sq has been visited
        if (movNo == n * n) {
            return true;
        }

        // try all 8 knight moves
        for (int i = 0; i < 8; i++) {
            int nextRow = row + rowMove[i];
            int nextCol = col + colMove[i];

            // check whether the next position is valid
            if (nextRow >= 0 && nextCol >= 0 && nextRow < n && nextCol < n && board[nextRow][nextCol] == -1) {
                // choose : mar this sq with the move no
                board[nextRow][nextCol] = movNo;

                // explore : continue from the new sq
                if (solve(board, nextRow, nextCol, movNo + 1)) {
                    return true;
                }

                // undo: this choice did not lead to a complete tour
                board[nextRow][nextCol] = -1;
            }
        }

        // no move from this sq leads to a sol
        return false;
    }

    public static void main(String[] args) {
        int n = 8;
        int[][] board = new int[n][n];

        // mark every sq as unvisited
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                board[row][col] = -1;
            }
        }

        // start at the top-left corner with move no 0
        board[0][0] = 0;

        if (solve(board, 0, 0, 1)) {
            System.out.println("Knight tour : ");

            for (int[] row : board) {
                for (int cell : row) {
                    System.out.printf("%2d ", cell);
                }
                System.out.println();
            }
        } else {
            System.out.println("no tour found");
        }
    }

}