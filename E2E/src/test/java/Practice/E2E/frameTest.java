package Practice.E2E;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepo.frameBox;

public class frameTest extends Initialization{

	@BeforeTest
	public void frame() throws IOException
	{
		driver= base();
		driver.get("https://jqueryui.com/droppable/");
	}
	
	@Test
	public void test() {
		
	frameBox obj= new frameBox(driver);
		WebElement switchToFrame= obj.frame();
		driver.switchTo().frame(switchToFrame);
	WebElement dragSource= obj.drag();
	WebElement dropDest= obj.drop();
		Actions a = new Actions(driver);
		a.dragAndDrop(dragSource, dropDest).build().perform();
		
		driver.switchTo().defaultContent();
		
	WebElement move=	obj.Hover();
	a.moveToElement(move).build().perform();
	
	WebElement search = obj.searchbar();
	a.keyDown(search, Keys.SHIFT).sendKeys("Jquery").build().perform();
		
//		WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
//		driver.switchTo().frame(frame);
//		WebElement dragSource = driver.findElement(By.id("draggable"));
//		WebElement dropDes = driver.findElement(By.id("droppable"));
//		Actions a = new Actions(driver);
//		a.dragAndDrop(dragSource, dropDes).build().perform();
	}
}
