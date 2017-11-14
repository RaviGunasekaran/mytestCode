package com.seleniumwebdriver.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RefreshPage {
	@Test
	public void pageRefresh() {
		System.setProperty("webdriver.gecko.driver", "/Users/rgunasekaran1/Downloads/Installers-All/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com/");
		driver.navigate().refresh();
		driver.close();
		driver.quit();
	}
}
