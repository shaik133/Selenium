/**
 * 
 */
package com.academy.qa.action;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.academy.qa.base.BasePage;

/**
 * @author Admin
 *
 */
public class Action extends BasePage{
	
/*--------------------Explixit wait--------------*/
	public static void explitWait(WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
/*----------------GET TITLE------*/
	public static String getTitle()
	{
		
		String title="";
		try
		{
		 title=driver.getTitle();
		return title;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally
		{
			if(!(title==null))
			{
				System.out.println("Title of the page is "+" '"+title+"'");
			}
			else
			{
				System.out.println("Failed to display title of the page");
			}
		}
	}
	
/*---------------------GET LOGO-----------------*/
	
	public static boolean getLogo(WebElement ele)
	{
		boolean logo=ele.isDisplayed();
		
		if (logo==true)
		{
			System.out.println("Logo is displayed");
		}
		else
		{
			System.out.println("Logo is failed to display");
		}
		return logo;
	}
	
/*------------------CLICK-----------------*/
	public static boolean click(WebElement ele)
	{
		boolean flag=false;
		try
		{
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
			if(flag==true)
			{
				System.out.println(ele+" is clicked");
			}
			else
			{
				System.out.println(ele+" is failed to click");
			}
		
	}
		
}
	
/*----------------------------------SEND KEYS ---------------*/

	public static boolean sendKeys(WebElement ele, String text)
	{
		boolean flag=false;
		try
		{
		ele.clear();
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
			if(flag==true)
			{
				System.out.println(text+" is sent");
			}
			else
			{
				System.out.println(text+" is failed to send");
			}
		
	}
	
	}
	
/*---------------------------------SELECT BY VALUE ---------*/
	public static void selectByValue(WebElement ele, String value)
	{
		Select options = new Select(ele);
		options.selectByValue(value);
		WebElement firstSelct= options.getFirstSelectedOption();
		System.out.println(firstSelct);
	}
	
	
/*------------------ MOUSE MOVEMENT ------------*/
	
	public static boolean hoverOverElement(WebElement ele)
	{
		boolean flag=false;
		try
		{
		Actions action = new Actions(driver);
		  action.moveToElement(ele).build().perform();
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
			if(flag==true)
			{
				System.out.println("moved to the element "+ele);
			}
			else
			{
				System.out.println("Failed to move to an element "+ele);
			}
		
	}
		
}
	
/* ----------------USING HASHMAP TO SEND VALUES----------*/
	
	public static HashMap<String, String> hasmap()
	{
		
		HashMap<String,String> hm= new HashMap<String, String>();
		hm.put("name", "SJS");
		hm.put("email", "shaikjafarsadq786@gmail.com");
		return hm;
	
	}
	
/*---------------- ADD TO CART UTILITY--------------*/
	public static void addToCart(List<WebElement> ele, WebElement ele1)
	{
		String[] veggies= {"Brocolli","Cauliflower","Brinjal","Capsicum"};
		
		List<WebElement> vegProducts=ele;
		int j=0;
		for (WebElement veg: vegProducts)
		{
			String formattedVeg=veg.getText().split("-")[0].trim();
			
			List<String> list = Arrays.asList(veggies);
			if(list.contains(formattedVeg))
			{
				ele1.click();
				j++;
				if ( j==list.size())
				{
					break;
				}
					
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
