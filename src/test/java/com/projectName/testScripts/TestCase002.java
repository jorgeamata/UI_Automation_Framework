package com.projectName.testScripts;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.projectName.testData.GetDataFromExcel;



public class TestCase002 {

	String sheetName = "contacts";
	
	@Test(dataProvider="getContactsData")
	public void testingData(String title, String firstName, String lastName, String company) {
		System.out.println(title + ", " + firstName + ", " + lastName + ", " + company);
	}
	
	@DataProvider()
	public Object[][] getContactsData() throws InvalidFormatException{
		Object data [][] = GetDataFromExcel.getTestData(sheetName);
		return data;
	}

}
