package com.searching;

import java.util.Arrays;

public class Binary {

	static int search(int [] arr, int low, int high, int k) {
		int mid = (low+high)/2;
		if(arr[mid] == k) {
			return mid;
		}
			while(low<high) {
				if(k>arr[mid]) {
					return search(arr,mid+1,high,k);
				}else if(k<arr[mid]) {
					return search(arr,low,mid-1,k);
				}
			}
		return -1;
	}
	public static void main(String[] args) {
		int [] arr = {2, 3, 4, 10, 40};
		Arrays.sort(arr);
		int low = 0;
		int high = arr.length-1;
		int k = 10;
		System.out.println(search(arr,low,high,k));
	}

}
