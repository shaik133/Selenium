package Practice.E2E;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.io.Files;

public class Initialization {
	WebDriver driver;
	public WebDriver base() throws IOException
	{
		
		;
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\E2E\\src\\main\\java\\Practice\\E2E\\File.properties");
		prop.load(fis);
		
		String browser=prop.getProperty("browser");
		
		if(browser.equals(browser))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
			
			//invoke webdriver object
			
			driver=new ChromeDriver();
			
		}
		else {
			//Firfox
		}
		return driver;
	}
	
	public void takeScreenShot(String getMethodname, WebDriver driver) throws IOException
	{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path =System.getProperty("user.dir"+"\\report"+getMethodname+".png");
		FileUtils.copyFile(src, new File(path));
	}
	
}
