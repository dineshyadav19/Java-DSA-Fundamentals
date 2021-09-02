package Searching;

import java.util.Arrays;

public class BinarySearchQuestions {

	public static void main(String[] args) {
//		int[] arr = {2,3,6,9,14,16,18};
		
//		int ans = floorNumber(arr, 17);
//		System.out.println(ans);
		
		int[] arr = {5,6,7,8,8,10};
		//searchRange(arr, 8);
		System.out.println(Arrays.toString(searchRange(arr, 8)));
	}
	
	static int ceilingNumber(int[] arr, int target) {
		
		//edge case
		if(target >  arr[arr.length -1]) {
			return -1;
		}
		
		int start = 0;
		int end = arr.length - 1;
		
		while(start <=  end) {
			int mid = start + ((end-start)/2);
			
			if(arr[mid] == target) {
				return arr[mid];
			}
			
			if(target > arr[mid]) {
				start = mid + 1;
				
				//TODO: either you can do this or 
				if(arr[start] >= target) {
					return arr[start];
				}
			} else {
				end = mid - 1;
			}
		}
		
		
		//you can do this
		//return arr[start];
		return  -1;
		
	}
	
	static int floorNumber(int[] arr, int target) {
		
		//edge case
		if(target <  arr[0]) {
			return -1;
		}
		
		
		int start = 0;
		int end = arr.length - 1;
		
		while(start <=  end) {
			int mid = start + ((end-start)/2);
			
			if(arr[mid] == target) {
				return arr[mid];
			}
			
			if(target > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
				//TODO: either you can do this or 
				if(arr[end] <= target) {
					return arr[end];
				}
			}
		}
		
		
		//you can do this
		//return arr[end];
		return  -1;
		
	}

	public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = search(nums, target, true);
        if(ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        
        return ans;
    }
    
    public static int search(int[] nums, int target, boolean first) {
        int ans  = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + ((end-start)/2);
            
            if(target < nums[mid]) {
                end = mid - 1;
            } else if(target > nums[mid]) {
                start = mid + 1;
            } else {
                ans  = mid;
                if(first) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
