package com.crm.pagemodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.page.BasePage;
import com.rsa.qa.actiondriver.Action;

public class SignupPage extends BasePage {

	
	public SignupPage() throws IOException {
	super();	
	PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css="a[class='_2KpZ6l _2HKlqd _3NgS1a']")
	WebElement loginlink;
	
	
	public void clickLoginLink() {
		Action.click(loginlink);
	}
}
