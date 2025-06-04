package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.rediffhomePage;
import ObjectRepository.rediffsearchPage;

public class LoginApp {

	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		rediffhomePage rp= new rediffhomePage(driver);
		rp.email().sendKeys("shaikjafarsadq@gmail.com");
		rp.pwd().sendKeys("password");
		rp.signin().click();
		rp.home().click();
		
		rediffsearchPage rs= new rediffsearchPage(driver);
		rs.search().sendKeys("hello");
		rs.searchbtn().click();
	}
}
