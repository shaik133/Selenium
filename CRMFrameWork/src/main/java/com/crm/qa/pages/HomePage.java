/**
 * 
 */
package com.crm.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.crm.qa.actionDriver.Action;
import com.crm.qa.basepage.BasePage;

/**
 * @author Admin
 *
 */
public class HomePage extends BasePage{

	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void getTitle()
	{
		Action.getTitleName();
	}
}
