package com.java.programs;

import java.util.Arrays;

public class SortCharacterArray {

	public static void main(String[] args) {
		char[] a = { 'a', 'e', 'f', 'a' };
		for (int i = 0; i < a.length; i++) {
			Arrays.sort(a);
			System.out.println(i + " = " + a[i]);

		}

	}

}
