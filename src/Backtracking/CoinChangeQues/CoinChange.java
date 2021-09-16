package Backtracking.CoinChangeQues;

public class CoinChange {
    public static void main(String[] args) {
        coinChange(new int[] {2, 3, 5, 6}, 10, 0, " ");
    }

    public static void coinChange(int[] den, int amount, int lastIndex, String ans) {
        //base case
        if(amount == 0) {
            System.out.println(ans);
            return;
        }

        //self work
        for (int i = lastIndex; i < den.length; i++) {
            if(amount >= den[i]) {
                coinChange(den, amount - den[i], i, ans + den[i] + " ");
            }
        }
    }
}
