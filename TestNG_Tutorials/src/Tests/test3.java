package Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test3 {

	@BeforeClass
	public void bclass() {
		System.out.println("This is execting before execting all the test cases present in testclass3");
	}
	
	//@Test(groups= {"Smoke"})
	@Test
	public void presonalLoanIntrest() {
		System.out.println("Interest");
	}
	
	
	public void beforeTest() {
		
	System.out.println("Running Before test");
	}
}
