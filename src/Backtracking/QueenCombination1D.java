package Backtracking;

public class QueenCombination1D {
    public static void main(String[] args) {
        boolean[] boxes = new boolean[4];
        queenCombination(2, 0, " ", boxes, -1);
    }

    public static void queenCombination(int totalQueens, int queensPlaced, String ans, boolean[] boxes, int lastboxUsed) {
        //base case
        if(queensPlaced == totalQueens) {
            System.out.println(ans);
            return;
        }


        //self work
        for (int i = lastboxUsed + 1; i < boxes.length; i++) {
            boxes[i] = true;
            queenCombination(2, queensPlaced + 1, ans + "q" + queensPlaced + "b" + i + " ", boxes, i);
            boxes[i] = false;
        }
    }
}
