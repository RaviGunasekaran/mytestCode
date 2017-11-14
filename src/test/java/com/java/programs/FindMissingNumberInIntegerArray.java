package com.java.programs;

import java.util.ArrayList;

public class FindMissingNumberInIntegerArray {

	public static void main(String[] args) {
		String[] col1 = { "1", "2", "3", "4", "5", "6" };
		String[] col2 = { "1", "2", "3", "5" };
		ArrayList<String> in = new ArrayList<>();
		ArrayList<String> out = new ArrayList<>();
		for (int i = 0; i < col1.length; i++) {
			in.add(i, col1[i]);
		}
		for (int i = 0; i < col2.length; i++) {
			out.add(i, col2[i]);
		}

		for (Object c1 : in) {
			System.out.println("COL 1 : " + c1);
		}

		for (Object c2 : out) {
			System.out.println("COL 2 : " + c2);
		}

		for (Object check : in) {
			if (!out.contains(check)) {
				System.out.println("MISSING :" + check);
			}
		}

	}

}
