package com.my_store.base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static Properties prop;
	public static FileInputStream fis;
	public static WebDriver driver;
	
	{
		try {
			 prop = new Properties();
			 fis = new FileInputStream(System.getProperty("user.dir")+"\\configuration\\config.properties");
			prop.load(fis);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void launchBrowser()
	{
		String browser = prop.getProperty("browser");
		if (browser.contains("chrome"))
		{
			System.setProperty("Webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else
		{
			System.out.println("Firefox");
		}
	}
	
}
