package com.java.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadLastLineOfFile {

	public static void main(String[] args) throws IOException {

		// Read only Last line of the file.
		File file = new File("/Users/rgunasekaran1/Desktop/logs/Service1.log");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String last = null, line1;
		while ((line1 = br.readLine()) != null) {
			last = line1;
		}
		System.out.println(last);
		br.close();
	}

}
