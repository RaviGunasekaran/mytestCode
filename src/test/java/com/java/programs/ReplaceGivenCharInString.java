package com.java.programs;

public class ReplaceGivenCharInString {

	public static void main(String[] args) {
		replace("Welcome", 'e', '1');

	}

	static void replace(String str, char c1, char replace) {
		System.out.println("BEFORE : " + str);
		String result = "";
		char[] mychararr = str.toCharArray();
		for (int i = 0; i < mychararr.length; i++) {
			if (mychararr[i] == c1) {
				mychararr[i] = replace;
			}
		}
		str = new String(mychararr);
		System.out.println("New : " + str);
	}

}
