package com.java.programs;

import java.util.Arrays;

public class MoveZerosToEndOfArray {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 1, 0, 0, 1, 1, 0, 0, 1 ,0};
		
		   int count = 0;  // Count of non-zero elements
		   
	        // Traverse the array. If element encountered is
	        // non-zero, then replace the element at index 'count'
	        // with this element
	        for (int i = 0; i < arr.length; i++)
	            if (arr[i] != 0)
	                arr[count++] = arr[i]; // here count is
	                                       // incremented
	 
	        // Now all non-zero elements have been shifted to
	        // front and 'count' is set as index of first 0.
	        // Make all elements 0 from count to end.
	        while (count < arr.length)
	            arr[count++] = 0;
	        
	        System.out.println("Array : "+Arrays.toString(arr));
		
/*		int[] b = new int[a.length];
		int cnt=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==1){
				cnt++;
			}
			System.out.println("cnt : "+cnt);
		}
		for (int i = 0; i < cnt; i++) {
			b[i]=0;
		}
		for (int i = (cnt+1); i < b.length; i++) {
			b[i]=1;
		}
		
			System.out.println("Array : "+Arrays.toString(b));*/
	}

}
