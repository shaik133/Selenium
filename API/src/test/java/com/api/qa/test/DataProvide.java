/**
 * 
 */
package com.api.qa.test;

import org.testng.annotations.DataProvider;

/**
 * @author Admin
 *
 */
public class DataProvide {

	
	@DataProvider(name="ApiData")
	public String[][] getData()
	{
		String data[][]= new String[][] {{"abcd","12341"},{"efgh","5672"},{"ijkl","8901"}};

		return data;
		
		
		
	}
}
