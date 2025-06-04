/**
 * 
 */
package com.my_store.qa.actions;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.my_store.qa.base.BasePage;

/**
 * @author Admin
 *
 */
public class Action extends BasePage {


	/*--------------------- GET TEXT-----------------*/
	
	public static String getText(WebElement ele)
	{
		String text=ele.getText();
		System.out.println(text);
		return text;
		
		
		
	}
	
	
	
/*------------------ REMOVE UNWANTED SYMBOLS----------*/
	
	public static double removeSymbol(WebElement ele)
	{
		
		String text= ele.getText().replaceAll("[^a-zA-Z0-9]", "");
		double text1=Double.parseDouble(text);
		System.out.println(text);
		return text1/100;
		
	
	}
	
	
	/*------- CLICK ACTION-------------*/
	
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
		if(flag)
		{
			System.out.println(ele+" is clicked");
		}
		else
		{
			System.out.println(ele+" is failed to click");
		}
	}
	

}
	
	/*------------------------ SEND KEYS--------------------*/
public static boolean sendkeys(WebElement ele, String text)
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
			System.out.println(text+" is sent");
		}
		else
		{
			System.out.println(text+" is failed to send");
		}
	}
}
	
/*----------------------------- IS DISPLAYED---------------------*/	
	
	public static boolean isDisplayed(WebElement ele)
	{
		boolean flag=false;
		try {
			 flag=ele.isDisplayed();
			if(flag==true)
			{
				System.out.println(ele+" is displayed");
			}
			else
			{
				System.out.println(ele+" is failed to display!");
			}
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		return flag;
	}
	
/*--------------------------- SELECT STATEMENT---------*/
	public static void select(WebElement ele, String text)
	{
		try {
		Select option = new Select(ele);
		option.selectByVisibleText(text);
	 System.out.println(option.getFirstSelectedOption());
		}
		catch(NoSuchElementException e)
		{
			e.printStackTrace();
		}
	}
	
/*----------------- SELECT BY VALUE-------------------*/
	public static void selectByValue(WebElement ele, String value)
	{
		try {
		Select option = new Select(ele);
		option.selectByValue(value);
	 System.out.println(option.getFirstSelectedOption());
		}
		catch(NoSuchElementException e)
		{
			e.printStackTrace();
		}
	}
	
	
/*----------------- GET TITLE OF THE PAGE -------------------*/	
	
	public static String getTitle()
	{
	String Title=driver.getTitle();
	System.out.println("Title of the Page is"+" '"+Title+"'");
	return Title;
	}
	
/*--------------------------- GET LOGO OF THE PAGE 	---------------*/
	public void getLogo(WebElement ele)
	{
		
	}
	
	
	/*---------------	DYNAMIC INCREASE ----------*/
	public static void dynamicIncrement(WebElement ele)
	{
		WebElement increment = ele;
		for (int i=1;i<3;i++)
		{
			increment.click();
		}
	}
	
/*--------------------------- SWITCH WINDOW ---------------*/
	
	public static void switchWindow()
	{
		Set<String> windows= driver.getWindowHandles();
		Iterator<String> it =windows.iterator();
		String parentId=it.next();
		String childId=it.next();
		System.out.println(parentId);
		System.out.println(childId);
		driver.switchTo().window(childId);
	}
	
/*-------------	IMPLICITE WAIT--------*/
	public static void impliciteWait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
/*------------------ EXPLICITE WAIT---------------*/
	public static void explicitWait(WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}
	
	public static void explixitewaitForElementClickable(WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
/*------------------ DYNAMIC POP UP HANDLER ---------------*/
	public static List<WebElement> popup(List<WebElement> ele)
	{
		List<WebElement> popup= ele;
		if(popup.size()>0);
		return popup;
	}
}
