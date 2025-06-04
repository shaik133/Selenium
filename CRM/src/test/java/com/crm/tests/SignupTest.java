package com.crm.tests;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.base.page.BasePage;
import com.crm.pagemodel.LoginPage;
import com.crm.pagemodel.SignupPage;

public class SignupTest extends BasePage {

	LoginPage login;
	LoginTest logTest;
	SignupPage signup;
	
	public SignupTest() throws IOException {
		super();
	}
	
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		launchBrowser();
		 login= new LoginPage();
		 login.movetoSignInBtn();
		 Thread.sleep(3000);
		 signup =login.clickSignUpBtn();
		 
	}
	
	@Test
	public void clickLoginLink() {
		log.info("Clicking on the login/Existing user link at the signup page");
		signup.clickLoginLink();
	}
}
