package com.arrays;

public class BuyandSellStock {

	static int maxProfit(int[] arr) {
		int minSoFar = arr[0];
		int maxprofit = 0;
		
		for(int i=0; i<arr.length; i++) {
			minSoFar = Math.min(minSoFar, arr[i]);
			int profit = arr[i]-minSoFar;
			maxprofit = Math.max(maxprofit, profit);
		}
		return maxprofit;
	}
	public static void main(String[] args) {
		int [] arr = {7,1,5,3,6,4};
		System.out.println(maxProfit(arr));
		
	}

}
