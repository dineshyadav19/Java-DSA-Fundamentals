package Backtracking.CoinChangeQues;

public class CoinChangeCase1CoinRespect {
    public static void main(String[] args) {
        coinChangeCoinRespect(new int[]{1,2,3}, 0, 3, " ");
    }

    //Case 1: Coins with Infinite Supply
    public static void coinChangeCoinRespect(int[] den, int lastIndex, int amount, String ans) {
        //base case
        if(amount == 0) {
            System.out.println(ans);
            return;
        }

        //- base case
        if(lastIndex == den.length || amount < 0)
            return;

        //work

        //Included
        coinChangeCoinRespect(den, lastIndex, amount - den[lastIndex], ans + den[lastIndex]);

        //Excluded
        coinChangeCoinRespect(den, lastIndex + 1, amount, ans);
    }
}
