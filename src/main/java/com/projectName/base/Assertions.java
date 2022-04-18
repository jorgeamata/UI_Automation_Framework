package com.projectName.base;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Assertions {
	
	public static boolean isElementDisplayed(WebElement element) {
		try {
			element.isDisplayed();
			System.out.println("PASSED-element displayed: " + element.getText());
			return true;
		} catch(org.openqa.selenium.NoSuchElementException e) {
			System.out.println("FAILED-element is not displayed: " + element.getText());
			return false;
		}	
	}
	
	public static boolean verifyAssert(String actualString, String expectedString) {
		try {
			Assert.assertTrue(actualString.contains(expectedString));
			System.out.println("PASSED-strings match actual/expected: " + actualString + " / " + expectedString);
	       	return true;
		} catch(AssertionError e) {
			System.out.println("FAILED-strings mismatch actual/expected: " + actualString + " / " + expectedString);	     
	        return false;
		}
	}
	
	
	
	
	

}