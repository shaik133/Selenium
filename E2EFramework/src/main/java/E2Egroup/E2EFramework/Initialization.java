package E2Egroup.E2EFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Initialization {
	public WebDriver driver;
	public Properties prop;
	public WebDriver invokeDriver() throws IOException
	
	{
		 prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\E2EFramework\\src\\main\\java\\E2Egroup\\E2EFramework\\data.properties");
		prop.load(fis);
		//String browserName=prop.getProperty("browser");
		String browserName= System.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.contains(browserName))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
			ChromeOptions option= new ChromeOptions();
			if(browserName.contains("headless"))
			{
			option.addArguments("headless");
			//invoke webdriver object
			}
			 driver=new ChromeDriver(option);
			
		}
		else {
			//firefox browser
		}
		return driver;
	}
	
}
