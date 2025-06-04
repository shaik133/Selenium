/**
 * 
 */
package com.qaacademy.qa.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.my_store.qa.actions.Action;
import com.my_store.qa.base.BasePage;

/**
 * @author Admin
 *
 */
public class QaAcademyLandingPage extends BasePage{

	public QaAcademyLandingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='NO THANKS']")
	List<WebElement> childwindowNoThanks;
	
	@FindBy(xpath="//button[text()='NO THANKS']")
	WebElement childwindowNo;
	
	public String getTitle()
	{
		return Action.getTitle();
	}
	
	public void popupHandle()
	{
		Action.popup(childwindowNoThanks);	
		Action.click(childwindowNo);
	}
}
