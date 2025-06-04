/**
 * 
 */
package com.my_store.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.my_store.base.BaseClass;

/**
 * @author Admin
 *
 */
public class Account_creationPage extends BaseClass{
//Personal Information
	@FindBy(id="id_gender1")
	WebElement Title;
	
	
	@FindBy(id="customer_firstname")
	WebElement FirstName;
	
	@FindBy(id = "customer_lastname")
	WebElement LastName;
	
	@FindBy(id="passwd")
	WebElement Password;
	
	@FindBy (id="newsletter")
	WebElement newsLetterSignup;
	
	@FindBy (id="optin")
	WebElement specialOffer;
	
//Address
	
	@FindBy (id="firstname")
	WebElement AddFirstName;
	
	@FindBy (id="lastname")
	WebElement AddLastName;
	
	@FindBy (id="company")
	WebElement company;
	
	@FindBy(id="address1")
	WebElement address;
	
	@FindBy(id="address2")
	WebElement address2;
	
	@FindBy(id="city")
	WebElement city;
	
	
	@FindBy(id="postcode")
	WebElement postalcode;
	
	@FindBy(id="other")
	WebElement additionalInfo;
	
	@FindBy(id="alias")
	WebElement addressAlias;
	
	@FindBy(id="submitAccount")
	WebElement RegisterButton;
	
	
	
	
}
