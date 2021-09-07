package Recursion;

public class RulerQues {
    public static void main(String[] args) {
        //pattern(3);
        ruler(5, 1);
    }

    public static void pattern(int tl) {
        //base case
        if(tl  == 0)
            return;

        //sp
        pattern(tl - 1);

        //work
        for (int i = 0; i < tl; i++) {
            System.out.print("-" + " ");
        }
        System.out.println();

        //sp
        pattern(tl - 1);
    }

    public static void ruler(int ml, int inch) {
        for (int i = 0; i < inch; i++) {
            for (int j = 0; j < ml; j++) {
                System.out.print("-" + " ");
            }
            System.out.println(i);
            pattern(ml - 1);
        }

        for (int i = 0; i < ml; i++) {
            System.out.print("-"+" ");
        }
        System.out.println(inch);
    }
}
