package testNgRevised;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class properties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\testNgRevised\\src\\testNgRevised\\file.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
	System.out.println(prop.getProperty("Browser"));	
		System.out.println(prop.getProperty("URL"));
		
		prop.setProperty("Browser", "Yahoo.com");
		System.out.println(prop.getProperty("Browser"));
		
		
	}

}
