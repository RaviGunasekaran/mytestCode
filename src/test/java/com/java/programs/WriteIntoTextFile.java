package com.java.programs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoTextFile {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/rgunasekaran1/Desktop/Service10.log");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		System.out.println("Writing Into File");
		try {
			bw.append("THIS LINE SHOULD BE APPENDED @ START");
			bw.write("Welcome this is 1st Line");
			bw.newLine();
			bw.write(37);
			bw.newLine();
			bw.write("End of Write", 2, 6);
			bw.append("THIS LINE SHOULD BE APPENDED @ END");
			bw.close();
			System.out.println("Closing the File");
		} catch (Exception e) {
		}

		System.out.println("Verify The Updated File");

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

	}

}
