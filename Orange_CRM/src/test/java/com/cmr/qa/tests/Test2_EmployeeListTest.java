/**
 * 
 */
package com.cmr.qa.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cmr.qa.action.Actions;
import com.cmr.qa.base.BasePage;
import com.cmr.qa.pages.AdminSystemUserPage;
import com.cmr.qa.pages.EmployeeListPage;
import com.cmr.qa.pages.LoginPage;
import com.cmr.qa.pages.PimViewMyDetails;

/**
 * @author Admin
 *
 */
public class Test2_EmployeeListTest extends BasePage {

	LoginPage login;
	EmployeeListPage employeeListPage;
	AdminSystemUserPage adminSystemUserPage;
	PimViewMyDetails pimViewMyDetails;
	
	public Test2_EmployeeListTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		launch();
		login = new LoginPage();
		
		employeeListPage = new EmployeeListPage();
	}
	
	@Test(priority=1,dataProvider = "login", dataProviderClass = Actions.class)
	public void clickAdminBtn(String usename, String pwd, String credStatus)
	{
		Actions.implictWait();
		log.info("Entering login credentials");
		employeeListPage =login.enterLoginCredentials(usename, pwd, credStatus);
		
		log.info("Clicking on the Admin btn");
		adminSystemUserPage=employeeListPage.adminBtnClick();
		
		log.info("Validating the landing page url");
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers" );
	}
	
	@Test(priority=2)
	public void getUserProfileNameTest()
	{
		Actions.implictWait();
		log.info("Entering login credentials");
		employeeListPage =login.enterLoginCredentials(prop.getProperty("username"), prop.getProperty("password"), prop.getProperty("validation"));
		String name=employeeListPage.getUserProfileName();
		Assert.assertEquals(name, "Paul Collings");
	}
	
	@Test(priority=3)
	public void myInfoBtnClick()
	{
		Actions.implictWait();
		log.info("Entering login credentials");
		employeeListPage =login.enterLoginCredentials(prop.getProperty("username"), prop.getProperty("password"), prop.getProperty("validation"));
		
		log.info("Clicking on the MyInfo menu button");
		pimViewMyDetails=employeeListPage.clickMyInfoBtn();
		
		log.info("Validating url");
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewMyDetails");
		
	}
}
