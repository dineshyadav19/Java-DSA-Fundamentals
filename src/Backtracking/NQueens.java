package Backtracking;

public class NQueens {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        Nqueen(board, 0, 0, 0, board.length, "");
    }

    public static void Nqueen(boolean[][] board, int row, int col, int qpsf, int total, String ans) {
        //base case
        if(qpsf == total) {
            System.out.println(ans);
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
        //check if it is safe to place the queen or not
        if(isItSafeToPlace(board, row, col)){
            board[row][col] = true;
            Nqueen(board, row + 1, 0, qpsf + 1, total, ans + "{" + row +"-"+ col + "}");
            board[row][col] = false;
        }

        //not place
        Nqueen(board, row,col + 1, qpsf, total, ans);
    }

    //check if it is safe to place the queen function
    public static boolean isItSafeToPlace(boolean[][] board, int row, int col) {

        //check vertically upward
        int r = row - 1;
        int c = col;

        while (r >= 0) {
            if(board[r][c])
                return false;
            r--;
        }

        //horizontally left
        r = row;
        c = col - 1;

        while (c >= 0) {
            if(board[r][c])
                return false;
            c--;
        }

        //diagonally left
        r = row - 1;
        c = col - 1;

        while (r >= 0 && c >= 0) {
            if(board[r][c])
                return false;

            r--;
            c--;
        }

        //diagonally right
        r = row - 1;
        c = col + 1;
        while (r >= 0 && c < board[0].length ){
            if(board[r][c])
                return false;

            r--;
            c++;
        }

        return true;
    }
}
