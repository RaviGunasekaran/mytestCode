package com.java.programs;

import java.util.Arrays;

public class NthSmallestNumberInAnIntegerArray {

	public static void main(String[] args) {
		int[] array = {4,2,3,5,6};
		 System.out.println(findNthSmallest(array, 1));

	}
	public static int findNthSmallest(int[] array, int n) {
	    Arrays.sort(array);
	    return array[n-1];
	}
	
	 public static int findNthSmallestWithoutInbuildMethod( int array[], int n  ){
		    int i, j,t=0;
		    for(i = 0; i < n; i++){
		      for(j = 1; j < (n-i); j++){
		        if(array[j-1] > array[j]){
		          t = array[j-1];
		          array[j-1]=array[j];
		          array[j]=t;
		        }
		      }
		    }

		    return array[n-1];
		  }
}
