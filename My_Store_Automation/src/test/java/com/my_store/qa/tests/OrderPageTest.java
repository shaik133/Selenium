/**
 * 
 */
package com.my_store.qa.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.my_store.qa.base.BasePage;
import com.my_store.qa.pages.AuthenticationPage;
import com.my_store.qa.pages.MyStoreIndexPage;
import com.my_store.qa.pages.MyStoreSearchPage;
import com.my_store.qa.pages.OrderPage;
import com.my_store.qa.pages.ProductPage;

/**
 * @author Admin
 *
 */
public class OrderPageTest extends BasePage {

	MyStoreIndexPage myStoreIndexPage;
	MyStoreSearchPage myStoreSearchPage;
	ProductPage productPage;
	OrderPage orderPage;
	AuthenticationPage autheneticationPage;
	
	public OrderPageTest()
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
	}
	
	@Test(priority=1)
	public void verifySummuryOfOrederTest()
	{
		log.info("Validating logo of the product");
		boolean flag=orderPage.getLogo();
		Assert.assertTrue(flag);
		
		log.info("Validating the describtion of the product");
		String desc=orderPage.getdescription();
		Assert.assertEquals(desc, "Printed Summer Dress");
		
		log.info("Validating the availability of product");
		String avail=orderPage.getAvail();
		Assert.assertEquals(avail, "In stock");
		
	double unitPrice=orderPage.getUnitPrice();
	double finalTotalPrice= (unitPrice*3)+2;
	double totalExpectedPrice=  orderPage.gettotalPrice();
	
	Assert.assertEquals(finalTotalPrice, totalExpectedPrice);
	log.info("Total price of the product and expected price of the product is valiated");
	
	
	log.info("click proceed to check out button");
	autheneticationPage=orderPage.clickCheckoutBtn();
	
	log.info("Validating the title of the authentication page");
	String title=autheneticationPage.getTitle();
	Assert.assertEquals(title, "Login - My Store");
		
	}
	
}
