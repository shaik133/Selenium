/**
 * 
 */
package com.crm.qa.actionDriver;

import org.openqa.selenium.WebElement;

import com.crm.qa.basepage.BasePage;

/**
 * @author Admin
 *
 */
public class Action extends BasePage {


	//click method
	
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
			if (flag)
			{
				System.out.println(ele+ " is clicked");
			}
			else
			{
				System.out.println(ele+ " is  failed to click");
			}
		}
		
	}
	
	public static boolean isDisplayed(WebElement ele)
	{
		boolean flag= false;
		try {
			ele.isDisplayed();
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
		if (flag)
		{
			System.out.println(ele+" is displayed");
		}
		else
		{
			System.out.println(ele+ " is not displayed");
		}
		}
	}
	
	public static boolean sendKeys(WebElement ele,String text)
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
				System.out.println(text+" sent");
			}
			else
			{
				System.out.println(text+" is failed to send");
			}
		}
	}
	
}
