/**
 * 
 */
package com.crm.qa.basepage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.crm.qa.utilities.ExtentReport;

/**
 * @author Admin
 *
 */
public class BasePage {

	public static Properties prop;
public	static WebDriver driver;
public Logger log;

@BeforeSuite
public void beforeSuite() throws IOException
{
	ExtentReport.setupReports();
}


	
	public BasePage()
	{
		 prop = new Properties();
		
		try {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\crm\\qa\\configuration\\config.properties");
		prop.load(fis);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@BeforeClass
	public void beforeClass()
	{
		log= Logger.getLogger(getClass());
		 PropertyConfigurator.configure("log4j.properties");
	}
	public void launch()
	{
		
		String browser= prop.getProperty("browser");
		
		if (browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\com\\crm\\qa\\drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else
		{
			System.out.println("FirfoxDriver");
		}
		driver.get(prop.getProperty("url"));
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void afterSuite()
	{
		ExtentReport.extentFlush();
	}
	
	
}
