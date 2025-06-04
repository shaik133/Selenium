/**
 * 
 */
package com.cartproject.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cartproject.qa.basepackage.BasePage;
import com.cartproject.qa.pages.GreenCartHomePage;

/**
 * @author Admin
 *
 */
public class GreenCartHomePageTest extends BasePage{

	GreenCartHomePage greenCartHomePage;
	
	public GreenCartHomePageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setup()
	{
		log.info("browser is getting launched");
		launch();
		greenCartHomePage= new GreenCartHomePage();
	}
	
	@Test(priority=1)
	public void getLogoTest()
	{
		log.info("validating logo");
		greenCartHomePage.getLogo();
	}
	
	
	@Test(priority=2)
	public void getTitleTest()
	{
		log.info("Valiating title");
		Assert.assertEquals("GreenKart - veg and fruits kart", greenCartHomePage.getTitle());
	}
	
	@Test(priority=3)
	public void addItemsToCartTest()
	{
		log.info("selecting the items to add to cart");
		greenCartHomePage.addItemsToCart();
		log.info("navigating to cart by clicking cart button");
		greenCartHomePage.cartBtn();
		log.info("clciking on the proceed to check out button");
		greenCartHomePage.checkoutBtnClick();
	}
	
//	@AfterMethod
//	public void tearDown()
//	{
//		driver.close();
//	}
	
}
