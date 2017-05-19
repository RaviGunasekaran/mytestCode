package com.java.programs;

public class SplitString {

	public static void main(String[] args) {
		String s = "ab-cd-ef-gh";
		String[] split1 = s.split("-");
		int a = s.length();
		int a1 = split1.length;

		System.out.println("Leng  S::" + a);
		System.out.println("Leng : SPLIT1: " + a1);
		for (int i = 0; i < a1; i++) {
			System.out.println("Values :" + split1[i]);
		}
	}

}
