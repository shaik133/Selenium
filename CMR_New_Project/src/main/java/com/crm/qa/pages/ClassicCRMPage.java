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
public class ClassicCRMPage extends BasePage{

	public ClassicCRMPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(name="username")
	WebElement EnterUsername;
	
	
	@FindBy(name="password")
	WebElement EnterPaswd;
	
	@FindBy(css="input[type='submit']")
	WebElement submitBtn;
	
	@FindBy(css="img[class='img-responsive']")
	WebElement CRMLogo;
	
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean getLogo()
	{
		return  CRMLogo.isDisplayed();
	}
	
	public crmLandingPage login(String uname, String pwd)
	{
		EnterUsername.sendKeys(uname);
		EnterPaswd.sendKeys(pwd);
		submitBtn.click();
		return new crmLandingPage();
	}
	
	
	
	
	
	
	
	
}
