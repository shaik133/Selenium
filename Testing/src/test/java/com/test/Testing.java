package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {
	WebDriver driver;
	 Actions action;
	String textArea="This is text area fill by automation";
	String firstName="Shaik";
	String lastName="Sadiq";
	
	
	@BeforeMethod
	public void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		 
	}
	
	@Test(priority=0)
	public void fillTextArea() throws InterruptedException {
		 action = new Actions(driver);
		action.scrollToElement(driver.findElement(By.name("message"))).perform();
		driver.findElement(By.name("message")).clear();
		driver.findElement(By.name("message")).sendKeys(textArea);
	}
	
	@Test(priority=1)
	public void fillTextBox() {
		//action.scrollToElement(driver.findElement(By.name("firstname"))).perform();
		driver.findElement(By.name("firstname")).sendKeys(firstName);
		driver.findElement(By.name("lastname")).sendKeys(lastName);
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.automationtestinginsider.com/?firstname=Shaik&lastname=Sadiq");
	}
	
	@Test(priority=3)
	public void selectRadioButton() {
		WebElement ele=driver.findElement(By.cssSelector("input[value='No']"));
		ele.click();
		if(ele.isSelected()) {
			Assert.assertTrue(true);
		}
	}
	
	@Test(priority=4)
	public void checkBox() {
		List<WebElement> elements=driver.findElements(By.cssSelector("input[type='checkbox']"));
		for(WebElement ele:elements) {
			ele.click();
		}
	}
	
	@Test(priority=5)
	public void inputTypeButton() {
		driver.findElement(By.cssSelector("input[value='Click Me!']")).click();
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		
	}
	
	@Test(priority=6)
	public void selectDropdown() {
		WebElement dropdown=driver.findElement(By.name("cars"));
		Select option= new Select(dropdown);
		option.selectByValue("fiat");
		WebElement opt=option.getFirstSelectedOption();
		if(opt.equals("Fiat")) {
			Assert.assertTrue(true);
		}
		
	}
	
	@Test(priority=7)
	public void webtable() {
		List<WebElement>  td=driver.findElements(By.cssSelector("div center table tbody tr td:nth-child(1)"));
		for(WebElement t:td) {
			if(t.getText().equalsIgnoreCase("John")) {
				String name=t.findElement(By.xpath("//div/center/table/tbody/tr/td[1]/following-sibling::td")).getText();
				System.out.println(name);
			}
			
		}
		
		for(int i=0;i<td.size();i++) {
			if(td.get(i).getText().equalsIgnoreCase("James")) {
				String salary=td.get(i).findElement(By.xpath("//div/center/table/tbody/tr/td[1]/following-sibling::td")).getText();
				System.out.println(salary);
			}
		}
	}
	
	
	@Test(priority=8)
	public void frame1() {
		
		WebElement frame=driver.findElement(By.name("iframe_a"));
		driver.switchTo().frame(frame);
		
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,4000)");
		
		
		
		driver.findElement(By.className("navbar-toggler-icon")).click();
	}
	
	@Test(priority=9)
	public void frame2Scroll() {
		WebElement frame2= driver.findElement(By.id("iframe01"));
		driver.switchTo().frame(frame2);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)");
		js.executeScript("document.querySelector(\"iframe[id='iframe01']\",scrollTo(0,1000))");
	}
	
	@AfterMethod
	public void closeBrowser() {
		//driver.close();
	}
	
	
}
