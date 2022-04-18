package com.projectName.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.projectName.base.Base;

public class LoginPage extends Base {
	
	//Page Factory or Object Repository
	@FindBy(name = "name")
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
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Actions
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}
	
	public HomePage login(String user, String pwd) {
		userName.sendKeys(user);
		password.sendKeys(pwd);
		loginButton.click();
		
		return new HomePage();
	}
	
	public void clickOnForgotPasswordLink() {
		
	}
	
	public void clickOnClassicCRMLink() {
		
	}
	
	public void clickOnSignUpLink() {
		
	}
	
	
	

}
