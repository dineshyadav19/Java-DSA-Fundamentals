package Arrays;

public class SpiralDisplay {
    public static void main(String[] args) {
        int[][] arr = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        spiralDisplay(arr);
    }

    public static void spiralDisplay(int[][] arr) {

        int minRow = 0;
        int maxRow = arr.length - 1;
        int minCol = 0;
        int maxCol = arr[0].length - 1;

        int nel = arr.length * arr[0].length;
        int count = 0;

//        while (count < nel) {
//
//            //first row
//            for (int c = minCol; c <= maxCol && count < nel; c++) {
//                System.out.print(arr[minRow][c] + " ");
//                count++;
//            }
//            minRow++;
//
//            //last col
//            for (int r = minRow; r <= maxRow && count < nel; r++) {
//                System.out.print(arr[r][maxCol] + " ");
//                count++;
//            }
//            maxCol--;
//
//            //last row
//            for (int c = maxCol; c >= minCol && count < nel; c--) {
//                System.out.print(arr[maxRow][c] + " ");
//                count++;
//            }
//            maxRow--;
//
//            //first Col
//            for (int r = maxRow; r >= minRow && count < nel; r--) {
//                System.out.print(arr[r][minCol] + " ");
//                count++;
//            }
//            minCol++;
//
//        }


            //Second way of doing this
            while(minCol <= maxCol && minRow <= maxRow) {

                //first row
                if(minCol <= maxCol && minRow <= maxRow) {
                    for(int col = minCol; col <= maxCol; col++) {
                        System.out.print(arr[minRow][col]);
                    }
                    minRow++;
                }

                //last col
                if(minCol <= maxCol && minRow <= maxRow) {
                    for(int row = minRow; row <= maxRow; row++) {
                        System.out.print(arr[row][maxCol]);
                    }
                    maxCol--;
                }

                //last row
                if(minCol <= maxCol && minRow <= maxRow) {
                    for(int col = maxCol; col >= minCol; col--) {
                        System.out.print(arr[maxRow][col]);
                    }
                    maxRow--;
                }

                //first Col
                if(minCol <= maxCol && minRow <= maxRow) {
                    for(int row = maxRow; row >= minRow; row--) {
                        System.out.print(arr[row][minCol]);
                    }
                    minCol++;
                }
            }

        System.out.println();

    }
}

