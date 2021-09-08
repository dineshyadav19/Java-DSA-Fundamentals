package Recursion.Recursion2;

public class CoinToss {

    public static void main(String[] args) {
        coinToss(4,"");
    }

    public static void coinToss(int n, String ans) {
        //base case
        if(n == 0) {
            System.out.println(ans);
            return;
        }

        //work
        coinToss(n - 1, ans  + 'H');
        coinToss(n - 1, ans  + 'T');
    }
}
