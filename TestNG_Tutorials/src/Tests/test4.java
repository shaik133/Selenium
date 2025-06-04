package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test4 {
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data= new Object[3][2];
		
		data[0][0]="username1";
		data[0][1]="pwd1";
		
		data[1][0]="uname2";
		data[1][1]="p2";
		
		data[2][0]="uname3";
		data[2][1]="p3";
		return data;
	}
	
	
	@BeforeTest
	public void beforTest() {
		System.out.println("This is running before the EMI module executes");
	}

	
	
	//@Test(groups= {"Smoke"})
	@Test
	public void testloan1() {
		System.out.println("this is testcase1 from module test");	
		}
	
	@Test(dataProvider="getData")
	public void testloan2(String uname,String pwd) {
		System.out.println("this is testcase2 from module test");	
		System.out.println(uname);
		System.out.println(pwd);
	}
	
	
	@Test
	public void testloan3() {
		System.out.println("this is testcase3 from module test");
	}
	
	
	
}
