package com.projectName.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.projectName.base.Base;

public class Screenshot extends Base {
	
	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
		File source = takeScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "/FailedTestScenarios/" + screenshotName + dateName
							+ ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		
		return destination;
	}

}
