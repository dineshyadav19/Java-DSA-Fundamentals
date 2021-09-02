package Sorting;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] arr) {
        boolean swap;
        for(int i = 0; i < arr.length; i++) {
            swap = false;
            for(int j = 1; j < arr.length - i; j++) {
                //swap if j elem is smaller than j-1
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap = true;
                }
            }

            //if not swapped for any particular value means the array is sorted hence stop the program
            if(!swap)
                break;
        }
    }
}
