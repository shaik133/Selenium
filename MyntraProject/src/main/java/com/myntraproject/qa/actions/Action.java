/**
 * 
 */
package com.myntraproject.qa.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.myntraproject.qa.base.BasePage;

/**
 * @author Admin
 *
 */
public class Action extends BasePage {

	
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
	
	
	
	
	
}
