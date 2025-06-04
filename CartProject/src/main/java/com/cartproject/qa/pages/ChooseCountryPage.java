/**
 * 
 */
package com.cartproject.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cartproject.qa.action.Action;
import com.cartproject.qa.basepackage.BasePage;

/**
 * @author Admin
 *
 */
public class ChooseCountryPage extends BasePage{

	public void ChooseCountryPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@id='root']/div/div/div/div/div/select")
	WebElement selectDD;
	
	public void selectDD()
	{
		 Action.select(selectDD, prop.getProperty("country"));
	}
	
}
