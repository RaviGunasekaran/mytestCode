package com.java.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Get log files from Directory Sort the file content by Date Time Stamp Print
 * only 10 lines.
 * 
 * @author Ravi.G
 *
 */
public class GetFilesFromDirectory {

	public static void main(String[] args) throws IOException {
		String basePath = "/Users/rgunasekaran1/Desktop/logs";
		File folder = new File(basePath);
		for (File filename : folder.listFiles()) {
			String logFile = filename.getName();
			System.out.println("logFile : " + logFile);
			File file = new File(basePath, filename.getName());
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

	void sortFileConent(File file) throws IOException {
		ArrayList<String> rows = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new FileReader("input.txt"));

		String s;
		while ((s = reader.readLine()) != null)
			rows.add(s);

		Collections.sort(rows);

		FileWriter writer = new FileWriter("output.txt");
		for (String cur : rows)
			writer.write(cur + "\n");

		reader.close();
		writer.close();
	}

}
