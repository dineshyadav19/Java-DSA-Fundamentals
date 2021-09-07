package Recursion;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(fibonacci(8));
    }

    public static int fibonacci(int n) {
        //base case
        if(n == 0 || n == 1)
            return n;

        int a = fibonacci(n - 1);
        int b = fibonacci(n - 2);

        int c = a + b;

        return c;
    }
}
