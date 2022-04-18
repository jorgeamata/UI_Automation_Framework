package com.projectName.base;

public class WebDriverSteps extends Base {
	

	//Open application
	public static void navigateToApplication(){
		System.out.println("Opening web application");											
	    
		String url = prop.getProperty("url");
	    driver.get(url);
	    
	    System.out.println("URL opened");
	}
	
	//Switch to frame
	public static void switchToFrame() {
		driver.switchTo().frame("");
	}
	
	public static void navigateBack() {
		driver.navigate().back();
	}
	
	public static void navigateForward() {
		driver.navigate().forward();
	}
	
	public static void switchToSecondTab() {}
	
	public static void switchToFirstTab() {}
	
	public static void switchToIframe() {}
	
	public static void switchBackToIframe() {} 
	
	public static void switchToNewWindow() {}
	
	public static void switchBackFromNewWindow() {}

}
