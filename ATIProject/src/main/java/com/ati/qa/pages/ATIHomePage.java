/**
 * 
 */
package com.ati.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ati.qa.action.Action;
import com.ati.qa.base.BasePage;

/**
 * @author Admin
 *
 */
public class ATIHomePage extends BasePage {

	public ATIHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css="img[id='Header1_headerimg']")
	WebElement logo;
	
	public boolean getLogo()
	{
		return Action.getLogo(logo);
	}
}
