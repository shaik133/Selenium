/**
 * 
 */
package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.basePackage.BasePage;

/**
 * @author Admin
 *
 */
public class crmLandingPage extends BasePage {

	public crmLandingPage() {
		PageFactory.initElements(driver, this);
	}
	
//CRM Logo	
	@FindBy(css="a[class='navbar-brand']")
	WebElement crmLogo;
	
@FindBy (xpath="//a[text()='Login']")
WebElement loginBtn;

@FindBy (xpath="//a[text()='Sign Up']")
WebElement signupBtn;


public boolean getLogo()
{
	return crmLogo.isDisplayed();
}
	
public String getPageTitle()
{
	return driver.getTitle();
}



public LoginPage clickLoginBtn()
{
	loginBtn.click();
	return new LoginPage();
}


public SignupPage clickSigupBtn()
{
	signupBtn.click();
	return new SignupPage();
}
}
