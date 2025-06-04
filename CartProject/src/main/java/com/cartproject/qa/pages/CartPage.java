/**
 * 
 */
package com.cartproject.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cartproject.qa.action.Action;
import com.cartproject.qa.basepackage.BasePage;

/**
 * @author Admin
 *
 */
public class CartPage extends BasePage {

	public CartPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="img[class='product-image']")
	List<WebElement> listoflogo;
	
	@FindBy(css="p[class='product-name']")
	List<WebElement> listOfproductsinCart;
	
	@FindBy(css="p[class='quantity']")
	List<WebElement> QuantityOfItemsInCart;
	
	
	@FindBy(xpath="//tbody//tr//td[4]//p[@class='amount']")
	List<WebElement> priceofProductsincart;
	
	@FindBy(xpath="//div[@id='root']/div/div/div/div/div/input")
	WebElement promocode;
	
	@FindBy(xpath="//div[@id='root']/div/div/div/div/div/button")
	WebElement PromoapplyBtn;
	
	@FindBy(xpath="//tbody//tr//td[5]//p[@class='amount']")
	List<WebElement> totalofProductsincart;
	
//	@FindBy(xpath=)
//	WebElement promoInfo;
	
	@FindBy(xpath="//button[text()='Place Order']")
	WebElement placeOrderbtn;
	
	public void validateLogos()
	{
		Action.getLogoOfItemsInCart(listoflogo);
	}
	
	public void validateProductsInCart()
	{
		 Action.getListOfItemsInCart(listOfproductsinCart);
	}
	public void validateQuantityOfItems()
	{
		Action.getListOfItemsInCart(QuantityOfItemsInCart);
	}
	
	public int PriceofproductsInCart()
	{
		return Action.getTotalOfPrice(priceofProductsincart);
	}
	
	public int TotalofproductsInCart()
	{
		return Action.getTotalOfPrice(totalofProductsincart);
	}
	
	public void enterpromoCode()
	{
		Action.sendKyes(promocode,prop.getProperty("promocode1"));
	}
	public void clickPromoapplyBtn()
	{
		Action.click(PromoapplyBtn);
	}
	
	
	
	public ChooseCountryPage placeOrderBtn()
	{
		Action.click(placeOrderbtn);
		return new ChooseCountryPage();
	}
}
