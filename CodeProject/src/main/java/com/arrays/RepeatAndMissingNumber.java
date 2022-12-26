package com.arrays;

public class RepeatAndMissingNumber {

	static void repeatAndMissing(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		int [] temp = new int[max];
		for(int i=1; i<=max; i++)
			temp[i]=0;
		for(int i=1; i<=max; i++) {
			temp[arr[i]]++;
		}
		int missing = 0;
		int repeating = 0;
		for(int i=1; i<=max; i++) {
			if(temp[i]==0) {
				missing = arr[i];
				break;}
			if(temp[i]>1) {
				repeating = arr[i];
			}
		}
		System.out.println(missing);
		System.out.println(repeating);
	}
	public static void main(String[] args) {
		int [] arr = {4,3,6,2,1,1};
		repeatAndMissing(arr);
	}

}
