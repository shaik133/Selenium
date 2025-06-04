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
import com.my_store.qa.pages.OrderPage;
import com.my_store.qa.pages.ProductPage;

/**
 * @author Admin
 *
 */
public class ProductPageTest extends BasePage{

	MyStoreIndexPage myStoreIndexPage;
	MyStoreSearchPage myStoreSearchPage;
	ProductPage productPage;
	OrderPage orderPage;
	
	public ProductPageTest()
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
		myStoreSearchPage.selectDD();
		productPage=myStoreSearchPage.clickprintedSummerImg();
	}
	
	@Test(priority=1)
	public void getPageTitleTest()
	{
		String Title=productPage.getTitle();
		Assert.assertEquals(Title, "Printed Summer Dress - My Store");
	}
	
	@Test(priority=2)
	public void selectItemQuantityTest()
	{
		productPage.selectItemQuantity();
		productPage.selectItemSize();
		productPage.selectColor();
		productPage.addCartBtn();
		boolean msg= productPage.cartValidationMessage();
		Assert.assertTrue(msg);
		orderPage=productPage.checkOutBtn();
		orderPage.getTitle();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
