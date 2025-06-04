/**
 * 
 */
package com.crm.qa.basepage;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

/**
 * @author Admin
 *
 */
public class BasePage {

	Properties prop;
public	static WebDriver driver;
	
	public BasePage()
	{
		Properties prop = new Properties();
		
		try {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		prop.load(fis);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	public WebDriver launch()
	{
		String browser= prop.getProperty("browser");
		
		if (browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"src\\main\\java\\com\\crm\\qa\\drivers\\chromedriver.exe");
		}
		else
		{
			System.out.println("FirfoxDriver");
		}
		driver.get(System.getProperty("url"));
		return driver;
		
		
	}
	
	
}
