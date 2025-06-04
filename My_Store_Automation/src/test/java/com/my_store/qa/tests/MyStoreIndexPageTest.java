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

/**
 * @author Admin
 *
 */
public class MyStoreIndexPageTest extends BasePage{

	MyStoreIndexPage myStoreIndexPage;
	MyStoreSearchPage myStoreSearchPage;
	
	public MyStoreIndexPageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setup()
	{
		launch();
		log.info("browser is launched");
		
		myStoreIndexPage= new MyStoreIndexPage();
	}
	
	@Test(priority=1)
	public void getTitlePageTest()
	{
		log.info("Validating the title of the page");
		String Title=myStoreIndexPage.getTitleofPage();
		Assert.assertEquals(Title, "My Store");
	}
	
	@Test(priority=2)
	public void getLogoTest()
	{
		log.info("Validating the logo of the page");
		boolean logo=myStoreIndexPage.getlogo();
		Assert.assertTrue(logo);
	}
	
	@Test(priority=3)
	public void searchBoxTest()
	{
		myStoreIndexPage.searchItem();
		log.info("item passed in search box");
		log.info("submitting the search option");
		myStoreSearchPage=myStoreIndexPage.clickSearchBtn();
		
		log.info("validating the search page title");
		Assert.assertEquals(myStoreSearchPage.getTitlePage(), "Search - My Store");
	}
	
//	@Test(priority=4)
//	public void searchBtnTest()
//	{
//		log.info("submitting the search option");
//		myStoreSearchPage=myStoreIndexPage.clickSearchBtn();
//		
//		log.info("validating the search page title");
//		Assert.assertEquals(myStoreSearchPage.getTitlePage(), "Search - My Store");
//	}
}
