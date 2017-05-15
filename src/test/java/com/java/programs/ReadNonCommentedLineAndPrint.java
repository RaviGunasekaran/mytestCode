package com.java.programs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadNonCommentedLineAndPrint {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/rgunasekaran1/Desktop/logs/HashFileConents.txt");
		File outputFile = new File("/Users/rgunasekaran1/Desktop/logs/HashFileOutputConents.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter(outputFile);
		BufferedWriter bw = new BufferedWriter(fw);
		String line = "";
		;
		while ((line = br.readLine()) != null) {
			if (line.trim().startsWith("#")) {
				System.out.println(line.trim());
				bw.write(line);
			}
		}
		br.close();
		bw.close();
	}

}
