package Practice.E2E;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class alert extends Initialization{

	@BeforeTest
	public void beforeTest() throws IOException
	{
	driver= base();
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	}
	
	
	@Test
	public void test() throws InterruptedException
	{
		WebElement footerDriver=driver.findElement(By.id("gf-BIG"));
		
		footerDriver.findElements(By.cssSelector("li[class='gf-li'] a")).size();
	for (int i=1; i<footerDriver.findElements(By.cssSelector("li[class='gf-li'] a")).size();i++)
	{
	String keys= Keys.chord(Keys.CONTROL,Keys.ENTER);
	footerDriver.findElements(By.cssSelector("li[class='gf-li'] a")).get(i).sendKeys(keys);
	}
	Thread.sleep(2000);
	}
	
}
