package com.crm.tests;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.actions.Action;
import com.crm.base.page.BasePage;
import com.crm.pagemodel.LoginPage;

public class LoginTest extends BasePage {
	LoginPage login;
	
	
	public LoginTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException {
		launchBrowser();
		 login= new LoginPage();
	}
	
	
	@Test(priority=1)
	public void validateTitleOfTheFlipkart() {
		String AcualTitle=Action.getTitle();
		//String AcualTitle =driver.getTitle();
		log.info("Verifying the title of the page "+AcualTitle);
		Assert.assertEquals(AcualTitle,prop.getProperty("HomeTitle"));
	}
	
	@Test(priority=2)
	public void loginFlipkart() throws InterruptedException, IOException {
		//WebElement profile=driver.findElement(By.cssSelector("div[class='H6-NpN _3N4_BX'] a"));
		login.movetoSignInBtn();
		Thread.sleep(3000);
		//Action.explicitWait(By.cssSelector("a[class='_2Udqwk']"));
		login.clickSignUpBtn();	
	}
}
