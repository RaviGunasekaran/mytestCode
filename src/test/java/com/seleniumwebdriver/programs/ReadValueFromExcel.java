package com.seleniumwebdriver.programs;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadValueFromExcel {
	@Test
	public void readValueFromExcel() throws BiffException, IOException {

		Workbook wb = null;
		File inputfile = new File("/Users/rgunasekaran1/Downloads/TestFiles/Testdata.xls");
		wb = Workbook.getWorkbook(inputfile);

		for (int sheetNo = 0; sheetNo < wb.getNumberOfSheets(); sheetNo++) {
			Sheet sheet = wb.getSheet(sheetNo);
			int columns = sheet.getColumns();
			int rows = sheet.getRows();
			System.out.println("No of Rows: " + rows);
			System.out.println("No of Columnx: " + columns);
			System.out.println("Sheet Name: \t" + wb.getSheet(sheetNo).getName());
			for (int row = 1; row < rows; row++) {
				for (int col = 0; col < columns;) {
					String username = sheet.getCell(col, row).getContents();
					System.out.println(username);
					col++;
					String password = sheet.getCell(col, row).getContents();
					System.out.println(password);
					col++;
				}
				System.out.println("\n");
			}
		}
	}
}
