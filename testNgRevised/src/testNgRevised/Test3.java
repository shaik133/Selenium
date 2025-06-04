package testNgRevised;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test3 {

	@DataProvider
	public Object[][] getData() {
	
		Object[] [] data = new Object[3][2];
		data[0][0]="username";
		data[0][1]="pwd";
		data[1][0]="username2";
		data[1][1]="pwd2";
		data[2][0]="username3";
		data[2][1]="pwd3";
		return data;
		
	}
	
	@Test(dataProvider="getData")
	public void test(String usrname, String pwd) {
		System.out.println(usrname);
		System.out.println(pwd);
	}
}
