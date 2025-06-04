/**
 * 
 */
package com.cmr.qa.tests;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cmr.qa.action.Actions;
import com.cmr.qa.base.BasePage;
import com.cmr.qa.pages.AdminSaveSystemUserPage;
import com.cmr.qa.pages.AdminSystemUserPage;
import com.cmr.qa.pages.EmployeeListPage;
import com.cmr.qa.pages.LoginPage;
import com.cmr.qa.pages.PimViewMyDetails;

/**
 * @author Admin
 *
 */
public class Test4_PimViewMyDetails extends BasePage {

	LoginPage login;
	EmployeeListPage employeeListPage;
	AdminSystemUserPage adminSystemUserPage;
	AdminSaveSystemUserPage adminSaveSystemUserPage;
	PimViewMyDetails pimViewMyDetails;
	public Test4_PimViewMyDetails()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		launch();
		login = new LoginPage();
		
		employeeListPage = new EmployeeListPage();
		adminSystemUserPage = new AdminSystemUserPage();
		employeeListPage = new EmployeeListPage();
		
		Actions.implictWait();
		log.info("Entering login credentials");
		employeeListPage =login.enterLoginCredentials(prop.getProperty("username"), prop.getProperty("password"), prop.getProperty("validation"));
		
		log.info("Clicking on the MyInfo menu button");
		pimViewMyDetails=employeeListPage.clickMyInfoBtn();	
		
	}
	
	
	
	@Test(priority=1)
	public void fillPersonalDetails() throws InterruptedException
	{
		log.info("Selecting License expiry date");
		pimViewMyDetails.selectLicenseExpDate();
		
		log.info("Entering nick name");
		pimViewMyDetails.typeNickName();
		
		log.info("Entering other id");
		pimViewMyDetails.enterOtherId();
		
		log.info("Entering License number");
		pimViewMyDetails.enterLicenseNumber();
		
		log.info("Entering SSN number");
		pimViewMyDetails.enterSSNNumber();
		
		log.info("Entering SIN number");
		pimViewMyDetails.enterSINNumber();
		
		log.info("Entering Military service");
		pimViewMyDetails.enterMilitaryService();
		
		
	//	Thread.sleep(3000);
		//driver.findElement(By.xpath("//label[text()='License Expiry Date']/parent::div/following-sibling::div/div/div/i")).click();
		
		log.info("Selecting Nationality");
		pimViewMyDetails.selectNationality();
		
		log.info("Selecting Date of birth");
		pimViewMyDetails.selectDateOfBirth();
		
//		log.info("Select Gender");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//label[text()='Male']/span")).click();
//		pimViewMyDetails.selectGender();
		
//		log.info("Selecting Marital staus");
//		pimViewMyDetails.selectMaritalStatus();
		
//		log.info("Checking smoker check Box");
//		pimViewMyDetails.tickSmoker();
		
		log.info("Selecting Blood group");
		pimViewMyDetails.selctBloodGroup();
		
		log.info("Click on the submit btn");
		pimViewMyDetails.submitBtn();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
