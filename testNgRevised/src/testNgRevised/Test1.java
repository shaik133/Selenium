package testNgRevised;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Test1 {
@AfterTest
public void afterTest() {
	System.out.println("Running After test module");
}
	@Test(groups= {"smoke"})
	public void loan() {
		System.out.println("Hi");
	}
	@Parameters({"url"})
	@Test
	public void parameter(String sadi)
	{
		System.out.println(sadi);
		System.out.println("this is parameter");
		
	}
}
