/**
 * 
 */
package com.cartproject.qa.basepackage;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

/**
 * @author Admin
 *
 */
public class BasePage {

	public Properties prop;
	FileInputStream fis;
	public static WebDriver driver;
	public static Logger log;
	

	@BeforeClass
	public void setupLog4j()
	{
		log= Logger.getLogger(getClass());
		PropertyConfigurator.configure("log4j.properties");
	}
	
	public BasePage()
	{
		 prop = new Properties();
		 try {
		 fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\cartproject\\qa\\config\\config.properties");
		 prop.load(fis);
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		
	}
	
	public WebDriver launch()
	{
		String browser=prop.getProperty("browser");
				
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else
		{
			System.out.println("FireFox");
		}
		
		driver.get(prop.getProperty("addToCartUrl"));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		return driver;
		
	}
	
	
}
