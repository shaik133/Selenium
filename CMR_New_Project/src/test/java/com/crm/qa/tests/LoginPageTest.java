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

import com.crm.qa.basePackage.BasePage;
import com.crm.qa.pages.ClassicCRMPage;
import com.crm.qa.pages.ForgotPwdPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignupPage;
import com.crm.qa.pages.crmLandingPage;
import com.crm.qa.xlutility.xlutillity;

/**
 * @author Admin
 *
 */
public class LoginPageTest extends BasePage{

	crmLandingPage landingPage;
	LoginPage loginPage;
	HomePage homePage;
	ForgotPwdPage forgotPwdPage;
	ClassicCRMPage classicCRMPage;
	SignupPage signupPage;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		Launch();
		
		landingPage= new crmLandingPage();
		loginPage=landingPage.clickLoginBtn();	
	}
	
	
	
//	@Test(priority=1)
//	public void getPageTitleTest()
//	{
//		String title = loginPage.getPagetitle();
//		Assert.assertEquals(title, "Cogmento CRM");
//	}
	
	@Test(priority=2,dataProvider="loginData")
	public void loginTest(String username, String password)
	{
		//homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		homePage= loginPage.login(username, password);
	}
	
//	@Test(priority=3)
//	public void forgotPwdTest()
//	{
//		forgotPwdPage=loginPage.forgotPwd();
//	}
	
//	@Test(priority=4)
//	public void classicCRMPageTest()
//	{
//		classicCRMPage=loginPage.classicCRM();
//	}
//	
//	@Test(priority=5)
//	public void signupTest()
//	{
//		signupPage=loginPage.signup();
//	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	@DataProvider(name="loginData")
	public static String[][] getData() throws IOException
	{
		String filepath = System.getProperty("user.dir")+"\\src\\main\\java\\com\\crm\\qa\\xlutility\\Misconceptions.xlsx";
		int totalRow=xlutillity.getRowCount(filepath, "Sheet1");
		int totalcell= xlutillity.getCellCount(filepath, "Sheet1", 1);
		String loginData[][]= new String[totalRow][totalcell];
		for(int i=1;i<=totalcell;i++)
		{
			for(int j=0; j<totalcell;j++)
			{
				loginData[i-1][j]=xlutillity.getCellData(filepath, "Sheet1", i, j);
			}
		}
		return loginData;
	}
}
