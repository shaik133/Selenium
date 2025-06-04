package Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test6 {

	@AfterClass
	public void aClass() {
		System.out.println("This is running after all the testcase passed in testclass6");
	}
	
	@Test
	public void service1() {
		System.out.println("this is first service");
	}
	
	@Parameters ({"URL"})
	@Test
	public void service2(String uname) {
		System.out.println("this is second service");
		System.out.println(uname);
	}
	
	
}
