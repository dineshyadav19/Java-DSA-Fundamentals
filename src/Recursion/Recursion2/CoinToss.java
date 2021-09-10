package Recursion.Recursion2;

public class CoinToss {

    public static void main(String[] args) {
        coinToss2(3,"", false);
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

    //Coin Toss with no consecutive Head
    /*
        Take a boolean variable to keep track of last index of ans
        so that we can see which call it is making
        and do not give the next call of Head if it is already head
    */
    public static void coinToss2(int n, String ans, boolean flag) {
        //base case
        if(n == 0){
            System.out.println(ans);
            return;
        }
        //last element was Head
        if (!flag) { //last element was tail
            coinToss2(n - 1, ans + 'H', true);
        }
        coinToss2(n - 1, ans + 'T', false);

    }
}
