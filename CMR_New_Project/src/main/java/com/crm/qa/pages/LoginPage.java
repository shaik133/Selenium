/**
 * 
 */
package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.basePackage.BasePage;
import com.crm.qa.xlutility.xlutillity;

/**
 * @author Admin
 *
 */
public class LoginPage extends BasePage{

	public LoginPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (name="email")
	WebElement EnterEmail;
	
	@FindBy (name="password")
	WebElement EnterPass;
	
	@FindBy (xpath="//div[text()='Login']")
	WebElement SignIn;
	
	@FindBy(xpath="//a[text()='Forgot your password?']")
	WebElement Forgotpwd;
	
	@FindBy(xpath="//a[text()='Classic CRM']")
	WebElement ClassicCRM;
	
	@FindBy(xpath="//a[text()='Sign Up']")
	WebElement SignUp;
	
	
	
	
	
	public String getPagetitle()
	{
		return driver.getTitle();
	}
	
	
	public HomePage login(String username, String password)
	{
		EnterEmail.sendKeys(username);
		EnterPass.sendKeys(password);
		SignIn.click();
		return new HomePage();
	}
	
	public ForgotPwdPage forgotPwd()
	{
		Forgotpwd.click();
		return new ForgotPwdPage();
	}
	
	public ClassicCRMPage classicCRM()
	{
		ClassicCRM.click();
		return new ClassicCRMPage();
	}
	
	public SignupPage signup()
	{
		SignUp.click();
		return new SignupPage();
	}
	
	
	
	
}
