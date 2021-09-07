package Recursion;

public class Factorial {

    public static void main(String[] args) {
        //System.out.println(factorial(4));

        System.out.println(calculatePower(5, 3));
    }

    public static int factorial(int n) {
        //base case
        if(n == 0)
            return 1;

        // smaller problem
        int fnm1 = factorial(n - 1); // factorial of n - m

        //self work
        int fn = fnm1 * n; // factorial of n

        return fn;
    }

    public static int calculatePower(int number, int n) {
        //base case
        if(n == 0) {
            return 1;
        }

        //smaller problem
//        int sn = calculatePower(number, n -1);
//
//        int prod = sn*number;
//
//        return prod;

        //other way of doing this ---- one line code
        return calculatePower(number, n-1) * number;
    }

}
