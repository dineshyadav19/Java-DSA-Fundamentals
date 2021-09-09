package Recursion.Recursion2;

public class ClimbingStairs {
    public static void main(String[] args) {
        climbStairs(0, 5, "");
    }

    public static void climbStairs(int start, int end, String ans) {

        if (start == end){
            System.out.println(ans);
            return;
        }

        if(start > end) {
            return;
        }

        for (int step = 1; step <= 3; step++)
            climbStairs(start + step, end, ans + step);
    }
}
