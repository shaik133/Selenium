/**
 * 
 */
package com.my_store.qa.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.my_store.qa.base.BasePage;
import com.my_store.qa.pages.AuthenticationPage;
import com.my_store.qa.pages.CreateAccountPage;
import com.my_store.qa.pages.MyStoreIndexPage;
import com.my_store.qa.pages.MyStoreSearchPage;
import com.my_store.qa.pages.OrderPage;
import com.my_store.qa.pages.ProductPage;

/**
 * @author Admin
 *
 */
public class AuthenticationPageTest extends BasePage{

	MyStoreIndexPage myStoreIndexPage;
	MyStoreSearchPage myStoreSearchPage;
	ProductPage productPage;
	OrderPage orderPage;
	AuthenticationPage autheneticationPage;
	CreateAccountPage createAccountPage;
	
	public AuthenticationPageTest()
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
		productPage.selectItemQuantity();
		productPage.selectItemSize();
		productPage.selectColor();
		productPage.addCartBtn();
		boolean msg= productPage.cartValidationMessage();
		Assert.assertTrue(msg);
		orderPage=productPage.checkOutBtn();
		autheneticationPage=orderPage.clickCheckoutBtn();
	}
	
	@Test
	public void createAccountTest()
	{
		log.info("Enter email address");
		autheneticationPage.enterEmail();
		
		log.info("clicking on the submit btn");
		createAccountPage=autheneticationPage.clickSubmit();
	}
}
