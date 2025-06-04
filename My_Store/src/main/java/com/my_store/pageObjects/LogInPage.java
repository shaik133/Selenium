/**
 * 
 */
package com.my_store.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.my_store.base.BaseClass;

/**
 * @author Admin
 *
 */
public class LogInPage extends BaseClass{

	
	@FindBy (id="email_create")
	WebElement CreateEmail;
	
	@FindBy (id="SubmitCreate")
	WebElement createAccountButton;
	
	@FindBy(id="email")
	WebElement registeredEmail;
	
	@FindBy(id="passwd")
	WebElement registeredPassword;
	
	@FindBy(id="SubmitLogin")
	WebElement SubmitButton;
	
	@FindBy (id="search_query_top")
	WebElement SearchEngine;
	
	@FindBy (css="[button(name='submit_search')")
	WebElement submitSearch;
	
	public LogInPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterNewMail()
	{
		
	}
	
	
	public Account_creationPage createAccountButton()
	{
		return new Account_creationPage();
	}
	
	public void enterExistingMail()
	{
		
	}
	
	public void enterExistingPassd()
	{
		
	}
	
	public MyAccountPage clickSubmit()
	{
		return new MyAccountPage();
	}
	
	public void searchProduct()
	{
		
	}
	
	public void searchButton()
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
