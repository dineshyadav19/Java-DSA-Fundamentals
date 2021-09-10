package Recursion.Recursion2;

public class LexicoCount {
    public static void main(String[] args) {
        lexicoCounting(0, 1000);
    }

    public static void lexicoCounting(int current, int n) {
        //- base case
        if(current > n)
            return;

        System.out.println(current);

        int i = 0;

        if(current == 0){
            i = 1;
        }

        for (; i <= 9; i++) {
            lexicoCounting(current*10 + i, n);
        }
    }
}
