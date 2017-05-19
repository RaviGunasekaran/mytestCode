package com.java.programs;

public class FindOnlyUniqueFromInterArray {

	public static void main(String[] args) {
		int arr[] = { 10, 1, 10, 3, 10, 1, 1, 2, 3, 3, 200 };
		printDistinctElements(arr);

	}

	public static void printDistinctElements(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean isDistinct = false;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
					isDistinct = true;
					break;
				}
			}
			if (!isDistinct) {
				System.out.print(arr[i] + " ");
			}
		}

	}
}
