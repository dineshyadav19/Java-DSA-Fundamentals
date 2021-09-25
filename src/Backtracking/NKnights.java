package Backtracking;

public class NKnights {
    public static void main(String[] args) {
        boolean[][] board = new boolean[3][3];
        Nknights(board, 0, 0, 0, board.length, "");
    }

    static int count = 0;
    public static void Nknights(boolean[][] board, int row, int col, int kpsf, int total, String ans){
        //kpsf -> knights placed so far

        //base case
        if(kpsf == total){
            System.out.println(++count + "." + ans);
            return;
        }

        //- base case
        if(col == board[0].length){
            row++;
            col=0;
        }

        if(row == board.length)
            return;

        //work
        //place the knight
        if(isItSafeToPlace(board, row, col)) {
            board[row][col] = true;
            Nknights(board, row, col + 1, kpsf + 1, total, ans + "{" + row + "-" + col + "}");
            board[row][col] = false;
        }

        //not place the knights
        Nknights(board, row, col + 1, kpsf, total, ans);

    }

    private static boolean isItSafeToPlace(boolean[][] board, int row, int col) {

        int[] rowArr = {-1, -2, -2, -1};
        int[] colArr = { 2,  1, -1, -2};

        for (int i = 0; i < 4; i++) {
            int r = row + rowArr[i];
            int c = col + colArr[i];
            if(r >= 0 && r < board.length && c >= 0 && c < board[0].length) {
                if (board[r][c]) {
                    return false;
                }
            }
        }

        return true;

    }
}
