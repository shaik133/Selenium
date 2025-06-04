/**
 * 
 */
package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.basePackage.BasePage;
import com.crm.qa.utils.Utilities;

/**
 * @author Admin
 *
 */
public class HomePage extends BasePage {

	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//b[text()='Self']")
	WebElement headerItem;
	
	
	@FindBy(xpath="//span[text()='Shaij Jafar1']")
	WebElement dispalyName;
	
	
	@FindBy(xpath="//body/div/div/div/div[2]/button/i")
	WebElement addCalendar;
	
	public boolean getHeaderName()
	{
		return headerItem.isDisplayed();
	}
	
	public boolean getDispalayName()
	{
//		return dispalyName.isDisplayed();
		return Utilities.isDisplayed(driver, dispalyName);
	}
	
	public CalendarPage addCalendarBtn()
	{
		addCalendar.click();
		return new CalendarPage();
	}
}
