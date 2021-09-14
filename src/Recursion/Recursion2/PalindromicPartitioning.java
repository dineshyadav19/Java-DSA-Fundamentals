package Recursion.Recursion2;

public class PalindromicPartitioning {
    public static void main(String[] args) {
        palindromicPartitioning("nitin", "");
    }

    public static void palindromicPartitioning(String ques, String ans) {
        //base case
        if(ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 1; i <= ques.length(); i++) {
            String roq = ques.substring(i);
            String part = ques.substring(0, i);

            if(isPalindrome(part))
                palindromicPartitioning(roq, ans + part + " ");
        }

    }

    public static boolean isPalindrome(String str) {

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;

        }
        return true;
    }

}
