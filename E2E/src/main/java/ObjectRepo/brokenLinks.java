package ObjectRepo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class brokenLinks {

	
	WebDriver driver;
	
	public brokenLinks(WebDriver driver)
	{
		this.driver= driver;
	}
	
	By links = By.xpath("//div[@id='gf-BIG']//li[@class='gf-li']//a");
	
	
	public List<WebElement> link()
	{
		return driver.findElements(links);
	}
}
