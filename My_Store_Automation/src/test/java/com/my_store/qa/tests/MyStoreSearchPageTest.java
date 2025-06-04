/**
 * 
 */
package com.my_store.qa.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.my_store.qa.base.BasePage;
import com.my_store.qa.pages.MyStoreIndexPage;
import com.my_store.qa.pages.MyStoreSearchPage;
import com.my_store.qa.pages.ProductPage;

/**
 * @author Admin
 *
 */
public class MyStoreSearchPageTest extends BasePage {

	MyStoreIndexPage myStoreIndexPage;
	MyStoreSearchPage myStoreSearchPage;
	ProductPage productPage;
	
	public MyStoreSearchPageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setup()
	{
		launch();
		log.info("Browser is launched");
		myStoreIndexPage= new MyStoreIndexPage();
		myStoreIndexPage.searchItem();
		myStoreSearchPage=myStoreIndexPage.clickSearchBtn();
	}
	
	@Test(priority=1)
	public void getTitle()
	{
		log.info("Validating Title of the page");
		String Title=myStoreSearchPage.getTitlePage();
		Assert.assertEquals(Title, "Search - My Store");
		
	}
	
	@Test(priority=2)
	public void selectOption()
	{
		log.info("selecting the option");
		myStoreSearchPage.selectDD();	
	}
	
	@Test(priority=3)
	public void clickPrintedDressImg()
	{
		log.info("clicking on the Printed Summer Image");
		productPage=myStoreSearchPage.clickprintedSummerImg();
		
		log.info("Validating the product page title");
		
		String title=productPage.getTitle();
		Assert.assertEquals(title, "Printed Summer Dress - My Store");
	}
}
