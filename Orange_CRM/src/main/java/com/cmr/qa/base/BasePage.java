/**
 * 
 */
package com.cmr.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeSuite;

import com.cmr.qa.utilities.ExtentRepo;



import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Admin
 *
 */
public class BasePage {

	public static Properties prop;
	public static WebDriver driver;
	public static Logger log;

	@BeforeSuite
	public void beforeSuite() throws IOException {
		ExtentRepo.setupReports();
	}

	@BeforeClass
	public void log4j() {
		log = Logger.getLogger(getClass());
		PropertyConfigurator.configure("log4j.properties");

	}

	public BasePage() {
		prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\com\\cmr\\qa\\config\\config.properties");
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static WebDriver launch() {

		String browser = prop.getProperty("browser");
		if (browser.contentEquals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else {
			// firefox
		}
		log.info("<<<<<<<<<<<<<<<<<<<<<<<< Browser launched >>>>>>>>>>>>>>>>>>");
		driver.get(prop.getProperty("baseurl"));

		driver.manage().window().maximize();
		return driver;

	}

//	@AfterMethod
//	public void tearDown() {
//		log.info("<<<<<<<<<<<<<<<<<<<<<< Browser closed>>>>>>>>>>>>>>>>>>>");
//		driver.close();
//	}
}
