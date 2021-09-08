package Recursion;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 20, 30, 60};

        //printArray(arr, 0);

        //System.out.println(findMax(arr, 0));

        //System.out.println(findOccurrence(arr, 0, 1));

        //System.out.println(findLastOccurrence(arr, 0, 30));

        System.out.println(java.util.Arrays.toString(findAllIndex(arr, 0, 30, 0)));
    }

    //print array in reverse order
    //make a habit of passing vidx as 0
    public static void printArray(int[] arr, int vidx) {
        //base case
        if(vidx == arr.length) {
            return;
        }

        //sp
        printArray(arr, vidx + 1);

        //work
        System.out.print(arr[vidx] + " ");

    }

    //Find max of array
    public static int findMax(int[] arr, int vidx) {
        //base case
        if(vidx == arr.length)
            return Integer.MIN_VALUE;

        //int max = arr[vidx];

        //int maxim = findMax(arr, vidx + 1);

//        if(max < maxim){
//            max = maxim;
//        }

        //one liner
        //return max < maxim ? maxim : max;

        //Another one
        //return max < findMax(arr, vidx + 1) ? findMax(arr, vidx + 1) : max;

        //One more
        return Math.max(arr[vidx], findMax(arr, vidx + 1));
    }

    //Find First Occurrence
    public static int findOccurrence(int[] arr, int vidx, int item) {
        //base case
        if(vidx == arr.length)
            return -1;

        if(arr[vidx] == item) {
            return vidx;
        }

        int sp = findOccurrence(arr, vidx + 1, item);

        return sp;
    }


    //Find last Occurrence
    public static int findLastOccurrence(int[] arr, int vidx, int item) {
        //base case
        if(vidx == arr.length)
            return -1;

        int sp = findLastOccurrence(arr, vidx + 1, item);

        if(arr[vidx] == item && sp == -1)
            return vidx;
        else
            return sp;

    }

    //Find All Indexes
    public static int[] findAllIndex(int[] arr, int vidx, int item, int count) {
        //base case
        if(vidx == arr.length){
            int[] baseArray = new int[count];
            return baseArray;
        }

        //work
        int[] result;
        if(arr[vidx] == item) {
            result = findAllIndex(arr, vidx + 1, item, count + 1);
            result[count] = vidx;
        } else {
            result = findAllIndex(arr, vidx + 1, item, count);
        }
        return result;
    }

}
