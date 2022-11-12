package com.interview;

public class CheckPalindrome {

	static boolean checkPalindrome(String s) {
		int i = 0; 
		int j = s.length()-1;
		
		while(i<j) {
			if(s.charAt(i)== s.charAt(j)) {
				return true;
			}
			i++;
			j--;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "raceca";
		System.out.println(checkPalindrome(s));
	}

}
