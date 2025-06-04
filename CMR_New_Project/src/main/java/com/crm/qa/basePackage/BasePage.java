/**
 * 
 */
package com.crm.qa.basePackage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.crm.qa.utils.Utilities;
import com.crm.qa.utils.WebEventListener;
import com.crm.qa.utils.logs;

import net.jodah.failsafe.Timeout;

/**
 * @author Admin
 *
 */
public class BasePage {

	public static  Properties prop;
	public static  FileInputStream fis;
	public static WebDriver driver;
	EventFiringWebDriver e_driver;
	public static Logger log;
	
	
//	@BeforeClass
//	public void initLog4j()
//	{
//		PropertyConfigurator.configure("Log4j.xml");
//	}
//	
	public BasePage()
	{
		try {
		 prop = new Properties();
		 fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\crm\\qa\\config\\config.properties\\");
		prop.load(fis);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public WebDriver Launch()
	{
		String browser = prop.getProperty("browser");
		log = LogManager.getLogger(logs.class.getName());
		PropertyConfigurator.configure("log4j.properties");
		
		if (browser.contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe\\");
			 driver = new ChromeDriver();
		}
		else
		{
			System.out.println("Firfox");
		}
		
		driver.get(prop.getProperty("url"));
		 e_driver= new EventFiringWebDriver(driver);
		 WebEventListener listener= new WebEventListener();
		 e_driver.register(listener);
		 driver=e_driver;
		
		Utilities.windowMax();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Utilities.implicitWait, TimeUnit.SECONDS);
	
		return driver;
		
	}
	
	
}
