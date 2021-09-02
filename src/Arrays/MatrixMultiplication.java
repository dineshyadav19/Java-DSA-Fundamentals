package Arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] one = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        int[][] two = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 } };

        display(matrixMultiplication(one, two)) ;
    }

    public static int[][] matrixMultiplication(int[][] one, int[][] two) {

        int r1 = one.length;
        int c1 = one[0].length;

        int r2 = two.length;
        int c2 = two[0].length;

        int[][] res = new int[r1][c2];

        for(int row = 0; row < res.length; row++) {
            for(int col = 0; col < res[0].length; col++) {

                int sum = 0;
                //for multiplication
                for (int k = 0; k < c1; k++) {
                    sum += one[row][k] * two[k][col];
                }

                res[row][col] = sum;
            }
        }

        return res;
    }

    public static void display(int[][] arr){
        for(int[] fin: arr) {
            for(int res: fin) {
                System.out.print(res +  " ");
            }
            System.out.println();
        }
    }
}
