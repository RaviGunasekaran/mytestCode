package com.tests.library;

import org.apache.log4j.Logger;
import org.openqa.grid.web.servlet.handler.WebDriverRequestFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	// static Logger logger = Logger.getLogger(WebDriverProvider.class);
	// System.out.println("Called Class Name: "+this.getClass().getName());
	static WebDriver driver;
	Logger logger;

	static public Logger initLogger(String string) {
		return Logger.getLogger(string);
	}

	public WebDriver initDriver(String Browser) {
		return getDriver(Browser);
	}

	static public WebDriver getDriver(String Browser) {
		switch (Browser) {
		case "FF":
			driver = new FirefoxDriver();
			break;
		case "Chrome":
			driver = new ChromeDriver();
			break;
		default:
			driver = new FirefoxDriver();
			break;
		}
		return driver;
	}

}
