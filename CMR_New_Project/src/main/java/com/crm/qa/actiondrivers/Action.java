/**
 * 
 */
package com.crm.qa.actiondrivers;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.basePackage.BasePage;

/**
 * @author Admin
 *
 */
public class Action extends BasePage{

	
//move and click mouse action	
	public void click(WebDriver driver, WebElement ele)
	{
		Actions action = new Actions(driver);
		action.moveToElement(ele).click().build().perform();
	}
	
//is Displayed action	
	public  static boolean isDisplayed(WebDriver driver, WebElement ele)
	
	{
		boolean flag= ele.isDisplayed();
		if (flag==true)
		{
			System.out.println("WebElement is displayed");
		}
		else
		{
			System.out.println("WebElement is not displayed");
		}
		return flag;
	}

//is Selected action	
	public static boolean isSelected(WebDriver driver, WebElement ele) {
		boolean flag=ele.isSelected();
		if (flag==true)
		{
			System.out.println("Element is selected");
		}
		else {
			System.out.println("Element is not selected");
		}
		return flag;
	}
	
	
//is Enabled action	
	public static boolean isEnabled(WebDriver driver, WebElement ele) {
		boolean flag=ele.isEnabled();
		if (flag==true)
		{
			System.out.println("Element is enabled");
		}
		else {
			System.out.println("Element is not enabled");
		}
		return flag;
	}

//switch to Frame	
	public static void switchToFrame( WebElement ele) {
		driver.switchTo().frame(ele);
	}
	
	
//clear field and send keys
	
	public boolean type(WebElement ele, String text)
	{
		boolean flag= false;
		try {
		flag= ele.isDisplayed();
		ele.clear();
		ele.sendKeys(text);
		flag=true;
		}
		catch(Exception e)
		{
			System.out.println("element not found");
			flag=false;
		}
		finally {
			if(flag)
			{
				System.out.println("Successfully value entered");
			}
			else
			{
				System.out.println("Value failed to eneterd");
			}
		}
		return flag;
			
		
	}
	
	/**
	 * @return 
	 * @Select Statement
	 *
	 */	
	//Select dropdown by using SelectByValue
	
public static boolean selectByValue(WebElement ele, String value)
{
	boolean flag= false;
	try {
		Select option = new Select(ele);
		option.selectByValue(value);
		flag=true;
		return flag;
	}
	catch(Exception e)
	{
		flag=false;
		return flag;
	}
	
	finally 
	{
		if(flag)
		{
			System.out.println("Select the dropdown by its value");
		}
		else
		{
			System.out.println("drop down is not selectd");
		}
	}
}

//selectByVisibleText
public static boolean selectByVisibleText(WebElement ele, String text)
{
	boolean flag=false;
	try
	{
		Select option = new Select(ele);
		option.selectByVisibleText(text);
		flag=true;
		return flag;
	}
	catch(Exception e)
	{
		return flag;
	}
	
	finally
	{
		if(flag) {
			System.out.println("SelectedByVisibleText");
		}
		else
		{
			System.out.println("Failed to select text");
		}
	}
}

//SelectByIndex
public static boolean selectByIndex(WebElement ele,int index )
{
	boolean flag= false;
	try
	{
		Select option= new Select(ele);
		option.selectByIndex(index);
		flag=true;
		return flag;
	}
	catch(Exception e)
	{
		return flag;
	}
	
	finally
	{
		if (flag)
		{
			System.out.println("Option selected by Index");
		}
		else
		{
			System.out.println("Option not selected");
		}
	}
}
	
	
/**
 * switch to defaultScroll
 * @return 
 *
 */	
	
public static boolean switchToDefaultFrame(WebDriver driver, WebElement ele)
{
	boolean flag=false;
	try
	{
		driver.switchTo().defaultContent();
		flag=true;
		return flag;	
	}
	catch(Exception e)
	{
		return flag;
	}
	finally
	{
		if(flag)
		{
			System.out.println("switched to default content");
		}
		else
			System.out.println("Failed to switch");
	}
	
}
	

//Move to element by mouse action
	public static boolean moveToElement(WebDriver driver, WebElement ele)
	{
		boolean flag=false;
		try {
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
			if(flag)
			{
				System.out.println("move action is performed");
			}
			else
			{
				System.out.println("move action cannot be performed");
			}
		}
	}	
	
	
//MoveToElement and RightClick action
	public static boolean moveRightClick(WebDriver driver, WebElement ele)
	{
		boolean flag=false;
		try
		{
			Actions action = new Actions(driver);
			action.moveToElement(ele).contextClick(ele).build().perform();
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
				System.out.println("right click is performed");
			}
			else
			{
				System.out.println("failed to right click");
			}
		}
	}
	
	//moveToElement and sendUppercase text
	
	public static boolean moveSendUpperkeys( WebElement ele, String text)
		{
		boolean flag= false;
		try
		{
			Actions action = new Actions(driver);
			action.moveToElement(ele).keyDown(ele, Keys.SHIFT).sendKeys(text);
			flag=true;
			return flag;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		finally
		{
			if (flag)
			{
				System.out.println("text sent");
			}
			else
			{
				System.out.println("unable send text");
			}
		}
		}
	
//SendKeys
	
public static boolean sendKeys(WebElement ele, String text)	
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
		return flag;
	}
	finally
	{
		if(flag) {
			System.out.println("keys are sent");
		}
		else
		{
			System.out.println("failed to send keys");
		}
	}
}
	

//click action
public static boolean clickaction(WebElement ele)
{
boolean flag= false;
try
{
	ele.click();
	flag=true;
	return flag;
}

catch(Exception e) {
	e.printStackTrace();
	return flag;
}

finally
{
	if (flag)
	{
		System.out.println("element clicked");
	}
	else
	{
		System.out.println("Element not clicked");
	}
}
}


/**
 * WebDriver waits
 * @return 
 *
 */	

//Implicit Wait

public static void implicitWit(WebDriver driver, int timeout)
{
	driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
}


/**
 * ScreenShot
 * @return 
 * @return 
 *
 */	
public static String screenShot(WebDriver driver, String filename)
{
	String dateformat= new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	TakesScreenshot takeScreenShot=(TakesScreenshot)driver;
	File Source=takeScreenShot.getScreenshotAs(OutputType.FILE);
	String Destination= System.getProperty("user.dir")+"\\ScreenShot\\"+filename+"_"+dateformat+".png";
	try
	{
		FileUtils.copyFile(Source, new File(Destination));
	}
	catch(Exception e)
	{
		e.getMessage();
	}
	return Destination;
}

}
