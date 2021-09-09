package Recursion.Recursion2;

public class PermutationString {
    public static void main(String[] args) {
        permutation("abc", "");
    }

    public static void permutation(String ques, String ans) {
        //base case
        if(ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String roq = ques.substring(0,i) + ques.substring(i + 1);
            permutation(roq, ans + ch);
        }
    }
}
