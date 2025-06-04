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
public class MyStoreSearchPage extends BasePage{

	
	
	public MyStoreSearchPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="selectProductSort")
	WebElement selectDD;
	
	@FindBy(xpath="//div[@class='block_content']/ul/li[4]/div/h5/a")
	WebElement printedSummerImg;
	
	public String getTitlePage()
	{
		return Action.getTitle();
	}
	
	public void selectDD()
	{
		Action.select(selectDD, prop.getProperty("selectOption"));
	}
	
	public ProductPage clickprintedSummerImg()
	{
		Action.click(printedSummerImg);
		return new ProductPage();
	}
	
}
