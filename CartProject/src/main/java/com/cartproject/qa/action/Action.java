/**
 * 
 */
package com.cartproject.qa.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.cartproject.qa.basepackage.BasePage;

/**
 * @author Admin
 *
 */
public class Action extends BasePage {

	
	
	/*------------------- Click------------------------*/
	
	public static boolean click(WebElement ele)
	{
		boolean flag=false;
		try {
			ele.click();
			flag=true;
			return flag;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return flag;
		}
		finally
		{
		if(flag)
		{
			System.out.println(ele+" is clicked");
		}
		else
		{
			System.out.println(ele+" is failed clicked");
		}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
/*--------------------------------- getLogo-----------------------*/
	
	public static void getLogo(WebElement ele)
	{
	
		try
		{
		boolean	logo=ele.isDisplayed();
			if(logo==true)
			{
				System.out.println("Logo is displayed");
			}
			else
			{
				System.out.println("Logo is not displayed");
			}
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
	}
	
	
/*------------------------- get Title------------------------------*/
	
	public static String getTitle()
	{
		String Title=driver.getTitle();
		return Title;
	}
	
/*----------------------------------- Click on the cart items--------------*/
	
	public static void getCartItems(List<WebElement> ele)
	{
		String[] veggies= {"Brocolli","Cauliflower","Potato","Pumpkin"};
		List<WebElement>items=ele;
		int j=0;
		for(int i=0; i<items.size();i++)
		{
			String formatedItems=items.get(i).getText().split("-")[0].trim();
			List vegList= Arrays.asList(veggies);
			if(vegList.contains(formatedItems))
			{
				driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
				//System.out.println(driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i)+" is added to cart");
				j++;
				if(j==veggies.length)
				{
					break;
				}
			}
			
		}
		
	}
	
	public static void addToCart( List<WebElement> ele)
	{
		String[] veggies= {"Brocolli","Carrot","Potato","Corn"};
		List<WebElement> items= ele;
		int j=0;
		for (int i=0;i<items.size();i++)
		{
			String formatedItems=items.get(i).getText().split("-")[0].trim();
			
			List Vegitems=Arrays.asList(veggies);
			
			if(Vegitems.contains(formatedItems))
			{
				driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
				j++;
				
				if(j==veggies.length) 
				{
					break;
				}
		}
		
		
		}
		}
/*-------------------------------------get image in cart--------------*/
	
	public static void getLogoOfItemsInCart(List <WebElement> ele)
	{
	List<WebElement> logos=ele;
	for (int i=0;i<logos.size();i++)
	{
		 if(logos.get(i).isDisplayed())
		 {
			 System.out.println("logo is displayed");
		 }
		 else {
			 System.out.println("logo is not displayed");
		 }
	}
		
	}
	
	/*------------------------------------------------List of Products in cart-----*/
	public static void getListOfItemsInCart(List <WebElement> ele)
	{
		try
		{
		
		List<WebElement> products=ele;
	for (int i=0;i<products.size();i++)
	{
	String product	= products.get(i).getText();
		System.out.println(product+" is present in cart");
	
	}
		
	}
		catch(StaleElementReferenceException e)
		{
		
			List<WebElement> products=ele;
			for (int i=0;i<products.size();i++)
			{
			String product	= products.get(i).getText();
				System.out.println(product+" is present in cart");
			
			}
		}
}
	
	/*----------------- get the price--------------*/
	public static int getTotalOfPrice(List<WebElement> ele)
	{
		List<WebElement> lists = ele;
		int sum=0;
		for (int i=0;i<lists.size();i++)
		{
			sum=sum+Integer.parseInt(lists.get(i).getText());
		}
		System.out.println(sum+" is the Total price of the product");
		return sum;
		
		
	}
	
	/*------------------------- SendKeys-------------*/
	
	public static boolean sendKyes(WebElement ele, String text)
	{
		boolean flag=false;
		try
		{
		ele.sendKeys(text);
		flag=true;
		return flag;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return flag;
		}
		finally
		{
			if(flag)
			{
				System.out.println(text+" is passed");
			}
			else
			{
				System.out.println(text+" failed to pass");
			}
		}
	}
	
	/*----------------------- Get text----------------------------*/
	
	public static String getText(WebElement ele)
	{
		String text=ele.getText();
		System.out.println(text);
		return text;
		
	}
	
	/*------------------------------ Select Dropdown--------*/
	public static boolean select(WebElement ele, String text)
	{
		boolean flag=false;
		try
		{
			Select options= new Select (ele);
			options.selectByVisibleText(text);
			options.getFirstSelectedOption();
			flag=true;
			return flag;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return flag;
		}
		finally
		{
			if(flag)
			{
				System.out.println(text+" is selected");
			}
			else
			{
				System.out.println(text+" is failed to select");
			}
		}
	}
}