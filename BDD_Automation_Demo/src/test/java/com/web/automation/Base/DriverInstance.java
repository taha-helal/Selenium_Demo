package com.web.automation.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import com.web.automation.Utility.ApplicationReader;

public class DriverInstance {

	public static WebDriver driver;

	
	public static WebDriver startDriverInstance() {

		if (ApplicationReader.applicationConfige("Browsername").equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver(); // Browser Will start

		} else if (ApplicationReader.applicationConfige("Browsername").equalsIgnoreCase("Firefox")) {

			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver = new FirefoxDriver(); // Browser Will start

		}else {
			
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver(); // Browser Will start
		}
		

		driver.manage().window().maximize(); // Maximizing browser window
		driver.get(ApplicationReader.applicationConfige("Application_URL"));
		//login = PageFactory.initElements(driver, Registeration.class);
		
		return driver;
	}
	
	// Retrieving Driver Instance
	public static WebDriver getDriverInstance() {
		
		if (driver!=null) {
			return driver;
		}
		else {
			
			DriverInstance.startDriverInstance();
			return driver;
		}
	
	}
	
	// set the driver is null
	public static void setDriverNull () {
		
		driver =null;
		
	}


}
