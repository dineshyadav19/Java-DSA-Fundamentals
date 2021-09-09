package Sorting.Divide_and_Conquer;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] one = {10,30,50,80,100};
        int[] two = {15,20,25,60,70};
        //System.out.println(Arrays.toString(mergeTwoSortedArrays(one, two)));

        int[] arr = {80, 10, 50, 30, 60, 20, 70, 25};
        System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length -1)));
    }

    public static int[] mergeTwoSortedArrays(int[] one, int[] two) {
        int[] merged = new int[one.length + two.length];

        int i = 0; // Keep track of index of one array
        int j = 0; // keep track of index of two array
        int k = 0; // keep track of merged array

        while (i < one.length && j < two.length){
            if(one[i] < two[j]) {
                merged[k] = one[i];
                i++;
            } else {
                merged[k] = two[j];
                j++;
            }
            k++;
        }

        // two array finish, one array elements consume
        while (i < one.length){
            merged[k] = one[i];
            i++;
            k++;
        }

        // one array finish, two array elements consume
        while (j < two.length) {
            merged[k] = two[j];
            j++;
            k++;
        }

        return merged;
    }

    public static int[] mergeSort(int[] arr, int start, int end) {
        //base case
        if(start == end) {
            int[] br = new int[1]; //br --> base result
            br[0] = arr[start];
            return br;
        }

        int mid = (start + end) / 2;

        int[] firstHalf = mergeSort(arr, start, mid);
        int[] secondHalf = mergeSort(arr, mid + 1, end);

        return mergeTwoSortedArrays(firstHalf, secondHalf);
    }

}
