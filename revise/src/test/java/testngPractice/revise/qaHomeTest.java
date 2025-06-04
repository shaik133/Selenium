package testngPractice.revise;

import java.io.IOException;

import org.testng.annotations.Test;

import objectRepo.QaHome;

public class qaHomeTest extends initiating {
@Test
	public void qaHome() throws IOException
	{
	driver=invoke();
	driver.get("https://qaclickacademy.com/");
	QaHome qa= new QaHome(driver);
	qa.course().click();
	}

	
	

}
