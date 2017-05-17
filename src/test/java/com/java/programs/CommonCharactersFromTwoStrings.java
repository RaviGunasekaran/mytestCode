package com.java.programs;

import java.util.LinkedHashSet;

public class CommonCharactersFromTwoStrings {

	public static void main(String[] args) {
		String s1 = "I am living in india";
		String s2 = "india is a beautiful country";
		System.out.println(s1);
		System.out.println(s2);

		LinkedHashSet<Character> linkedS1 = new LinkedHashSet<>();
		for (int i = 0; i < s1.length(); i++) {
			linkedS1.add(s1.charAt(i));
		}
		System.out.println(linkedS1);

		LinkedHashSet<Character> linkedS2 = new LinkedHashSet<>();
		for (int i = 0; i < s2.length(); i++) {
			linkedS2.add(s2.charAt(i));
		}
		System.out.println(linkedS2);

		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();

		for (Character c : linkedS1) {
			if (linkedS2.contains(c)) {
				System.out.println("Matching : " + c);
			} else {
				System.out.println("Not Matching : " + c);
			}
		}

	}

}
