package Searching;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {45,78,24,-4,26,2,16,98,23,14};
		
		System.out.println(linearSearch(arr, 16));

	}
	
	public static int linearSearch(int[] arr, int target) {
		
		//edge case
		if(arr.length == 0) {
			return -1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		
		return -1;
	}

}
