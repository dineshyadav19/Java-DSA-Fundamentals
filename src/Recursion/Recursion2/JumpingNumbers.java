package Recursion.Recursion2;

public class JumpingNumbers {

    public static void main(String[] args) {
        jumpingNumbers(0, 20);
    }

    public static void jumpingNumbers(int current, int n) {
        //base case
        if (current > n){
            return;
        }

        System.out.println(current);

        if (current == 0) {
            for (int i = 1; i <= 9 ; i++) {
                jumpingNumbers(i, n);
            }
        } else {
            int remainder = current % 10;

            if (remainder != 0)
                jumpingNumbers(current * 10 + (remainder - 1), n);

            if (remainder != 9)
                jumpingNumbers(current * 10 + (remainder + 1), n);
        }


    }

}
