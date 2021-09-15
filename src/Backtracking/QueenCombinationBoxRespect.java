package Backtracking;

public class QueenCombinationBoxRespect {
    public static void main(String[] args) {
        queenCombinationBox(new boolean[4], 2, 0, -1, " ");
    }

    public static void queenCombinationBox(boolean[] box, int totalQueen, int queenPlaced, int lastBoxUsed, String ans) {
        //+ base case
        if(queenPlaced == totalQueen){
            System.out.println(ans);
            return;
        }

        //- base case
        if(lastBoxUsed > box.length) {
            return;
        }

        //work
        for (int i = lastBoxUsed + 1; i < box.length; i++) {
            box[i] = true;
            queenCombinationBox(box, totalQueen, queenPlaced + 1, i, ans + "b" + i + " ");
            box[i] = false;
        }
    }
}
