package com.java.programs;

import java.util.LinkedHashMap;

/**
 * Swap the Data from file. If 10 lines is given, line1 need to be move to
 * Line10, line9 to line2 vice versa.
 * 
 * @author Ravi.G
 *
 */
public class SwapDataOfFile {

	public static void main(String[] args) {
		swapLinesOfFile(10);
	}

	public static void swapLinesOfFile(int n) {
		System.out.println("Total Lines in File : " + n);
		if ((n % 2) == 0) {
			System.out.println("Valid Number- Line Swap will continue...");
		} else {
			System.out.println("SORRY! - Invalid Number- Can't Swap Line of Given File...");
			return;
		}

		LinkedHashMap<Integer, String> file = new LinkedHashMap<>();
		for (int i = 1; i <= n; i++) {
			file.put(i, ("LineNumber" + i));
		}

		System.out.println("Given Input : " + file);

		System.out.println("Finding Mid Point...");

		int startPoint = 1;
		int midPoint1 = n / 2;
		int midPoint2 = midPoint1 + 1;
		int endPoint = n;
		System.out.println("1ST TIME : startPoint:" + startPoint + " && midPoint1:" + midPoint1);
		for (int K = 0; K < 2; K++) {
			for (int i = midPoint1; i >= startPoint; i--) {
				String tmp1 = file.get(i);
				file.put(i, file.get(startPoint));
				file.put(startPoint, tmp1);
				midPoint1 = i;
				startPoint = startPoint + 1;
				System.out.println(file);
			}
			startPoint = midPoint2;
			midPoint1 = endPoint;
			System.out.println("2ND TIME : 2NDstartPoint:" + startPoint + " && endPoint:" + midPoint1);
		}
	}

}
