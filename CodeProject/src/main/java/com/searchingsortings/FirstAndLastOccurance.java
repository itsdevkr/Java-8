package com.searchingsortings;

import java.util.ArrayList;

public class FirstAndLastOccurance {

	 static ArrayList<Long> find(long arr[], int n, int x)
	    {
	        ArrayList<Long> list = new ArrayList<>();
	        int firstIndex = 0;
	        int secIndex = 0;
	        
	        for(int i=0; i<n; i++) {
	        	if(arr[i] == x) {
	        		firstIndex = i;
	        		break;
	        	}
	        }
	        
	        for(int i=n-1; i>=0; i--) {
	        	if(arr[i] == x) {
	        		secIndex = i;
	        		break;
	        	}
	        }
	       
	        list.add(new Long(firstIndex));list.add(new Long(secIndex));
	        return list;
	    }
	public static void main(String[] args) {
		long[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
		int n = arr.length;
		int x = 5;
		
		System.out.println(find(arr, n, x));
		
	}

}
