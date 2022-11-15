package com.arrays;

public class Reverse {

	static void reverse(int[] arr, int n) {
		int i=0;
		int j=n-1;
		
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		for(int k=0; k<n; k++) {
			System.out.print(arr[k]+" ");
		}
	}
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		int n = arr.length;
		reverse(arr, n);
	}

}
