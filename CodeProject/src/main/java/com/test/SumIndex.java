package com.test;

public class SumIndex {

	static int [] getSumIndex(int [] arr, int n, int target) {
		
		int [] temp = new int[2];
		
		int firstPos = 0;
		int secPos = 0;
		
		for(int i=0; i<n; i++) {
			for(int j = i+1; j<n; j++) {
				if(arr[i]+arr[j]==target) { //2,7
					firstPos = i;
					secPos = j;
				}
			}
		}
		temp[0] = firstPos;
		temp[1] = secPos;
		
		return temp;
	}
	public static void main(String[] args) {
		int [] arr = {2,11,7,9,1,8};
		int n = arr.length;
		int target = 9;
	
		int[] sumIndex = getSumIndex(arr, n, target);
		for(int i=0; i<sumIndex.length; i++) {
			System.out.print(sumIndex[i]);
		}
	}

}
