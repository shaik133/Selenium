package Framework_practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Init {

	public WebDriver driver;
	public WebDriver start() throws IOException
	{
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Framework_practice\\src\\main\\java\\Framework_practice\\test.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if (browserName.equals(browserName))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
			
			//invoke webdriver object
			
			 driver=new ChromeDriver();
		}
		
		else
		{
			//firefox
		}
	return driver;
	}
}
