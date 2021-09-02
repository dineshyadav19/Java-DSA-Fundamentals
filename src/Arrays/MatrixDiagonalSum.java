package Arrays;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

//        int res = diagonalSum(arr);
//        System.out.println(res);

    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) {
                if(i == j ) {
                    sum += mat[i][j];
                } else if(i+j == mat.length - 1) {
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }


}
