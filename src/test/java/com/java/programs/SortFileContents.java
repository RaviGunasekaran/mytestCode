package com.java.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SortFileContents {

	public static void main(String[] args) throws IOException {
		System.out.println("File Reading Started");
		File file = new File("/Users/rgunasekaran1/Desktop/Service10.log");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		Map<String, String> map = new TreeMap<String, String>();
		String line;
		try {
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				map.put(getField(line), line);
			}
		} catch (Exception e) {
			System.out.println("Failed while Reading File : " + e);
		}
		System.out.println("Closing the File");
		br.close();
		System.out.println("*****	File Reading Completed		******");
		System.out.println("*****	File Writing Started		******");
		FileWriter writer = new FileWriter("/Users/rgunasekaran1/Desktop/Service101.log");
		for (String val : map.values()) {
			writer.write(val);
			writer.write('\n');
		}
		writer.close();
		System.out.println("*****	File Writing Completed		******");

		System.out.println("*****	File VALIDATAION Completed		******");
		fr = new FileReader(file);
		br = new BufferedReader(fr);
		try {
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			System.out.println("Failed while Reading File : " + e);
		}
		System.out.println("Closing the File AFTER VALIDATION");
		br.close();
	}

	private static String getField(String line) {
		return line.split(" ")[0];// extract value you want to sort on
	}
}
