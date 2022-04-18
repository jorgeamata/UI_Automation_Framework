package com.projectName.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.log4testng.Logger;

import com.projectName.utilities.TestUtils;

public class Base {
	
	//public static RemoteDriver driver;
	//public static Logger log = Logger.getLogger(Class.class);
	public static WebDriver driver;
	public static Properties prop;
	
	
	//Constructor
	public Base() {
		try {
			prop = new Properties();
			FileInputStream inputStream = new FileInputStream("C:\\Users\\jalopez5\\eclipse-workspace\\AutomationHybridFramework\\src\\main\\java\\com\\projectName\\config\\system.properties");
			prop.load(inputStream);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void initializeDriverSession() {
		String browserName = prop.getProperty("browser");
		WebDriverSession.initializeDriver(browserName); 
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();  
		//In case application is very slow
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS); //handling timeouts
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS); //handling implicit waits
	
		WebDriverSteps.navigateToApplication(); //Navigate to application
	}
	
	
	@AfterMethod
	public void quitDriverSession() {
		WebDriverSession.quitDriver();
	}
	
	public static void takeScreenshot() throws IOException {
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		
		FileUtils.copyFile(sourceFile, new File(currentDir + "\\screenshots\\" + System.currentTimeMillis() + ".png"));
	}
	
	
	

}
