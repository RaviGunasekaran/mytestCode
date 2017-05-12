package com.java.programs;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
/**
 * 
 * @author Ravi.G
 *
 */
public class ExcelDataProvider {

	@DataProvider(name = "readfromxls")
	public Object[][] testmydata() throws BiffException, IOException {
		System.out.println("You are inside readfromxls data provider");
		File datafile = new File(
				"/Users/rgunasekaran1/eclipse/WorkSpace_All/testAPIs/SimpleTests_ALL/testdata/usertestdata.xls");
		Workbook wb = Workbook.getWorkbook(datafile);
		Sheet sheet = wb.getSheet(0);
		System.out.println("SheetName: " + sheet.getName());
		int rows = sheet.getRows();
		int columns = sheet.getColumns();
		System.out.println("Columns: " + columns);
		System.out.println("Rows: " + rows);
		Object[][] data = new Object[columns][rows];
		System.out.println("Length of Data : " + data.length);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println("CELL: " + i + " and " + j + " = " + sheet.getCell(j, i).getContents());
				data[j][i] = sheet.getCell(j, i).getContents();
			}
		}
		return data;
	}

	@Test(dataProvider = "readfromxls")
	public void DataProviders(String data1, String data2, String data3, String data4) {
		System.out.println(" *******       $$$$$$$$$$$   **********");
		System.out.println("UserName is : " + data1);
		System.out.println("UserName is : " + data2);
		System.out.println("Password is : " + data3);
		System.out.println("Password is : " + data4);
	}

}
