package Backtracking.CoinChangeQues;

public class CoinChangeCase2CoinRespect {
    public static void main(String[] args) {
        coinChangeCoinRespect2(new int[]{1,2,3}, 0, 3, " ");
    }

    //Case 1: Coins with Finite Supply ---> Coins can be used only once
    public static void coinChangeCoinRespect2(int[] den, int lastIndex, int amount, String ans) {
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
        coinChangeCoinRespect2(den, lastIndex + 1, amount - den[lastIndex], ans + den[lastIndex]);

        //Excluded
        coinChangeCoinRespect2(den, lastIndex + 1, amount, ans);
    }
}
