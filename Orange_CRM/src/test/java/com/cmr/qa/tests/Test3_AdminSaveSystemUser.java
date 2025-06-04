/**
 * 
 */
package com.cmr.qa.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cmr.qa.action.Actions;
import com.cmr.qa.base.BasePage;
import com.cmr.qa.pages.AdminSaveSystemUserPage;
import com.cmr.qa.pages.AdminSystemUserPage;
import com.cmr.qa.pages.EmployeeListPage;
import com.cmr.qa.pages.LoginPage;

/**
 * @author Admin
 *
 */
public class Test3_AdminSaveSystemUser extends BasePage {

	LoginPage login;
	EmployeeListPage employeeListPage;
	AdminSystemUserPage adminSystemUserPage;
	AdminSaveSystemUserPage adminSaveSystemUserPage;

	public Test3_AdminSaveSystemUser() {
		super();
	}

	@BeforeMethod
	public void setup() {
		launch();
		login = new LoginPage();

		employeeListPage = new EmployeeListPage();
		adminSystemUserPage = new AdminSystemUserPage();

	}

	@Test(priority = 1, dataProvider = "login", dataProviderClass = Actions.class)
	public void clickAddBtnTest(String usename, String pwd, String credStatus) {
		Actions.implictWait();
		log.info("Entering login credentials");
		employeeListPage = login.enterLoginCredentials(usename, pwd, credStatus);

		log.info("Clicking on the Admin btn");
		adminSystemUserPage = employeeListPage.adminBtnClick();

		log.info("Clicking on the Add btn");
		adminSaveSystemUserPage = adminSystemUserPage.clickAddBtn();

		log.info("Validating the landing page url");
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://opensource-demo.orangehrmlive.com/web/index.php/admin/saveSystemUser");

	}

	@Test(priority = 2, dataProvider = "login", dataProviderClass = Actions.class)
	public void fill_Submit_AddUserForm(String usename, String pwd, String credStatus) throws InterruptedException {
		{
			Actions.implictWait();
			log.info("Entering login credentials");
			employeeListPage = login.enterLoginCredentials(usename, pwd, credStatus);

			log.info("Clicking on the Admin btn");
			adminSystemUserPage = employeeListPage.adminBtnClick();

			log.info("Clicking on the Add btn");
			adminSaveSystemUserPage = adminSystemUserPage.clickAddBtn();
			
			log.info("Selecting the user role from the dropdown");
			adminSaveSystemUserPage.selectUserRole();
			
			log.info("Selecting the status of the user");
			adminSaveSystemUserPage.selectStatus();
			
			log.info("selecting the Employee name");
			adminSaveSystemUserPage.typeEmpName("s");
			adminSaveSystemUserPage.selectEmpName();
			
			log.info("Entering random username");
			adminSaveSystemUserPage.typeUserName(Actions.getRandomString(7));
			
			log.info("Entering password");
			adminSaveSystemUserPage.typePassword("Admin@123");
			
			log.info("confirming password");
			adminSaveSystemUserPage.confirmPassword("Admin@123");
			
			log.info("Clicking on the submit button");
			adminSystemUserPage=adminSaveSystemUserPage.clickSubmitBtn();
			
			//Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
			
//			log.info("validate the toast message");
//			adminSaveSystemUserPage.getToastMsg();
			
			
	
		}
	}
}
