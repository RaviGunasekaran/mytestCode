package com.java.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadLogTextFile {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/rgunasekaran1/Desktop/logs/Service0.log");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		try {
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			System.out.println("Failed while Reading File : " + e);
		}
		System.out.println("Closing the File");
		br.close();
	}

}
