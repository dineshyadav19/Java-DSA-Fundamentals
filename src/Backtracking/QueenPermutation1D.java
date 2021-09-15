package Backtracking;

public class QueenPermutation1D {
    public static void main(String[] args) {
        boolean[] boxes = new boolean[4];
        queenPermutation(2, 0, " ", boxes);
    }

    public static void queenPermutation(int totalQueens, int queensPlaced, String ans, boolean[] boxes) {
        //base case
        if(queensPlaced == totalQueens) {
            System.out.println(ans);
            return;
        }

        //self work
        for (int i = 0; i < boxes.length; i++) {
            if(boxes[i] == false) {
                boxes[i] = true;
                queenPermutation(2, queensPlaced + 1, ans + "q" + queensPlaced + "b" + i + " ", boxes);
                boxes[i] = false;
            }
        }
    }
}
