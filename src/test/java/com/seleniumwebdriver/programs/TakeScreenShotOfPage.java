package com.seleniumwebdriver.programs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TakeScreenShotOfPage {
	@Test
	public void takingScreenShotOfPage() throws IOException, InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com/");
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy
		// somewhere
		FileUtils.copyFile(scrFile, new File("/Users/rgunasekaran1/Desktop/logs/screenshot.png"));
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
}
