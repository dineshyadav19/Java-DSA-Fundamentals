package Recursion;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    private static int factorial(int n) {
        //base case
        if(n == 0)
            return 1;

        // smaller problem
        int fnm1 = factorial(n - 1); // factorial of n - m

        //self work
        int fn = fnm1 * n; // factorial of n

        return fn;
    }

}
