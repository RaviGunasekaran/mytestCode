package com.tests.library;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class WebDriverProvider {
	static Logger logger = Logger.getLogger(WebDriverProvider.class);
	public WebDriver driver;
	String FFdriverpath;
	String Chromedriverpath;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public String getFFdriverpath() {
		return FFdriverpath;
	}

	public void setFFdriverpath() {
		this.FFdriverpath = System.setProperty("webdriver.gecko.driver",
				"/Users/rgunasekaran1/Downloads/Installers-All/geckodriver");
		writeInfoLogger("FireFox Driver Path Setting completed...");
	}

	public void setChromedriverpath() {
		Chromedriverpath = System.setProperty("webdriver.chrome.driver",
				"/Users/rgunasekaran1/Downloads/Installers-All/chromedriver");
		writeInfoLogger("Chrome Driver Path Setting completed...");
	}

	public WebDriver initWebDriver(String DriverType) {
		switch (DriverType) {
		case "FF":
			setFFdriverpath();
			driver = new FirefoxDriver();
			this.driver = driver;
			writeInfoLogger("FireFor Driver Initiated....");
			break;
		case "Chrome":
			setChromedriverpath();
			driver = new ChromeDriver();
			this.driver = driver;
			writeInfoLogger("Chrome Driver Initiated....");
			break;
		default:
			driver = new FirefoxDriver();
			this.driver = driver;
			writeInfoLogger("Default : FireFor Driver Initiated....");
			break;
		}
		return driver;
	}

	@BeforeSuite
	public void beforeSuite() {
		writeInfoLogger("$$$$$$$$$ Before Suite $$$$$$$$$$");
	}

	@BeforeTest
	public void beforeTest() {
		writeInfoLogger("$$$$$$$$$ Before Test $$$$$$$$$$");
	}

	@AfterTest
	public void AfterTest() {
		writeInfoLogger("$$$$$$$$$ After Test $$$$$$$$$$");
		driver.close();
		driver.quit();
		writeInfoLogger("Driver Successfully Closed...");
	}

	static protected void writeInfoLogger(String msg) {
		System.out.println(msg);
		logger.info(msg);
	}
}
