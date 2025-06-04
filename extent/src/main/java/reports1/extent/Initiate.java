package reports1.extent;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Initiate {
	WebDriver driver;
	public WebDriver invoke() throws IOException {
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\extent\\src\\main\\java\\reports1\\extent\\data.properties");
	
	prop.load(fis);
	
	String browser=prop.getProperty("browser");
	
	if (browser.equals(browser)) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		 driver= new ChromeDriver();
		
	}
	else {
		//firfox
	}
	return driver;
}
}