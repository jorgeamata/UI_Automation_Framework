package com.projectName.testScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.projectName.base.Base;
import com.projectName.pageObjects.HomePage;
import com.projectName.pageObjects.LoginPage;

public class HomePageTests extends Base {
	
	//Create variables for pageObject
		LoginPage loginPage;
		HomePage homePage;
		String user = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		//Calling the constructor of Parent class
		public HomePageTests() {
			super(); 
		}
		
		//Setup pre-requisites for your test cases
		@BeforeMethod
		public void init() {
			initializeDriverSession();
			loginPage = new LoginPage();
			homePage = loginPage.login(user, password);
		}
		
		//Test cases
		public void validateCurrentURL() {
			
		}
		
		public void validateUserName() {
			
		}

		//Close driver session
		@AfterMethod
		public void tearDown() {
			quitDriverSession();
		}
}
