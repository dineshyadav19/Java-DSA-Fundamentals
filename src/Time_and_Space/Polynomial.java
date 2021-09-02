package Time_and_Space;

public class Polynomial {
    public static void main(String[] args) {
        //System.out.println(polynomial(3,7));
        System.out.println(polynomial2(3,7));
    }

    //Time Complexity is O(n^2)
    public static int polynomial(int x, int n) {
        int sum = 0;
        int count = n;
        for(int i = 1; i <= n; i++) {
            int prod = 1;
            for(int j = count; j >= 1; j--){
                prod *= x;
            }
            count--;
            sum += i*prod;
        }
        return sum;
    }

    //Optimize it to O(n)
    public static int polynomial2(int x, int n) {
        int sum = 0;
        int mult = x;
        for(int i = n; i >= 1; i--) {
            sum += i*mult;
            mult *= x;
        }
        return sum;
    }


}
