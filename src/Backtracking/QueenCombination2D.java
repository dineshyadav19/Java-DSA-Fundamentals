package Backtracking;

import java.util.Arrays;

public class QueenCombination2D {

    public static void main(String[] args) {
        boolean[][] board = {
                {false, false},
                {false, false}
        };

        queenCombination(new boolean[3][4], 0,0, 0, 3, "");
    }

    public static void queenCombination(boolean[][] board, int row, int col, int qpsf, int total, String ans) {
        //+ base case
        if(qpsf == total) {
            System.out.println(ans);
            return;
        }

        //- base case
        if(col == board[0].length) {
            row++;
            col=0;
        }

        if(row == board.length){
            return;
        }

        //queen place
        board[row][col] = true;
        queenCombination(board, row, col + 1, qpsf + 1, total, ans + "( " + row + col + " )" + " ");
        board[row][col] = false;

        //not place
        queenCombination(board, row, col + 1, qpsf, total, ans);

    }
}
