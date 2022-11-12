package com.interview;

public class ReverseSentence {

	static String revSen(String s) {
		String[] split = s.split(" ");
		String output = "";

		for (int i = split.length - 1; i > 0; i--) {
			output = output + split[i] + ".";
		}
		output = output + split[0];

		return output;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is reverse sentence interview question";
		System.out.println(revSen(s));
	}

}
