package testngPractice.revise;

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

public class initiating {
	public WebDriver driver;
	public WebDriver invoke() throws IOException
	{
		Properties prop= new Properties();
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\testngPractice\\revise\\file.properties");
		prop.load(fis);
		
	String browser=	prop.getProperty("browser");
	
	if(browser.equals(browser))
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		
		//invoke webdriver object

		 driver=new ChromeDriver();
	}
	else {
		//firfox
	}
	
	return driver;
	}
	
	public  void getScreenShot(String getMethodName, WebDriver driver) throws IOException
	{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path= System.getProperty("user.dir"+"\\report"+getMethodName+".png");
		FileUtils.copyFile(src, new File(path));
	}

}
