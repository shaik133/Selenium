/**
 * 
 */
package com.my_store.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.my_store.base.BaseClass;

/**
 * @author Admin
 *
 */
public class MyAccountPage extends BaseClass{

	
	@FindBy(css="li[class='lnk_wishlist']")
	WebElement myWishList;
	
	
	@FindBy (css="a[title='Orders']")
	WebElement Orders;
	
	
	public MyAccountPage()
	{
		PageFactory.initElements(driver, this);
	}
	
public void MyWishList()
{
	
}
	public void ordersDetails()
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
