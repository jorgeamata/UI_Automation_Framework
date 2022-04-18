package com.projectName.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.projectName.base.Base;

public class HomePage extends Base {
	
	//Page Factory or Object Repository
		
		@FindBy(name = "name")
		@CacheLookup
		WebElement userName;
		
		@FindBy(name = "password")
		WebElement password;
		
		@FindBy(name = "")
		WebElement loginButton;
		
		@FindBy(name = "")
		WebElement forgotPasswordLink;
		
		@FindBy(name = "")
		WebElement classicCRMLink;
		
		@FindBy(name = "")
		WebElement signUpLink;

		
		
		//Constructor
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		
		
		//Actions
		public String getHomePageTitle() {
			return driver.getTitle();
		}
		
		
}
