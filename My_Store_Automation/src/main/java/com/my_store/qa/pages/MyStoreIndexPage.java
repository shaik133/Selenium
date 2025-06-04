/**
 * 
 */
package com.my_store.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.my_store.qa.actions.Action;
import com.my_store.qa.base.BasePage;

/**
 * @author Admin
 *
 */
public class MyStoreIndexPage extends BasePage {

	
	public MyStoreIndexPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="img[class='logo img-responsive']")
	WebElement logo;
	
	@FindBy(id="search_query_top")
	WebElement searchBox;
	
	@FindBy(css="button[name='submit_search']")
	WebElement searchbtn;
	
	public String getTitleofPage()
	{
		return Action.getTitle();
	}
	
	public boolean getlogo()
	{
		return  Action.isDisplayed(logo);
	}
	
	public void searchItem()
	{
		Action.sendkeys(searchBox, prop.getProperty("search"));
	}
	
	public MyStoreSearchPage clickSearchBtn()
	{
		 Action.click(searchbtn);
		 return new  MyStoreSearchPage();
	}
}
