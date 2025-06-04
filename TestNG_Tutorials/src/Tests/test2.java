package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class test2 {

	@AfterTest
	public void aftreTest() {
		System.out.println("This is running after  loan module is executed");
	}
	//@Test(groups= {"Smoke"})
	@Test
	public void personalLoan() {
		System.out.println("Personal loan");
	}
	
	@Test 
	public void personalLoanArrear() {
		System.out.println("Personal loan Arrear");
	}
	
	
	

	
}
