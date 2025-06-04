package com.cart.actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.cart.basePage.BasePage;

public class Actions extends BasePage {

	//--------getTitle-------------
	static String title;
	static String vegName[] = {"Brocolli","Cauliflower","Cucumber","Beans"};
	public static boolean getTitle(String ExpectedTitle) {
		
		boolean flag=false;
		try {
			title = driver.getTitle();
			Assert.assertEquals(title,ExpectedTitle);
			flag=true;
			return flag;
			
		}
		catch(Exception e)
		{
			 e.printStackTrace();
			 return flag;
		}
		finally {
			if(flag==true)System.out.println("Title of the page is "+title);
			else System.out.println("Unable to print title of the page!! Please check the logs");
		}
		
		
		
	}
	
	public static String getLogo(WebElement ele) {
		String text=ele.getText();
		return text;
	}
	
	public static void getVeggies(List<WebElement> ele, List<WebElement> ele1) {
		int j=0;
		List<WebElement> elements= ele;
		for(int i=0; i<elements.size();i++) {
			String formatedVegName=elements.get(i).getText().split("-")[0].trim();
			List<String> vegList= Arrays.asList(vegName);
			if(vegList.contains(formatedVegName)) {
				ele1.get(i).click();
				String att=driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).getAttribute("class");
				if(att.contains("added")) {
					Assert.assertTrue(true);
				}
				j++;
			}
 			if(j==vegName.length) {
 				break;
 			}
		}
	}
	
	
	public static boolean click(WebElement ele) {
		boolean flag=false;
		try {
			ele.click();
			flag=true;
			return flag;
		}
		catch(Exception e) {
			e.printStackTrace();
			return flag;
		}
		finally {
			if(flag==true) {
				System.out.println(ele+" is clicked");
			}
			else System.out.println(ele+" is failed to locate");
		}
	}
	
	
	public static void getCartProducts(List<WebElement> ele) {
	ArrayList<String> arr= new ArrayList<String>();
	List<WebElement> products=	ele;
	for(int i=0;i<products.size();i++) {
		String formatedProduct=products.get(i).getText().split("-")[0].trim();
		arr.add(formatedProduct);
	}
	List<String> veggies= Arrays.asList(vegName);
	Assert.assertEquals(veggies,arr );
	}
	
}
