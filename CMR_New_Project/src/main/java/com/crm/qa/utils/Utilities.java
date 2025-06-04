/**
 * 
 */
package com.crm.qa.utils;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.basePackage.BasePage;

/**
 * @author Admin
 *
 */
public class Utilities extends BasePage {

	
	public static  long implicitWait = 10;
	public static long Seconds =20;
	
	public static void windowMax()
	{
		driver.manage().window().maximize();
	}
	
	public static void switchToFrame()
	{
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='reCAPTCHA']")));
	}
	
	
	public static void explicitWait() throws InterruptedException
	{
		Thread.sleep(5000);
	}
	
	
	public static  void click(WebDriver driver, WebElement ele)
	{
		Actions action = new Actions(driver);
		action.moveToElement(ele).click().build().perform();
	}
	
	
	
	
	public static boolean isDisplayed(WebDriver driver, WebElement ele)
	{
//		boolean flag=false;
//		
//		if (flag) {
			boolean flag=ele.isDisplayed();
			
			if(flag==true)
			{
				System.out.println("Element is displayed");
			}
			else
			{
				System.out.println("Element is not displayed");
			}
//		}
//		
////		else
////		{
//		System.out.println("Element is not displayed");
//		}
		return flag;
	}
	
	
	
	
	
}
