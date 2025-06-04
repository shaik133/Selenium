package com.cart.basePage;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.cart.utilities.Log4j;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BasePage extends Log4j {

	Properties prop;
	public static WebDriver driver;
	
	public BasePage() {
		
		prop= new Properties();
		boolean flag=false; 
		try {
			FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\cart\\config\\config.properties");
			prop.load(fis);
			flag=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			if(flag==true) {
				System.out.println("Config file is loaded");
			} 
			else System.out.println("Config file failed to load");
		}
	}
	
	public WebDriver launch() {
		String browser=prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		else System.out.println("firefox");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("baseUrl")+"seleniumPractise/#/");
		return driver;
	}
  @BeforeMethod
  public void initLogs() {
	  log();
	Log4j.startTest();
  }
	@AfterMethod()
	public void teardown()
	{
		
		Log4j.endTest();
		//driver.close();
	}
	
}