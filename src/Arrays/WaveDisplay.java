package Arrays;

public class WaveDisplay {
    public static void main(String[] args) {
        int[][] arr = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        //waveDisplay(arr);
        reverseWaveDisplay(arr);
        // horizontalWaveDisplay(arr);
    }


    //wave display print
    public static void waveDisplay(int[][] arr) {

        for (int c = 0; c < arr[0].length; c++) {

            if (c % 2 == 0) {
                for (int r = 0; r < arr.length; r++) {
                    System.out.print(arr[r][c] + " ");
                }
            } else {
                for (int r = arr.length - 1; r >= 0; r--) {
                    System.out.print(arr[r][c] + " ");
                }
            }

        }

        System.out.println();

    }

    //horizontal wave print
    public static void horizontalWaveDisplay(int[][] arr) {

        for (int r = 0; r < arr.length; r++) {

            if (r % 2 == 0) {
                for (int c = 0; c < arr[0].length; c++) {
                    System.out.print(arr[r][c] + " ");
                }
            } else {
                for (int c = arr[0].length - 1; c >= 0; c--) {
                    System.out.print(arr[r][c] + " ");
                }
            }

        }

        System.out.println();

    }

    public static void reverseWaveDisplay(int[][] arr) {
        for(int c = arr[0].length - 1; c >= 0; c--) {
            if (c % 2 == 0) {
                for (int r = arr.length - 1; r >= 0; r--) {
                    System.out.print(arr[r][c] + " ");
                }
            } else {
                for (int r = 0; r < arr.length; r++) {
                    System.out.print(arr[r][c] + " ");
                }
            }
        }
    }

}
