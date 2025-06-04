/**
 * 
 */
package com.crm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.BasePage;

/**
 * @author Admin
 *
 */
public class HomePage extends BasePage {

//	public static WebDriver driver;
	public LoginPage login;
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
//Objects of page	
	@FindBy(css="img[class='img-responsive']")
	WebElement CRMLogo;
	
	@FindBy(xpath="//a[text()='Sign Up']")
	WebElement CRMSignUp;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement CRMSignin;
	
//Actions of PagesObjects
	
	public static String getCRMTitle()
	{
		return driver.getTitle();
		
	}
	
	
	public boolean getLogo()
	{
		return CRMLogo.isDisplayed();
	}
	
	public SignupPage signUpbtn()
	{
		CRMSignUp.click();
		return new SignupPage();
	}
	
	public LoginPage signInbtn()
	{
		CRMSignin.click();
		return new LoginPage();
	}
}
