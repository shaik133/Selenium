package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QaHome {

	WebDriver driver;
	
	public QaHome(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By course= By.linkText("Courses");
	
	public WebElement course()
	{
		return driver.findElement(course);
	}
}
