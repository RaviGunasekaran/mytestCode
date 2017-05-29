package com.java.programs;

public class FindVisibleHeights {

	public static void main(String[] args) {
		// int[] heights = { 4, 5, 6, 3, 2, 7 };// Set1
		// int[] heights = { 40, 5, 6, 3, 2, 7 };// Set2
		// int[] heights = { 4, 4, 4, 4, 4, 4 };// Set3
		int[] heights = { 1, 2, 3, 4, 5, 6 };// Set4
		int cnt = 1, j = 1, max = heights[0];
		System.out.println("I Can See : " + max);
		for (int i = 1; i < heights.length; i++) {
			if (max < heights[j]) {
				cnt++;
				max = heights[j];
				System.out.println("I Can See : " + max);
			}
			j++;
		}
		System.out.println("Can See Count: " + cnt);
	}
}
