package com.arrays;

public class MaximumSubArraySum {

	static int subArraySum(int[] arr, int n) {
		int maxSum = Integer.MIN_VALUE;
		int curSum = 0;
		
		for(int i=0; i<n; i++) {
			curSum = curSum + arr[i];
			
			if(curSum>maxSum) {
				maxSum = curSum;
			}
			
			if(curSum < 0) {
				curSum = 0;
			}
		}
		return maxSum;
	}
	public static void main(String[] args) {
		int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
		int n = arr.length;
		System.out.println(subArraySum(arr, n));
	}

}
