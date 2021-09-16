package Backtracking.CoinChangeQues;

public class CoinChangeCase2UserRespect {
    public static void main(String[] args) {
        coinChangeUserRespect2(new int[]{1,2,3}, 0, 3, " ");
    }

    //Case 1: Coins with Finite Supply --> Coins can be used only once
    public static void coinChangeUserRespect2(int[] den, int lastIndex, int amount, String ans) {
        //base case
        if(amount == 0) {
            System.out.println(ans);
            return;
        }

        //-base case
        if(amount < 0)
            return;

        //work
        for (int i = lastIndex; i < den.length; i++) {
            coinChangeUserRespect2(den, i + 1, amount - den[i], ans + den[i]);
        }
    }
}
