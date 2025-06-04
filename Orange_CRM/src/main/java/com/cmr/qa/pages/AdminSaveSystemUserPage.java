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
public class AdminSaveSystemUserPage extends BasePage {

	public AdminSaveSystemUserPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='oxd-form-row']//div[@class='oxd-grid-item oxd-grid-item--gutters'][1]//div[@class='oxd-select-text--after']")
	WebElement userRole;
	
	@FindBy(xpath="//div[@class='oxd-select-dropdown --positon-bottom']//span[text()='Admin']")
	WebElement userRoleOption;
	
	
	@FindBy(css="input[placeholder='Type for hints...']")
	WebElement empName;
	
	@FindBy(xpath="//span[text()='Odis  Adalwin']")
	WebElement selectEmpName;
	
	@FindBy(xpath="//div[@class='oxd-form-row']//div[@class='oxd-grid-item oxd-grid-item--gutters'][3]//div[@class='oxd-select-text--after']")
	WebElement status;
	
	@FindBy(xpath="//div[@class='oxd-select-dropdown --positon-bottom']//span[text()='Enabled']")
	WebElement statusOption;
	
	@FindBy(xpath="//div[@class='oxd-form-row']//div[@class='oxd-grid-item oxd-grid-item--gutters'][4]//input[@class=\"oxd-input oxd-input--active\"]")
	WebElement username;
	
	@FindBy(css=".user-password-cell input[type='password']")
	WebElement password;
	
	@FindBy(xpath="//div[@class='oxd-grid-item oxd-grid-item--gutters']//input[@type='password']")
	WebElement confirmPassword;
	
	@FindBy(css="button[type='submit']")
	WebElement submitBtn;
	
	@FindBy(css="p[class*='oxd-text---toast-message']")
	WebElement toastMsg;
	
	
	public void selectUserRole()
	{
		Actions.click(userRole);
		
		Actions.click(userRoleOption);
	}
	
	
	public void selectStatus()
	{
		Actions.click(status);
		Actions.click(statusOption);
	}
	
	public void typeEmpName(String employeeName)
	{
		
	Actions.sendKeys(empName, employeeName);	
	}
	
	public void selectEmpName()
	{
		Actions.click(selectEmpName);
	}
	
	public void typeUserName(StringBuilder uname)
	{
		Actions.sendRandomKeys(username, uname);
	}
	
	
	public void typePassword(String pwd)
	{
		Actions.sendKeys(password, pwd);
	}
	
	public void confirmPassword(String cPwd)
	{
		Actions.sendKeys(confirmPassword, cPwd);
	}
	
	
	
	
	public AdminSystemUserPage clickSubmitBtn()
	{
		Actions.click(submitBtn);
		return new AdminSystemUserPage();
	}
	
	
	
	public void getToastMsg()
	{
		Actions.getText(toastMsg);
	}
	
	
	
	
	
	
	
	
	
	
}
