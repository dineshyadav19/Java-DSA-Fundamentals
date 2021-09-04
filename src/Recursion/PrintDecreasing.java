package Recursion;

public class PrintDecreasing {
    public static void main(String[] args) {
        //printDec(5);
        //printInc(5);

        //printDecInc(5);

        printIncDec(1 , 4);
    }

    public static void printDec(int n) {
        //base case
        if(n == 0) {
            return;
        }

        System.out.println(n);

        printDec(n-1);
    }

    public static void printInc(int n) {
        //base case
        if(n == 0)
            return;

        printInc(n - 1);
        System.out.println(n);
    }

    public static void printDecInc(int n) {
        //base case
        if(n == 0)
            return;

        //work - print Dec
        System.out.println(n);

        // Recursive call
        printDecInc(n - 1);

        //print Increasing
        System.out.println(n);
    }

    public static void printIncDec(int start, int n) {
        //base case
        if(start > n)
            return;


        //print increasing
        System.out.println(start);

        //Recursive Call
        printIncDec(start + 1 , n);

        //print Decreasing
        System.out.println(start);

    }

}
