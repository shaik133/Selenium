/**
 * 
 */
package com.academy.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.academy.qa.action.Action;
import com.academy.qa.base.BasePage;

/**
 * @author Admin
 *
 */
public class LoginPage extends BasePage {

	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="password")
	WebElement pwd;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement login;
	
	
	public void enterEmail(String username)
	{
		Action.sendKeys(email, username);
	}
	
	public void enterPwd(String password)
	{
		Action.sendKeys(pwd, password);
	}
	
	public AcademyHomePage clickLogin()
	{
		Action.click(login);
		return new AcademyHomePage();
	}
}
