package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class frameBox {

	
	WebDriver driver;
	
	public frameBox(WebDriver driver)
	{
		this.driver= driver;
	}
	
	
	By frameBox = By.className("demo-frame");
	By drag = By.id("draggable");
	By drop = By.id("droppable");
	
	By contributeHover= By.xpath("//a[text()='Contribute']");
	
	By search = By.className("ds-input");
	
	
	public WebElement frame()
	{
		return driver.findElement(frameBox);
		
		
	}
	
	public WebElement drag()
	{
		return driver.findElement(drag);
		
	}
	
	public WebElement drop()
	{
		return driver.findElement(drop);
		
	}
	
	public WebElement Hover() {
		return driver.findElement(contributeHover);
	}
	
	public WebElement searchbar()
	{
		return driver.findElement(search);
	}
}
