/**
 * 
 */
package com.cmr.qa.tests;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cmr.qa.action.Actions;
import com.cmr.qa.base.BasePage;
import com.cmr.qa.pages.EmployeeListPage;
import com.cmr.qa.pages.LoginPage;
import com.cmr.qa.utilities.Logs;
import com.cmr.qa.xlutils.Excel_Utlis;

/**
 * @author Admin
 *
 */
public class Test1_LoginTest extends BasePage {
	
	

	LoginPage login;
	EmployeeListPage employeeListPage;

	public Test1_LoginTest() {
		super();

	}

	@BeforeMethod
	public void setup() {
		launch();

		login = new LoginPage();
		employeeListPage = new EmployeeListPage();
	}

	@Test(priority = 1)
	public void isUrlValid() {
		log.info("Varifying launched url");
		String url = login.getCurrentUrl();
		String expUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Assert.assertEquals(url, expUrl);
		System.out.println(url);
	}

	@Test(priority = 2)
	public void TitleTest() {
		log.info("validate the title of the page");
		Assert.assertEquals(login.title(), "OrangeHRM");
		;

	}

	@Test(priority = 3)
	public void isLogoDisplayedTest() throws InterruptedException {
		Thread.sleep(3000);
		log.info("Validate logo of the page is visible");
		Assert.assertTrue(login.isLogoVisible(), "Logo is visible");
	}

	@Test(priority=4,dataProvider = "login", dataProviderClass = Actions.class)
	public void log(String usename, String pwd, String credStatus) throws InterruptedException
	{
		log.info("Entering the Log in credentials and submit the form");
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
//		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("button[type='submit']"))));
	Thread.sleep(3000);
		employeeListPage =login.enterLoginCredentials(usename, pwd, credStatus);
		
	}
	
	@Test(priority=5)
	public void clickForgetPasswordBtn()
	{
		Actions.implictWait();
		login.clicFrgotPwdBtn();
		String landingUrl=login.getCurrentUrl();
		String expUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode";
		Assert.assertEquals(landingUrl, expUrl);
		
	}

//	@Test(dataProvider = "loginData", dataProviderClass = Actions.class)
//	public void loginTest(String usename, String pwd, String credStatus) throws InterruptedException {
//		log.info("Entering the Log in credentials and submit the form");
//		Thread.sleep(3000);
//		login.enterLoginCredentials(usename, pwd, credStatus);
//		String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
//		String fetchedUrl = driver.getCurrentUrl();
//		if (credStatus == "valid") {
//			if (expUrl == fetchedUrl) {
//				Thread.sleep(3000);
////				driver.findElement(By.cssSelector(".oxd-userdropdown-name")).click();
////				driver.findElement(By.cssSelector("a[href*='logout']")).click();
//				Assert.assertTrue(true);
//			} else {
//				Assert.assertTrue(false);
//			}
//		} else if (credStatus == "invalid") {
//			if (expUrl == fetchedUrl) {
//				Thread.sleep(3000);
//				driver.findElement(By.cssSelector(".oxd-userdropdown-name")).click();
//				driver.findElement(By.cssSelector("a[href*='logout']")).click();
//				Assert.assertTrue(false);
//			} else {
//				String invalidAlert = driver.findElement(By.cssSelector(".oxd-alert-content-text")).getText();
//				Assert.assertTrue(true, invalidAlert);
//			}
//		}
////		Assert.assertEquals(login.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
//	}
//
//	@Test(dataProvider = "loginCred", dataProviderClass = Actions.class)
//	public void login(String username, String password, String credStatus) throws InterruptedException {
//
////		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
////		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("button[type='submit']"))));
//		Thread.sleep(3000);
//
//		login.enterLoginCredentials(username, password, credStatus);
//		String exUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
//		String fetchUrl = driver.getCurrentUrl();
//
//		if (credStatus.equalsIgnoreCase("valid")) {
//			if (exUrl == fetchUrl) {
//				Thread.sleep(4000);
//				driver.findElement(By.cssSelector("p[class='oxd-userdropdown-name']")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.cssSelector("a[href*='logout']")).click();
//				System.out.println("Credentials are valid hence login successful");
//				Assert.assertTrue(true);
//
//			} else {
//				System.out.println("Credentials are valid however login failed");
//				Assert.assertTrue(false);
//			}
//		} else if (credStatus.equalsIgnoreCase("invalid")) {
//			if (exUrl == fetchUrl) {
//				Thread.sleep(4000);
//				driver.findElement(By.cssSelector("p[class='oxd-userdropdown-name']")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.cssSelector("a[href*='logout']")).click();
//				System.out.println("Credentials are invalid however login successful");
//				Assert.assertTrue(false);
//			} else {
//				String Alert = driver.findElement(By.cssSelector(".oxd-alert-content-text")).getText();
//				System.out.println(
//						"Credentials are invalid and hence login failed by raising alert and assertion passed");
//				Assert.assertTrue(true, Alert);
//			}
//
//		}
//	}
}
