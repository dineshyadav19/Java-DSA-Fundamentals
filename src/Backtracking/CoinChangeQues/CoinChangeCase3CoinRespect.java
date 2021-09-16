package Backtracking.CoinChangeQues;

public class CoinChangeCase3CoinRespect {
    public static void main(String[] args) {
        coinChangeCoinRespect(new int[]{2,2,2,3,4 }, 0, 6, " ", true);
    }

    //Case 1: Coins with Finite Supply ---> Coins can be used only once
    //this logic will only work when array is sorted because it has duplicates
    public static void coinChangeCoinRespect(int[] den, int vidx, int amount, String ans, boolean flag) {
        //base case
        if(amount == 0) {
            System.out.println(ans);
            return;
        }

        //- base case
        if(vidx == den.length || amount < 0)
            return;

        //work

        if(flag == false && den[vidx] == den[vidx - 1]){
            coinChangeCoinRespect(den, vidx + 1, amount, ans, false);
        } else {
            //Included
            coinChangeCoinRespect(den, vidx + 1, amount - den[vidx], ans + den[vidx], true);
            //Excluded
            coinChangeCoinRespect(den, vidx + 1, amount, ans, false);
        }
    }
}
