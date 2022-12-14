package com.arrays;

public class MinMax {
	static class Pair{
		int min;
		int max;
	}
	static Pair getMinMax(int [] arr, int n) {
		Pair minmax = new Pair();
		if(n==1) {
			minmax.min = arr[0];
			minmax.max = arr[0];
			return minmax;
		}
		
		if(arr[0]>arr[1]) {
			minmax.min = arr[1];
			minmax.max = arr[0];
		}else {
			minmax.min = arr[0];
			minmax.max = arr[1];
		}
		for(int i=2; i<n; i++) {
			if(arr[i]>minmax.min) {
				minmax.max = arr[i];
			}else {
				minmax.min = arr[i];
			}
		}
		return minmax;
	}
	public static void main(String[] args) {
		int arr[] = {1000, 11, 445, 1, 330, 3000};
        int arr_size = 6;
        Pair minmax = getMinMax(arr, arr_size);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);
	}

}
