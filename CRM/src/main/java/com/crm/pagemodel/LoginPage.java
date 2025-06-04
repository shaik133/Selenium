package com.crm.pagemodel;



import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.actions.Action;
import com.crm.base.page.BasePage;

public class LoginPage extends BasePage {

	public LoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(css="div[class='H6-NpN _3N4_BX'] a")
	WebElement loginBtn;
	
	@FindBy(css="a[class='_2Udqwk']")
	WebElement signupLink;
	
	
	
	public void movetoSignInBtn() {
		Action.moveToElement(loginBtn);
	}
	
	public SignupPage clickSignUpBtn() throws IOException {
		Action.jsClickBtn(signupLink);
		return new SignupPage();
	}
	
	
	
}
