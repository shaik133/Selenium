package com.cart.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.page.BasePage;

public class CountryPage extends BasePage{

	public CountryPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(css="div[class='wrapperTwo'] div select")
	WebElement ContryDropdown;
	
	public void selectDrpdown() {
		
	}
}
