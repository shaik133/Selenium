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

public class HomePage extends BaseClass {

	@FindBy (xpath="[a(@class='login')")
	WebElement sigin;
	
	@FindBy (id="search_query_top")
	WebElement searchEngine; 
	
	
	@FindBy (css="img(class='logo img-responsive')")
	WebElement logo;
	
	@FindBy (css="button(type=submit')")
	WebElement searchButton;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void PageLoginButton()
	{
		
	}
	
	public void searchBar()
	{
		
	}
	
	public void LogoDisplay()
	{
		
	}
	
	public String getTitle()
	{
		String Title= driver.getTitle();
		return Title;
	}
	
}
