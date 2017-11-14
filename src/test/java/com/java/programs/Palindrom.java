package com.java.programs;

public class Palindrom {

	public static void main(String[] args) {
		String s = "malayalam1";

		if (rev(s).equals(s)) {
			System.out.println("Palindrom");
		} else {
			System.out.println("Not Palindrom");
		}

	}

	private static String rev(String s) {
		String pal = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			pal = pal + s.charAt(i);
			System.out.println("PAL :" + pal);
		}
		return pal;
	}

}
