package com.crm.base.page;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.crm.utilities.ExtentReportsUtility;
import com.crm.utilities.Log;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage extends Log {
	public static Properties prop;
	public static WebDriver driver;
	
	

	public BasePage() throws IOException {
		
		
		
	try {
		String path="src\\main\\java\\com\\crm\\properties\\config.propertie";
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\crm\\properties\\config.properties");
		prop= new Properties();
		prop.load(fis);
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
	
	public void launchBrowser() {
		String browser=prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			ChromeOptions chromeOptions = new ChromeOptions();
		    chromeOptions.addArguments("--start-maximized");
		    chromeOptions.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver(chromeOptions);
		}
		else {
			//firfox
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get(prop.getProperty("cartUrl"));
		
	}
	
	@BeforeMethod
	public void executeBefore() {
		logging();
		startTest();
	}
	
	@AfterMethod
	public void tearOff() {
		endTest();
		driver.close();
	}
	@BeforeSuite
	public void initailizeReports() throws IOException {
		ExtentReportsUtility.extenRreports();
	}
}
