/**
 * 
 */
package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.actionDriver.Action;
import com.crm.qa.basepage.BasePage;

/**
 * @author Admin
 *
 */
public class SigninPage extends BasePage {

	public SigninPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="input[name='username']")
	WebElement Email;
	
	@FindBy(css="input[name='password']")
	WebElement Password;
	
	@FindBy(css="input[value='Login'")
	WebElement Login;
	
	
	public String getTitleName()
	{
		return driver.getTitle();
	}
	
	
	public HomePage loginForm(String uname, String pwd)
	{
		Action.sendKeys(Email, uname);
		Action.sendKeys(Password, pwd);
		Action.click(Login);
		return new HomePage();
	}
	
	
}
