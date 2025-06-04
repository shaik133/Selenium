/**
 * 
 */
package com.cmr.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cmr.qa.action.Actions;
import com.cmr.qa.base.BasePage;

/**
 * @author Admin
 *
 */
public class EmployeeListPage extends BasePage {

	public EmployeeListPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[text()='Admin']")
	WebElement adminBtn;
	
	
	@FindBy(css="p[class='oxd-userdropdown-name']")
	WebElement profileName;
	
	
	@FindBy(xpath="//span[text()='My Info']")
	WebElement myInfoBtn;
	
	@FindBy(xpath="//span[text()='Time']")
	WebElement timeBtn;
	
	
	
	public AdminSystemUserPage adminBtnClick()
	{
		Actions.click(adminBtn);
		return new AdminSystemUserPage();
	}
	
	public String getUserProfileName()
	{
		return Actions.getText(profileName);
	}
	
	public PimViewMyDetails clickMyInfoBtn()
	{
		Actions.click(myInfoBtn);
		return new PimViewMyDetails();
	}
	
	
	public EmployeeTimesheet clickTimeBtn()
	{
		Actions.click(timeBtn);
		return new EmployeeTimesheet();
	}
}
