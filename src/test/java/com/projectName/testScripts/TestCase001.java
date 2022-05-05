package com.projectName.testScripts;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.projectName.base.Base;
import com.projectName.pageObjects.LoginPage;
import com.projectName.testData.GetDataFromExcel;

//@Listeners(com.projectName.utilities.ListenerTest.class)

public class TestCase001 extends Base {

	// Setup pre-requisites for your test cases
	@BeforeMethod
	public void init() {
		initializeDriverSession();
	}

	// Tests
	@Test
	public void test1() {
		String actualResult = "actual";
		String expectedResult = "expected";
		System.out.println("Test 1");
		logger.debug("logger");

		Assert.assertEquals(actualResult, expectedResult, "Does not match");
	}

	@Test
	public void test2() {
		System.out.println("Test 2");
	}

	// Close driver session
	@AfterMethod
	public void tearDown() {
		quitDriverSession();
	}

}
