package com.webdriver.support;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.log4testng.Logger;

public class BaseClass {

	private static WebDriver driver;
	private Properties properties = new Properties();
	private File file;
	Logger logger = Logger.getLogger(this.getClass());

	public BaseClass() throws IOException {
		if (driver == null) {
			String workingDir = System.getProperty("user.dir");
			file = new File(workingDir + "/com.tests.seleniumframework/config.properties");
			InputStream fileInput = new FileInputStream(file);
			properties.load(fileInput);
			initDriver(properties.getProperty("browser"));
			driver.get(properties.getProperty("BaseUrl"));
			fileInput.close();
		}
	}

	private WebDriver initDriver(String browser) {
		switch (browser) {
		case "FireFox":
			System.setProperty("webdriver.gecko.driver", properties.getProperty("firefoxDriverPath"));
			driver = new FirefoxDriver();
			break;
		case "Chrome":
			System.setProperty("webdriver.gecko.driver", properties.getProperty("ChromeDriverPath"));
			driver = new ChromeDriver();
			break;
		default:
			driver = new FirefoxDriver();
			break;
		}
		return driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void click(WebElement element) {
		element.click();
	}

	public void click(By element) {
		getDriver().findElement(element).click();
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		logger.info("Closing Driver...");
		driver.quit();
		logger.info("Quit Driver...");
	}
}
