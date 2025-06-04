/**
 * 
 */
package com.crm.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import com.crm.qa.util.Utility;

/**
 * @author Admin
 *
 */
public class BasePage {
public static Properties prop;
public static WebDriver driver;
	
	public   BasePage()
	{
		try {
		 prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\CRM\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		prop.load(fis);
		
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
		
}
	@BeforeSuite
	public void beforeSuite()
	{
		DOMConfigurator.configure("Log4j.xml");
	}
	
	public static WebDriver launchBrowser()
	{
		
		String browser= prop.getProperty("browser");
		if (browser.contains("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else {
			System.out.println("Firfox");
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Utility.Implicit_wait, TimeUnit.SECONDS);
	
	
	driver.get(prop.getProperty("url"));
	return driver;
	}
	
	
}
