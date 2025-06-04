/**
 * 
 */
package com.my_store.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.my_store.qa.utilities.ExtentReportUtility;


/**
 * @author Admin
 *
 */
public class BasePage {

	public Properties prop;
	public FileInputStream fis;
	public static WebDriver driver;
	public static Logger log;
	
	@BeforeSuite
	public void startReport() throws IOException
	{
		ExtentReportUtility.extent();
	}
	
	public BasePage()
	{
		try
		{
			prop= new Properties();
			fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\my_store\\qa_configuration\\config.properties");
			prop.load(fis);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@BeforeClass
	public void log4j()
	{
		 log=LogManager.getLogger(getClass());
		PropertyConfigurator.configure("log4j.properties");
	}
	
	
	public void launch()
	{
		String browser=prop.getProperty("browser");
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\com\\my_store\\qa\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else
		{
			System.out.println("Firefox");
		}
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	}
	
//	@AfterMethod
//	public void tearDown()
//	{
//		driver.close();
//		log.info("Browser is closed");
//	}
	
	
	@AfterSuite
	public void flushrport()
	{
		ExtentReportUtility.flush();
	}
}
