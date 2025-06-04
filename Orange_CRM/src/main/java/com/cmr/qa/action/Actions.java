/**
 * 
 */
package com.cmr.qa.action;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

import com.cmr.qa.base.BasePage;
import com.cmr.qa.xlutils.Excel_Utlis;

/**
 * @author Admin
 *
 */
public class Actions extends BasePage {

	/* <<<<<<<<<< Implicite wait >>>>>>>>> */

	public static void implictWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
	}

	/* <<<<<<<<<<<<<< CLICK ACTION >>>>>>>>>>>>>>>> */
	public static void click(WebElement ele) {
		boolean flag = true;
		if (flag) {
			ele.click();
			System.out.println(ele + " is clicked");
		} else {
			System.out.println(ele + " is failed to click");
		}

	}

	/* <<<<<<<<<<<<<<<<<<<<<<<<<<<< SEND KEYS >>>>>>>>>>>>>>>>>> */
	public static void sendKeys(WebElement ele, String text) {

		if (true) {
			ele.sendKeys(text);
			System.out.println(text + " is sent to the input form");

		} 
		else {
			System.out.println(text + " is failed to send");
		}

	}
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<< EXPLICIT WAIT >>>>>>>>>>>>>>*/
//	public static  void ExplicitWait(WebElement ele)
//	{
//		WebDriverWait  wait = new WebDriverWait(driver,);
//		wait.until(ExpectedConditions.elementToBeClickable(ele));
//	}
	
	/* <<<<<<<<<<<<<<<<<<<<<<<<<<<< SEND RANDOM KEYS >>>>>>>>>>>>>>>>>> */
	public static void sendRandomKeys(WebElement ele, StringBuilder text) {

		if (true) {
			ele.sendKeys(text);
			System.out.println(text + " is sent to the input form");

		} 
		else {
			System.out.println(text + " is failed to send");
		}

	}
	
	/*<<<<<<<<<<<<<<<<<<<< GET TEXT >>>>>>>>>>>>>>>*/
	public static String getText(WebElement ele)
	{
		String msg=ele.getText();
		if(!(msg==null))
		{
			System.out.println("Fetched message/text is: "+msg);
		}
		else
		{
			System.out.println("Unable to fetch msg");
		}
		return msg;
	}
	
	/*<<<<<<<<<<<<<<<<< RANDOM STRING GENERATE >>>>>>>>>>>>>>>*/
	public static StringBuilder getRandomString(int n)
	{
		
		String randomString="ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"abcdefghijklmnopqrstuvwxyz"+"1234567890"+"!@#$%^&*()";
		
		StringBuilder sb= new StringBuilder(n);
		
		for (int i=0;i<n;i++)
		{
			int index= (int) (randomString.length()*Math.random());
			
			sb.append(randomString.charAt(index));
		}
		return sb;
	}

	/* <<<<<<<<<<<<<<<<<<<<< SCREEN SHOT >>>>>>>>>>>>>>>>>> */
	public static String screenshot(WebDriver driver, String Testcase) {
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.hh.MM.ss").format(new Date());
		TakesScreenshot takeScreenshot = (TakesScreenshot) driver;

		File src = takeScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\Screenshots\\SS_" + timestamp + ".png";
		try {
			FileUtils.copyFile(src, new File(destination));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return destination;
	}

	@DataProvider(name = "loginData")
	public String[][] getLoginData() {
		String login[][] = { { "Admin", "admin123", "valid" }, { "admin", "admin123", "valid" },
				{ "Admin", "Admin123", "invalid" } };
		return login;
	}

//valid login	
	@DataProvider(name = "login")
	public String[][] getLogin() {
		String login[][] = { { "Admin", "admin123", "valid" } };
		return login;
	}

	@DataProvider(name = "loginCred")
	public String[][] getLoginInfo() throws IOException {
		String filePath = System.getProperty("user.dir")
				+ "\\src\\main\\java\\com\\cmr\\qa\\xlutils\\document (4) (2).xlsx";

		int rowCount = Excel_Utlis.getRow(filePath, "Sheet1");
		int cellCount = Excel_Utlis.getCell(filePath, "Sheet1", rowCount);

		String login[][] = new String[rowCount][cellCount];
		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				login[i - 1][j] = Excel_Utlis.getData(filePath, "Sheet1", i, j);

			}
		}
		return login;
	}
}
