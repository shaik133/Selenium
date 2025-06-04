/**
 * 
 */
package com.cmr.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cmr.qa.base.BasePage;

/**
 * @author Admin
 *
 */
public class LoginPage extends BasePage {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".orangehrm-login-branding img")
	WebElement logo;

	@FindBy(xpath="//input[@name='username']")
		WebElement username;

	@FindBy(name="password")
	WebElement password;

	@FindBy(css = "button[type='submit']")
	WebElement submitBtn;

	@FindBy(css = ".orangehrm-login-forgot p")
	WebElement forgotPwd;

	public boolean isLogoVisible() {
		
		return logo.isDisplayed();

	}
	
	public String title()
	{
		 return driver.getTitle();
	}
	
	public String getCurrentUrl()
	{
		return driver.getCurrentUrl();
	}
	

	public EmployeeListPage enterLoginCredentials(String usename, String pwd, String credStatus)
	{
		username.sendKeys(usename);
		password.sendKeys(pwd);
		submitBtn.click();
		return new EmployeeListPage();
	}

public void clicFrgotPwdBtn()
{
	 forgotPwd.click();
}

}
