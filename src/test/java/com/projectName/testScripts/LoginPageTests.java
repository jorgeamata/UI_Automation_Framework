package com.projectName.testScripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.projectName.base.Base;
import com.projectName.pageObjects.HomePage;
import com.projectName.pageObjects.LoginPage;

public class LoginPageTests extends Base {
	
	//Create variable for pageObject
	LoginPage loginPage;
	HomePage homePage;
	
	//Calling the constructor of Parent class
	public LoginPageTests() {
		super(); 
	}
	
	//Setup pre-requisites for your test cases
	@BeforeMethod
	public void init() {
		initializeDriverSession();
		loginPage = new LoginPage();
	}
	
	//Test cases
	@Test
	public void validateCurrentURL() {
		String currentURL = loginPage.getCurrentURL();
		String expectedURL = "https://ui.freecrm.com/";
		
		Assert.assertEquals(currentURL, expectedURL);
	}
	
	public void validateSuccessfulLogin() {
		String user = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		homePage = loginPage.login(user, password);
		String actualTitle = homePage.getHomePageTitle();
		String expectedTitle = "Cogmento CRM";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	
	
	//Close driver session
	@AfterMethod
	public void tearDown() {
		quitDriverSession();
	}

}
