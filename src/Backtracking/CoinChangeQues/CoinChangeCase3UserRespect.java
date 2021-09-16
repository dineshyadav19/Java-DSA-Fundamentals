package Backtracking.CoinChangeQues;

public class CoinChangeCase3UserRespect {
    public static void main(String[] args) {
        coinChangeUserRespect(new int[]{2,2,2,3,4}, 0, 6, " ");
    }

    //Case 1: Coins with Finite Supply --> Coins can be used only once and has duplicates in it.
    public static void coinChangeUserRespect(int[] den, int vidx, int amount, String ans) {
        //base case
        if(amount == 0) {
            System.out.println(ans);
            return;
        }

        //-base case
        if(amount < 0)
            return;

        //work
        for (int i = vidx; i < den.length; i++) {
            if(i > vidx && den[i] == den[i - 1])
                continue;

            coinChangeUserRespect(den, i + 1, amount - den[i], ans + den[i]);
        }
    }
}
