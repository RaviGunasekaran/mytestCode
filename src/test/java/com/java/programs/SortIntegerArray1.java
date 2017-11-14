package com.java.programs;

import java.util.Arrays;

public class SortIntegerArray1 {

	public static void main(String[] args) {
		int[] num = { 1, 5, 855, 7120, 7 };
		for (int i = 0; i < num.length; i++) {
			Arrays.sort(num);
			System.out.println("Print - order :" + num[i]);
		}

	}

}
