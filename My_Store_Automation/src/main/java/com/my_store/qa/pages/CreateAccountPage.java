/**
 * 
 */
package com.my_store.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.my_store.qa.actions.Action;
import com.my_store.qa.base.BasePage;

/**
 * @author Admin
 *
 */
public class CreateAccountPage extends BasePage{

	
	public CreateAccountPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//div[@id='noSlide']/h1[text()='Create an account']")
	WebElement visibletext;
	
	@FindBy(id="id_gender1")
	WebElement titleRadioBtn;
	
	@FindBy(id="customer_firstname")
	WebElement firstName;
	
	@FindBy(id="customer_lastname")
	WebElement lastName;
	
	@FindBy(id="passwd")
	WebElement pwd;
	
	@FindBy(id="days")
	WebElement daySelect;
	
	@FindBy(id="months")
	WebElement monthSelect;
	
	@FindBy(id="years")
	WebElement yearsSelect;
	
	@FindBy(id="firstname")
	WebElement fname;
	
	@FindBy(id="lastname")
	WebElement lname;
	
	@FindBy(id="company")
	WebElement company;
	
	@FindBy(id="address1")
	WebElement addrs1;
	
	@FindBy(id="address2")
	WebElement addrs2;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="id_state")
	WebElement stateSelect;
	
	@FindBy(id="postcode")
	WebElement zipcode;
	
	@FindBy(id="id_country")
	WebElement country;
	
	@FindBy(id="phone_mobile")
	WebElement phone;
	
	@FindBy(id="alias")
	WebElement assignAddrs;
	
	@FindBy(id="submitAccount")
	WebElement register;
	
	
	public String getTitle()
	{
		return Action.getTitle();
	}
	
	public void radioTitleClick()
	{
		Action.click(titleRadioBtn);
	}
	
	public AddressPage sendPersnlInfo(String fname1, String lname1, String pwd1,String Fname, String Lname, String companyy, String address1, String address2, String citi,
			String zip, String mob, String alias)
	{
		Action.explicitWait(visibletext);
		Action.sendkeys(firstName, fname1);
		Action.sendkeys(lastName, lname1);
		Action.sendkeys(pwd, pwd1);
		Action.selectByValue(daySelect, prop.getProperty("day"));
		Action.selectByValue(monthSelect, prop.getProperty("month"));
		Action.selectByValue(yearsSelect, prop.getProperty("year"));
		Action.sendkeys(fname, Fname);
		Action.sendkeys(lname, Lname);
		Action.sendkeys(company, companyy);
		Action.sendkeys(addrs1, address1);
		Action.sendkeys(addrs2, address2);
		Action.sendkeys(city, citi);
		Action.selectByValue(stateSelect, prop.getProperty("state"));
		Action.sendkeys(zipcode, zip);
		Action.selectByValue(country, prop.getProperty("country"));
		Action.sendkeys(phone, mob);
		Action.sendkeys(assignAddrs, alias);
		Action.click(register);
		return new AddressPage();
		
		
	}
	
	
//	public void DOB()
//	{
//		Action.explicitWait(visibletext);
//		Action.select(daySelect, prop.getProperty("day"));
//		Action.select(monthSelect, prop.getProperty("month"));
//		Action.select(yearsSelect, prop.getProperty("year"));
//	}
//	
//	
//	public void address(String Fname, String Lname, String companyy, String address1, String address2, String citi)
//	
//	{
//		Action.explicitWait(visibletext);
//		Action.sendkeys(fname, Fname);
//		Action.sendkeys(lname, Lname);
//		Action.sendkeys(company, companyy);
//		Action.sendkeys(addrs1, address1);
//		Action.sendkeys(addrs2, address2);
//		Action.sendkeys(city, citi);
//
//
//
//	}
//	
//	public void selectInfo()
//	{
//		
//		Action.select(stateSelect, prop.getProperty("state"));
//		Action.select(country, prop.getProperty("country"));
//	}
//	
//	
//	public void remAddr(String zip, String mob, String alias)
//	{
//		Action.sendkeys(zipcode, zip);
//		Action.sendkeys(phone, mob);
//		Action.sendkeys(assignAddrs, alias);
//	}		
	
	
	
	
	
	
	
	
}
