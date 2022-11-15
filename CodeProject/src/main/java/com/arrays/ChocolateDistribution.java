package com.arrays;

import java.util.Arrays;

public class ChocolateDistribution {

	static int findMinDiff(int [] arr, int n, int m) {
		int ans = Integer.MAX_VALUE;
		
		Arrays.sort(arr);
		
		for(int i=0; i<=n-m; i++) {
			int minW = arr[i];
			int maxW = arr[i+m-1];
			
			int gap = maxW - minW;
			if(gap<ans) {
				ans = gap;
			}
			
		}
		return ans;
	}
	public static void main(String[] args) {
		int [] arr = {3, 4, 1, 9, 56, 7, 9, 12};
		int m = 5;
		System.out.println(findMinDiff(arr, arr.length, m));
	}

}
