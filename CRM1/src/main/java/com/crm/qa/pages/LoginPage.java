package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.BasePage;

public class LoginPage extends BasePage {

//	public  LandingPage landingPage;
//	public  ForgotPasswrd forgotPwd;
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="email")
	WebElement Email;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement LoginBtn;
	
	@FindBy(xpath="//a[text()='Forgot your password?']")
	WebElement forgotPassword;
	
	
	public LandingPage login(String uname, String pwd)
	{
		Email.sendKeys(uname);
		Password.sendKeys(pwd);
		LoginBtn.click();
		return new LandingPage();
	}

public ForgotPasswrd forgotPwd() {
	forgotPassword.click();
	return new ForgotPasswrd();
}
	
	
}
