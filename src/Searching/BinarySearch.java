package Searching;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,6,22,46,84,98};
		int ans = binarySearch(arr, 4);
		System.out.println(ans);

	}
	
	public static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		
		boolean isAsc = arr[start] < arr[end];
		
		while(start <= end) {
			
			int mid = start + ((end-start) / 2);
			
			if(arr[mid] == target) {
				return mid;
			}
			
			if(isAsc) {
				if(target < arr[mid]) {
					end = mid -1;
				} else {
					start = mid + 1;
				}
			} else {
				if(target > arr[mid]) {
					end = mid -1;
				} else {
					start = mid + 1;
				}
			}	
		}
		
		return -1;
		
	}

}
