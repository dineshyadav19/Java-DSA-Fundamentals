package Recursion.Recursion2;

public class StringSubsequence {
    public static void main(String[] args) {
        stringSubsequenceAscii("ab", "");
    }

    public static void stringSubsequence(String ques, String ans) {
        //base case
        if(ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        //work
        char ch = ques.charAt(0);
        String roq = ques.substring(1); //roq ---> rest of question
        stringSubsequence(roq, ans);
        stringSubsequence(roq, ans + ch);
    }

    public static void stringSubsequenceAscii(String ques, String ans) {
        //base case
        if(ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        //work
        char ch = ques.charAt(0);
        String roq = ques.substring(1); //roq ---> rest of question
        stringSubsequenceAscii(roq, ans);
        stringSubsequenceAscii(roq, ans + ch);
        stringSubsequenceAscii(roq, ans + (int) ch);
    }


}
