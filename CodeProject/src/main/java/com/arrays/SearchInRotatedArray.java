package com.arrays;

public class SearchInRotatedArray {

	static int search(int[] arr, int n, int target) {
		int low = 0;
		int high = n-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(target == arr[mid]) {
				return mid;
			}else if(arr[low]<=arr[mid]) {
				//Left side is sorted
				if(target<arr[mid] && target >= arr[low]) {
					high = mid-1;
				}else {
					low = mid+1;
				}
			}else if(arr[high]>=arr[mid]) {
				//Right side is sorted
				if(target>arr[mid] && target<=arr[high]) {
					low = mid+1;
				}else {
					high = mid -1;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int [] arr = {4,5,6,7,0,1,2};
		int target = 0;
		System.out.println(search(arr, arr.length, target));
	}

}
