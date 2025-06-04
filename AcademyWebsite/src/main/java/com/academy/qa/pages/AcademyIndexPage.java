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
public class AcademyIndexPage extends BasePage{

	public AcademyIndexPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@class='logo']")
	WebElement logo;
	
	@FindBy(xpath="//a[contains(@class,'register-btn')]")
	WebElement loginBtn;
	
	public boolean getLogo()
	{
		return Action.getLogo(logo);
	}
	
	public String getTitle()
	{
		return Action.getTitle();
	}
	
	public LoginPage clickLoginBtn()
	{
		Action.click(loginBtn);
		return new LoginPage();
	}
}
