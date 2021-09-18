package com.crm.qa.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.util.TestUtil;

public class DataProviderExample {

//	public static TestUtil testUtil;
//
//	@Test(priority = 1)
//	public void readDataParameterization() {
//		testUtil = new TestUtil();
//	}


	@DataProvider
	public Object[][] getCRMTestData(){
		Object data[][] = TestUtil.getTestData("contacts");
		return data;
	}


	@Test(priority = 2, dataProvider="getCRMTestData")
	public void validateCreateNewContact(String title, String firstName, String lastName, String company){

		System.out.println(title + "" + firstName + "" + lastName +"" + company);
	
	
	
	
	}

}
