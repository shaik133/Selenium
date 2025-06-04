/**
 * 
 */
package com.crm.qa.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.basepage.BasePage;
import com.crm.qa.pages.HomePage;

import com.crm.qa.pages.SigninPage;
import com.crm.qa.xlutility.xlutil;

/**
 * @author Admin
 *
 */
public class SigninPageTest extends BasePage {

   // LandingPage landingPage;
    SigninPage signinPage;
 HomePage homePage;
    
	public SigninPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		launch();
		//landingPage = new LandingPage();
		//signinPage = landingPage.loginClick();
		 signinPage= new SigninPage();
		
	}
	
	
	@Test(priority=1)
	public void getTitleTest()
	{
		String title= signinPage.getTitleName();
		Assert.assertEquals(title, "CRMPRO Log In Screen");
	}
	
	@Test(priority=2,dataProvider="loginData")
	public void loginFormTest(String uname, String pwd)
	{
		//homePage=signinPage.loginForm(prop.getProperty("username"), prop.getProperty("password"));
		homePage=signinPage.loginForm(uname, pwd);
		homePage.getTitle();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	@DataProvider(name="loginData")
	public String[][] getData() throws IOException
	{
		String path = null;
		try {
		 path= System.getProperty("user.dir")+"\\excellFile\\Misconceptions.xlsx";
		 
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		int TotalRow= xlutil.getRowCount(path, "Sheet1");
		int TotalCell=xlutil.getCellCount(path, "Sheet1", 1);
		
		String loginData[][]= new String[TotalRow][TotalCell];
		for (int i=1;i<=TotalRow;i++)
		{
			for (int j=0;j<TotalCell;j++)
			{
				loginData[i-1][j]=xlutil.getCellData(path, "Sheet1", i, j);
				
			}
		}
		return loginData;
	}
}
