package com.seleniumwebdriver.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WaitForAjaxCall {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		  while (true) // Handle timeout somewhere
		    {
//		         boolean ajaxIsComplete = (driver as IJavaScriptExecutor).ExecuteScript("return jQuery.active == 0");
//		        if (ajaxIsComplete)
//		            break;
//		        Thread.sleep(100);
		    }
	}

}
