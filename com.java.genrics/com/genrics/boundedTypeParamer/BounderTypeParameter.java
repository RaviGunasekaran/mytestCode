package com.genrics.boundedTypeParamer;

public class BounderTypeParameter {

	public static <T extends Comparable<T>> int countMe(T[] anArray, T elem) {
		int count = 0;
		for (T e : anArray)
			if (e.compareTo(elem) > 0)
				++count;
		return count;
	}
	
	
	public static <T extends Comparable<T>> T addMe(T e1, T e2) {
		//T e3 = e1.compareTo(e2);
		return e1;//TODO how to add the Types
	} 
}
