package demoPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Initial {
	public WebDriver driver;

	public WebDriver invole() throws IOException
	{
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\demoPractice\\data.properties");
				prop.load(fis);
		String browser = prop.getProperty("browser");
//				/String browser= System.getProperty("browser");
		if (browser.equals(browser))
		{
			
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
			
			//invoke webdriver object
			ChromeOptions option = new ChromeOptions();
			option.addArguments("headless");
			 driver=new ChromeDriver(option);
		}
		else
		{
			//firefox
		}
		return driver;
	}
	public void getScreenshot(String getMethodName, WebDriver driver) throws IOException
	{
		TakesScreenshot gs=(TakesScreenshot)driver;
		File src= gs.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir"+"\\report"+getMethodName+".png");
		FileUtils.copyFile(src, new File(path));
	}
}
