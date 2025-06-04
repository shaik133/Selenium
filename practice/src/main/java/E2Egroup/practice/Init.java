package E2Egroup.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Init {
public WebDriver driver;
	public WebDriver invoke() throws IOException
	{
		Properties prop = new Properties();
		
		FileInputStream fis= new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\practice\\src\\main\\java\\E2Egroup\\practice\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		
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
	
	public void getScreenShot(String testCaseName,WebDriver driver	) throws IOException
	{
		TakesScreenshot SS= (TakesScreenshot)driver;
		File src=SS.getScreenshotAs(OutputType.FILE);
		String destinationSrc=System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(src, new File(destinationSrc));
	}
}
