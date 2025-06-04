package E2E.complete;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Init {
	WebDriver driver;
	public WebDriver invoke() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\complete\\src\\main\\java\\E2E\\complete\\Properties.properties");
	prop.load(fis);
	
	String browser= prop.getProperty("browser");
	
	if(browser.equals(browser)) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		
		//invoke webdriver object
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("headless");
		 driver=new ChromeDriver();
	}
	else {
		//firfox=gecko driver
	}
	
	return driver;
	}
}
