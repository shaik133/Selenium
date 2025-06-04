package testCase;

import java.io.IOException;

import org.testng.annotations.Test;

import Framework_practice.Init;

public class HomePage extends Init {

	@Test
	public void test1() throws IOException
	{
		driver= start();
		driver.get("https://qaclickacademy.com/");
	}
}
