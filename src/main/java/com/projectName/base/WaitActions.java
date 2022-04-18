package com.projectName.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WaitActions extends Base {
	
	public static void setImplicitWait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	
	public static void waitForElementToBeVisible(WebElement element, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(element));
		
		Assert.assertTrue(Assertions.isElementDisplayed(element));
	}
	
	public static void waitForElementText(WebElement element, String expectedText, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.textToBePresentInElement(element, expectedText));
		
		Assert.assertTrue(Assertions.isElementDisplayed(element));				
	}
	
	public static void waitForAlert(WebElement element, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static void waitForElementToBeClickable(WebElement element, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void waitForElementToBeSelected(WebElement element, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	
	
	

}
