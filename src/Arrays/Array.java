package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//int n = scn.nextInt();
		
		int[] arr = {45,98,75,68,42,24};
		
//		swap(arr, 1, 5);
//		
//		System.out.println(Arrays.toString(arr));
		
		
		//maxArray(arr);

		//reverseArray(arr);
		//System.out.println(Arrays.toString(arr));
		int[] prefixSm = printSum2(arr);
		int q = scn.nextInt();
		for(int i=0;i<q;i++){
			int l = scn.nextInt();
			int r = scn.nextInt();
			if(l==0){
				System.out.println(prefixSm[r]);
			}else{
				int res = prefixSm[r]-prefixSm[l-1];
				System.out.println(res);
			}
			// int res = SumInRange(arr, l, r);

		}
	}

	public static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stud
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	
	public static void maxArray(int[] arr) {
		//edge cases
		if(arr.length == 0) {
			return;
		}
		
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max ) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
	
	
	public static void reverseArray(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		
		while(start < end) {
			swap(arr, start, end);
			start++;
			end--;
		}
	}

	//print sum from start to end
	public static int printSum(int[] arr, int start, int end) {
		int sum = 0;
		for(int i = start; i <= end; i++){
			sum += arr[i];
		}
		return sum;
	}

	//Optimized Solution for printSum from start to end
	public static int[] printSum2(int[] arr) {
		int[] prefixSum = new int[arr.length];
		for(int i = 0; i < prefixSum.length; i++){
			if(i == 0) {
				prefixSum[i] = arr[i];
			} else {
				prefixSum[i] = prefixSum[i-1] + arr[i];
			}
		}

		return prefixSum;
	}

}
