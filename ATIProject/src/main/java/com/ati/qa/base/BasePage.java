package com.ati.qa.base;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.ati.qa.utilities.ExtentRepo;



public class BasePage {
	public Properties prop;
	public static WebDriver driver;
	public ExtentRepo ext;
	public Logger log;
	
	public BasePage()
	{
		boolean flag=false;
		try
		{
			
			prop = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\ati\\qa\\configuration\\config.properties");	
			prop.load(fis);
			flag=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			flag=false;
		}
		finally
		{
			if(flag==true)
			{
				System.out.println("config file is loaded ");
			}
			else
			{
				System.out.println("config file is failed to load");
			}
		}
	}
	
	public WebDriver launch()
	{
		String browser=prop.getProperty("browser");
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else
		{
			System.out.println("firefox");
		}
		
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().getPageLoadTimeout();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		return driver;
	}

	
	@BeforeClass
	public void initLog4j()
	{
		 log= Logger.getLogger(getClass());
		PropertyConfigurator.configure("log4j.properties");
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	@BeforeSuite
	public void initreport()
	{
		 ext= new ExtentRepo();
			ext.extentRepo();
	}
	
	@AfterSuite
	public void flush()
	{
	ext.flush();
	}
	
}
