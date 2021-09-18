package Sorting.Divide_and_Conquer;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {50,40,80,90,70,10,30,60,120};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end) {

        //base case
        if(start >= end) {
            return;
        }

        int mid = (start + end) / 2;
        int pivot = arr[mid];

        int left  = start;
        int right = end;

        //partitioning
        while (left <= right) {
            //if element is lesser than pivot inc left
            while (arr[left] < pivot)
                left++;

            //if element is greater than pivot dec right
            while (arr[right] > pivot)
                right--;

            /*
            * if element on left is greater than pivot and
            * element on right side is lesser than pivot
            * than just swap the 2 elements with each other
            * */
            if(left <= right) {
                int temp   = arr[left];
                arr[left]  = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        quickSort(arr, start, right);
        quickSort(arr, left, end);

    }

}
