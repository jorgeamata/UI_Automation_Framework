package com.projectName.base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverSession extends Base {
	
	public static void initializeDriver(String browserName) {
		System.out.println("Browser name is : " + browserName);
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\jalopez5\\eclipse-workspace\\AutomationHybridFramework\\drivers\\chromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.firefox.driver", "C:\\Users\\jalopez5\\eclipse-workspace\\AutomationHybridFramework\\drivers\\firefoxDriver\\geckodriver.exe");
			driver = new FirefoxDriver();		
		} else {
			System.out.println("Browser is not supported");
		}
		
		
		
		/*
		switch(browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\jalopez5\\eclipse-workspace\\AutomationHybridFramework\\drivers\\chromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.firefox.driver", "C:\\Users\\jalopez5\\eclipse-workspace\\AutomationHybridFramework\\drivers\\firefoxDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Browser is not supported");
			break;
		}
		*/
			
	}
	
	
	
	
	public static void quitDriver() {
		driver.quit();
	}

}
