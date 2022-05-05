package com.projectName.testScripts;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.projectName.base.Base;

public class TestLog4J{
	
	//What is log? : capturing info/activities at the time of program execution. 
		// types of logs:
			//1. info
			//2. warn
			//3. debug
			//4. fatal
			
		//how to generate the logs? : use Apache log4j API (log4j jar)
		//How it works? : it reads log 4j configuration from log4j.properties file
		//where to create: create inside resources folder
	
	Logger log = Logger.getLogger(TestLog4J.class);
	
	@Test
	public void testLog4J() {
		log.info("****************************** Starting test cases execution  *****************************************");
		String actualResult = "actual";
		String expectedResult = "expected";
		System.out.println("Test 1");

		Assert.assertEquals(actualResult, expectedResult, "Does not match");
		log.info("****************************** ending test case *****************************************");
	}

}
