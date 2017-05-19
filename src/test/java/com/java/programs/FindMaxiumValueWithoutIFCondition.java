package com.java.programs;

/**
 * Function to find maximum of x and y : AND : Function to find Minimum of x and
 * y
 * 
 * @author Ravi.G
 *
 */
public class FindMaxiumValueWithoutIFCondition {
	public static void main(String[] args) {
		max(100, 10);
		min(1, 2);

	}

	static int max(int x, int y) {
		int max = x > y ? x : y;
		System.out.println("Maximum: " + max);
		return max;
	}

	static int min(int x, int y) {
		int min = x < y ? x : y;
		System.out.println("Minimum: " + min);
		return min;
	}

}
