package com.java.programs;

import java.util.ArrayList;

public class ReverseStringElementsWithoutSPLIT {

	public static void main(String[] args) {
		String s = "Hello HOW ARE YOU";
		ArrayList<String> output = new ArrayList<>();
		int k = 0;
		for (int i = 0; i < s.length(); i++) {

			boolean startsWith = s.startsWith(" ", i);
			if (startsWith) {
				// System.out.println(i);
				System.out.println(s.substring(k, i));
				k = i + 1;
			}
		}
		System.out.println(s.substring(k, s.length()));
	}

}
