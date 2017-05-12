package com.java.programs;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;

public class CompareFileContents {

	public static void main(String[] args) throws IOException {
		File file1 = new File("/Users/rgunasekaran1/test/file1.txt");
		File file2 = new File("/Users/rgunasekaran1/test/file2.txt");
		File file3 = new File("/Users/rgunasekaran1/test/file3.txt");
		System.out.println("File1 Vs File2 :"+FileUtils.contentEquals(file1, file2));
		System.out.println("File1 Vs File3 :"+FileUtils.contentEquals(file1, file3));
	}
}
