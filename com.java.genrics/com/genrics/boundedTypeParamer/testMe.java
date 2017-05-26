package com.genrics.boundedTypeParamer;

import java.lang.reflect.Array;

import jxl.biff.drawing.TextObjectRecord;

public class testMe {

	// public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
	// T max = x; // assume x is initially the largest
	//
	// if (y.compareTo(max) > 0) {
	// max = y; // y is the largest so far
	// }
	//
	// if (z.compareTo(max) > 0) {
	// max = z; // z is the largest now
	// }
	// return max; // returns the largest object
	// }
	//
	// public static void main(String args[]) {
	// System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 4, 5, maximum(3,
	// 4, 5));
	//
	// System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7,
	// maximum(6.6, 8.8, 7.7));
	//
	// System.out.printf("Max of %s, %s and %s is %s\n", "pear", "apple",
	// "orange",
	// maximum("pear", "apple", "orange"));
	// }

	public static void main(String[] args) {
		System.out.println(BounderTypeParameter.addMe("Apple", "Orange"));
		System.out.println(BounderTypeParameter.addMe(3, 2));
		System.out.println(BounderTypeParameter.addMe(3.4, 2.5));
		System.out.println(BounderTypeParameter.addMe('c', 'h'));
	}

}
