package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rediffsearchPage {

	WebDriver driver;
	public rediffsearchPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By inputSearch= By.id("srchword");
	By search =By.xpath("//input[@class='newsrchbtn']");
	
	public WebElement search()
	{
		return driver.findElement(inputSearch);
	}
	public WebElement searchbtn()
	{
		return driver.findElement(search);
	}
}
