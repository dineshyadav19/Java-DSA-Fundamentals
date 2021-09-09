package Recursion.Recursion2;

public class GenerateParenthesis {
    public static void main(String[] args) {
        generateParenthesis(2, 0, 0, "");
    }

    public static void generateParenthesis(int n, int open, int close, String ans) {
        //+ base case
        if(open == n && close == n) {
            System.out.println(ans);
            return;
        }

        //- base case
        if(open > n || close > open)
            return;

        generateParenthesis(n , open + 1, close, ans + '(');
        generateParenthesis(n, open, close + 1, ans + ')');
    }
}
