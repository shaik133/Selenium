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
public class LandingPage extends BasePage{

	
	public LandingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Calendar')]")
	WebElement CalendarClick;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement ContactClick;
	
	@FindBy (xpath="//b[text()='Self']")
	WebElement headerName;
	
	@FindBy (xpath="//span[text()='Shaij Jafar']")
	WebElement userDisplay;
	
	public CalenderPage clickCalendarBtn()
	{
		 CalendarClick.click();
		 return new CalenderPage();
	}
	
	public ContactsPage clickcontactBtn()
	{
		ContactClick.click();
		return new ContactsPage();
	}
	
	public boolean getHeaderName()
	{
		return headerName.isDisplayed();
	}
	
	public boolean getDisplayName()
	{
		return userDisplay.isDisplayed();
	}
}

