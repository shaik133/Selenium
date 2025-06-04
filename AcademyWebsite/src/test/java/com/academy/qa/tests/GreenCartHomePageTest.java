/**
 * 
 */
package com.academy.qa.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.academy.qa.base.BasePage;
import com.academy.qa.pages.GreenCartHomePage;

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
		launch();
		greenCartHomePage= new GreenCartHomePage();
	}
	
	@Test
	public void addToCartProducts()
	{
		greenCartHomePage.addToCartProd();
	}
}
