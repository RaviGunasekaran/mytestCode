package com.java.programs;

import java.util.ArrayList;

public class RemoveDuplicateFromArrayList {

	public static void main(String[] args) {
		String[] col = { "1", "2", "3", "3" };
		ArrayList<String> in = new ArrayList<>();
		ArrayList<String> out = new ArrayList<>();
		for (int i = 0; i < col.length; i++) {
			in.add(i, col[i]);
			System.out.println("Added input :" + in);
		}
		for (Object input_data : in) {
			System.out.println("AVILABLE input :" + input_data);
		}

		for (Object output_data : in) {
			if (!out.contains(output_data)) {
				out.add((String) output_data);
				System.out.println("NO - DUPLICATE:" + out);
			}
		}
		for (Object FINAL_data : out) {
			System.out.println("FINAL_data OUTPUT :" + FINAL_data);
		}

	}

}
