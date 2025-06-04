package com.crm.actions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.crm.base.page.BasePage;


public class Action extends BasePage {
	static Actions act;
	static String[] veggies= {"Brocolli","Cucumber","Tomato"};
	public Action() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
//Get Title of the page
	public static String getTitle() {
		String title= driver.getTitle();
		System.out.println("Title of the page is "+title);
		return title;
	}
	
	//Get Text
	public static String getText(WebElement ele) {
		boolean flag=false;
		String text="";
		try
		{
			 text=ele.getText();
			flag=true;
			return text;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		finally
		{
			if(flag)
			{
				System.out.println(text+" is retrived");
			}
			else
			{
				System.out.println(text+" is failed to retrive");
			}
		}
		return text;
		
	}
//Send input text	
	public static boolean inputType(WebElement ele,String text) {
		boolean flag=false;
		try
		{
			ele.sendKeys(text);
			flag=true;
			return flag;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return flag;
		}
		finally
		{
			if(flag)
			{
				System.out.println(text+" is sent");
			}
			else
			{
				System.out.println(text+" is failed to send");
			}
		}
	}
//Click button
	public static boolean clickBtn(WebElement ele)
	{
		boolean flag=false;
		try
		{
			ele.click();
			flag=true;
			return flag;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return flag;
		}
		finally
		{
			if(flag)
			{
				System.out.println(ele+" is clicked");
			}
			else
			{
				System.out.println(ele+" is failed to click");
			}
		}
}
	//Click btn using Javascript Executor
	
			public static void jsClickBtn(WebElement ele) {
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();", ele);
			}
	//Actions class
			public static boolean moveToElement(WebElement ele) {
				 act = new Actions(driver);
				
				boolean flag=false;
				try
				{
					act.moveToElement(ele);
					flag=true;
					return flag;
				}
				catch(Exception e)
				{
					e.printStackTrace();
					return flag;
				}
				finally
				{
					if(flag)
					{
						System.out.println("Moved to the "+ele);
					}
					else
					{
						System.out.println("Unable to locate "+ele);
					}
				}
			}
		
			//Explicite wait
			public static void explicitWait(By loc) {
				WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(45));
				 wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
			}
			
			//validate the size of the products by searching products in search bar
			
			public static int searchProducts(List<WebElement> ele1,WebElement ele, String text) throws InterruptedException {
				ele.sendKeys(text);
				Thread.sleep(3000);
				int productCount=ele1.size();
				log.info("Product count is "+productCount);
				return productCount;
			}
			
			//Validate the search products matching
			public static ArrayList<String> matchSearchedProduct(WebElement ele1,List<WebElement> ele,String text) {
				ArrayList<String> arr =  new ArrayList<String>();
				ele1.sendKeys(text);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				List<WebElement>elements=ele;
				for(int i=0;i<elements.size();i++) {
					String productName=elements.get(i).getText();
					String actualProductName=productName.split("-")[0].trim();
					 
					arr.add(actualProductName);
				}
				return arr;
			}
			
			//Add products to cart
			public static void addProducts(List<WebElement> ele, List<WebElement> ele1) {
				int j=0;
				//String[] veggies= {"Brocolli","Cucumber","Tomato"};
				List<WebElement> products=ele;
				for(int i=0;i<products.size();i++) {
					String productNames=products.get(i).getText();
					String actualProductNames=productNames.split("-")[0].trim();
					List<String> vegs=Arrays.asList(veggies);
					for(String veg:vegs) {
						if(veg.equalsIgnoreCase(actualProductNames)) {
							ele1.get(i).click();
							String att=driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).getAttribute("class");
							if(att.contains("added")) {
								Assert.assertTrue(true);
							}
							j++;
						}
			 			if(j==veggies.length) {
			 				break;
			 			}
						}
					}

				}
			//Iterate through the cart products
			public static ArrayList<String> iterateCartProducts(List<WebElement> headers,  String headerName) {
				int index;
				int j=0;
				ArrayList<String> cartItems= new ArrayList<String>();
				List<WebElement> cartTableHeaders=headers; //driver.findElements(By.cssSelector("table[id='productCartTables'] thead tr:nth-child(1) td b"));
				for(int i=0; i<headers.size();i++) {
					String headerNames=headers.get(i).getText();
					 index=i+1;
					if(headerNames.equalsIgnoreCase(headerName)) {
						List<WebElement> productNames= driver.findElements(By.cssSelector("table[id='productCartTables'] tbody tr td:nth-child("+index+") p"));
						for(WebElement productName:productNames) {
							if(headerName.equalsIgnoreCase("Product Name")) {
								String product=productName.getText();
								String formatedProduct=product.split(" ")[0].trim();
								System.out.println(formatedProduct);
								cartItems.add(formatedProduct);
							}
							else {
								String product=productName.getText();
								System.out.println(product);
								cartItems.add(product);
							}
							j++;
						}if(productNames.size()==j) {
							break;
						}
					}
				}
				for(String cart:cartItems) {
					System.out.println(cart);
				}
				return cartItems;
			}
			

}


