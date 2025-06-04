package Practice.E2E;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ObjectRepo.brokenLinks;

public class brokenlinksTest extends Initialization {

	SoftAssert s= new SoftAssert();
	@BeforeTest
	public void links() throws IOException
	{
		driver= base();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	}
	
	
	@Test
	public void test() throws MalformedURLException, IOException
	{
		
		brokenLinks obj = new brokenLinks(driver);
		List<WebElement> links= obj.link();
		for (WebElement link:links)
		{
			String URL= link.getAttribute("href");
			HttpURLConnection	connect=(HttpURLConnection)new URL(URL).openConnection();
			connect.setRequestMethod("HEAD");
			connect.connect();
			int resCode= connect.getResponseCode();
			s.assertTrue(resCode<400, "the broken link is "+link.getText()+" With the response code of "+resCode);
		}
		s.assertAll();
	}
	
}
