package testNgRevised;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	
@BeforeTest
public void beforTest() {
	
	System.out.println("running befor test module");
}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("running before each method");
	}
	@Test(groups= {"smoke"})
	public void homeLoan() {
		System.out.println("Home Loan");
	}
	
	@Test(dependsOnMethods= {"homeLoan"})
	
	public void carLoan() {
		System.out.println("CarLoan");
	}
}
