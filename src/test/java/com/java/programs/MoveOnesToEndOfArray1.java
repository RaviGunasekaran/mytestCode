package com.java.programs;

import java.util.Arrays;

public class MoveOnesToEndOfArray1 {

	public static void main(String[] args) {
		int[] a = { 0, 1, 1, 0, 0, 1, 1, 0, 0, 1 };
		int no = a.length;
		int[] b = new int[no];
		int zcount = 0;
		int ocount = no - 1;
		for (int i = 0; i < no; i++) {
			if (a[i] == 0) {
				b[zcount] = 0;
				zcount++;
			} else {
				b[ocount] = 1;
				ocount--;
			}
		}
		System.out.println(Arrays.toString(b));

	}

}
