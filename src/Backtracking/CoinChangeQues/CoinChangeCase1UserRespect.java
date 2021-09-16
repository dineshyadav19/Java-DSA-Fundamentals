package Backtracking.CoinChangeQues;

public class CoinChangeCase1UserRespect {
    public static void main(String[] args) {
        coinChangeUserRespect(new int[]{1,2,3}, 0, 3, " ");
    }

    //Case 1: Coins with Infinite Supply
    public static void coinChangeUserRespect(int[] den, int lastIndex, int amount, String ans) {
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
            if(amount >= den[i]){
                coinChangeUserRespect(den, i, amount - den[i], ans + den[i]);
            }
        }
    }
}
