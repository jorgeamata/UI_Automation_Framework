package com.projectName.utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class RetryAnalyzer implements IRetryAnalyzer{

	//This logic is at the test level, need to be specified on each test case
	//@Test(retryAnalyzer = com.projectName.utilities.RetryAnalyzer.class)
	
	int counter = 0;
	int retryLimit = 2;
	
	public boolean retry(ITestResult result) {
		if(counter < retryLimit) {
			counter++;
			return true;
		}
		return false;
	}

}
