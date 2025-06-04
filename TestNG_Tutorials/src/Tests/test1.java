package Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class test1 {
	@AfterMethod
	public void afterMethod() {
		System.out.println("this is running after 'loan' method is ran");
	}
	
	//@Test(groups= {"Smoke"})
	
	@Test(dependsOnMethods= {"loan"})
	public void demo() {
		
		System.out.println("Hello");
	}
	@Test
	public void loan() {
		System.out.println("Bye");
	}
	
}
