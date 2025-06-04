/**
 * 
 */
package com.crm.qa.actionDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.crm.qa.basepage.BasePage;

/**
 * @author Admin
 *
 */
public class Action extends BasePage {

	/**
	 * @author Admin
	 *Get Title action
	 * @return 
	 */
public static boolean getTitleName()
{
	String Title = null;
	boolean flag=false;
	try
	{
		Title= driver.getTitle();
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
			System.out.println("Title of the Page is "+Title);
		}
		else
		{
			System.out.println("Title is not displayed");
		}
	}
}
	
	
	
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
	
	
	//Switch to frames
	/**
	 * @Frames Actions
	 *
	 */
	public static boolean switchToFrame(WebElement ele)
	{
		boolean flag=false;
		try {
			
			driver.switchTo().frame(ele);
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
				System.out.println(ele+" switched to frame");
			}
			else
			{
				System.out.println(ele+" is failed to switch");
			}
		}
	}
	
public static boolean switchToDefaultContent()	
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
		e.printStackTrace();
		return flag;
	}
	finally
	{
		if(flag)
		{
			System.out.println("Switched back to default content");
		}
		else
		{
			System.out.println("Failed to switch back to default content");
		}
	}
	
}
	//Implicitwait
public boolean implicitelyWait(WebElement ele)
{
	boolean flag=false;
	try
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		flag=true;
		return flag;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		return flag;
	}
}

/**
 * @author Admin
 *Screen shot 
 * @return 
 * @throws IOException 
 */

public static String Screenshot(WebDriver driver, String Testcase) throws IOException
{
String timestamp= new SimpleDateFormat("yyyy.MM.dd.hh.MM.ss").format(new Date());
String screenshotLocation=System.getProperty("user.dir")+"\\Screenshot\\"+Testcase+"_"+timestamp+".png";
TakesScreenshot Sshot= (TakesScreenshot)driver;
File src=Sshot.getScreenshotAs(OutputType.FILE);
String destination= (screenshotLocation);
FileUtils.copyFile(src, new File(destination));
return destination;
}
}