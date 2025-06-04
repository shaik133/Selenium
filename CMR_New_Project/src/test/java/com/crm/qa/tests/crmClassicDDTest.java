/**
 * 
 */
package com.crm.qa.tests;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.basePackage.BasePage;
import com.crm.qa.pages.crmClassicPageDD;
import com.crm.qa.xlutility.xlutillity;

/**
 * @author Admin
 *
 */
public class crmClassicDDTest extends BasePage{

	crmClassicPageDD crmClassic;
	
	public crmClassicDDTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		Launch();	
		 crmClassic= new crmClassicPageDD();
	}
	
	@Test(dataProvider="loginData")
	
	public void crmClassicDDTest(String username, String pwd) 
	{
		
		crmClassic.Login(username, pwd);
	}
	
	@DataProvider(name="loginData")
	public String[][] getData() throws IOException
	{
		String filepath= System.getProperty("user.dir")+"\\src\\main\\java\\com\\crm\\qa\\xlutility\\Misconceptions.xlsx";
		
		int totalRow= xlutillity.getRowCount(filepath, "Sheet1");
		int totalcell=xlutillity.getCellCount(filepath, "Sheet1", 1);
		
		
		String data[][]= new String [totalRow][totalcell];
		for (int i=1; i<=totalRow;i++)
		{
			for (int j=0;j<totalcell;j++)
			{
				data[i-1][j]=xlutillity.getCellData(filepath, "Sheet1", i, j);
			}
		}
		return data;
	}
}
