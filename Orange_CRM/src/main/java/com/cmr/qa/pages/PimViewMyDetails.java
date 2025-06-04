/**
 * 
 */
package com.cmr.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cmr.qa.action.Actions;
import com.cmr.qa.base.BasePage;

/**
 * @author Admin
 *
 */
public class PimViewMyDetails extends BasePage {

	PimViewMyDetails() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[text()='Nickname']/parent::div/following-sibling::div/input")
	WebElement nickname;

	@FindBy(xpath = "//label[text()='Other Id']/parent::div/following-sibling::div/input")
	WebElement otherId;

	@FindBy(xpath = "//label[text()=\"Driver's License Number\"]/parent::div/following-sibling::div/input")
	WebElement licenseNumber;

	@FindBy(xpath = "//label[text()='License Expiry Date']/parent::div/following-sibling::div/div/div/i")
	WebElement lisenceDateForm;

	@FindBy(css = "div[class='oxd-calendar-selector-month-selected']")
	WebElement clickMonthDropdown;

	@FindBy(xpath = "//li[text()='February']")
	WebElement selectMonth;

	@FindBy(css = " li[class='oxd-calendar-selector-year']")
	WebElement clickYearDropdown;

	@FindBy(xpath = "//li[text()='2021']")
	WebElement selectYear;

	@FindBy(xpath = "//div[text()='5']")
	WebElement selectDate;

	@FindBy(xpath = "//label[text()='SSN Number']/parent::div/following-sibling::div/input")
	WebElement ssnNumber;

	@FindBy(xpath = "//label[text()='SIN Number']/parent::div/following-sibling::div/input")
	WebElement sinNumber;

	@FindBy(xpath = "//label[text()='Nationality']/parent::div/following-sibling::div/div/div")
	WebElement natinalityDropdown;

	@FindBy(xpath = "//label[text()='Nationality']/parent::div/following-sibling::div/div/div//span[text()='Australian']")
	WebElement selectNatinality;

	@FindBy(xpath = "//label[text()='Marital Status']/parent::div/following-sibling::div/div/div")
	WebElement maritalStatusDropdown;

	@FindBy(xpath = "//span[text()='Single']")
	WebElement selectMaritalStatus;

	@FindBy(xpath = "//label[text()='Date of Birth']/parent::div/following-sibling::div/div/div/input")
	WebElement clickDobDropdown;

	@FindBy(css = "div[class='oxd-calendar-selector-month-selected']")
	WebElement dobMonthClick;

	@FindBy(xpath = "//li[text()='February']")
	WebElement dobSelectMonth;

	@FindBy(xpath = "//div[@class='oxd-calendar-selector-year-selected']")
	WebElement dobYeardropdownClick;

	@FindBy(xpath = "//li[text()='1994']")
	WebElement selectDobYear;

	@FindBy(xpath = "//div[text()='5']")
	WebElement selectDobDate;

	@FindBy(xpath = "//label[text()='Male']/span")
	WebElement maleRadioBtn;

	@FindBy(xpath = "//label[text()='Military Service']/parent::div/following-sibling::div/input")
	WebElement selectMilitaryService;
	
	@FindBy(xpath="//label[text()='Smoker']/parent::div/following-sibling::div/div/label/input[@type='checkbox']")
	WebElement selectCheckBox;
	
	@FindBy(xpath="//label[text()='Blood Type']/parent::div/following-sibling::div/div/div")
	WebElement bloodTypeDD;
	
	@FindBy(xpath="//label[text()='Blood Type']/parent::div/following-sibling::div/div/div//span[text()='B+']")
	WebElement selectBloodtype;
	
	@FindBy(css="div[class='oxd-form-actions'] button:nth-child(1)")
	WebElement saveBtn;
	
	
	
	
	public void typeNickName()
	{
		 Actions.sendRandomKeys(nickname, Actions.getRandomString(6));
	}
	
	
	public void enterOtherId()
	{
		 Actions.sendRandomKeys(otherId, Actions.getRandomString(5));
	}
	
	
	public void enterLicenseNumber()
	{
		Actions.sendRandomKeys(licenseNumber, Actions.getRandomString(8));
	}
	
	public void selectLicenseExpDate() throws InterruptedException
	{
		Thread.sleep(3000);
		Actions.click(lisenceDateForm);
		Actions.click(clickMonthDropdown);
		Actions.click(selectMonth);
		Actions.click(clickYearDropdown);
		Actions.click(selectYear);
		Actions.click(selectDate);
	}
	
	
	public void enterSSNNumber()
	{
		Actions.sendRandomKeys(ssnNumber, Actions.getRandomString(5));
	}
	
	
	public void enterSINNumber()
	{
		Actions.sendRandomKeys(sinNumber, Actions.getRandomString(6));
	}
	
	
	
	public void selectNationality() throws InterruptedException
	{
		Thread.sleep(3000);
		Actions.click(natinalityDropdown);
		Actions.click(selectNatinality);
	}
	
	public void selectMaritalStatus() throws InterruptedException
	{
		Thread.sleep(3000);
		Actions.click(maritalStatusDropdown);
		Actions.click(selectMaritalStatus);
	}
	
	
	public void selectDateOfBirth() throws InterruptedException
	{
		Thread.sleep(3000);
		Actions.click(clickDobDropdown);
		Actions.click(clickMonthDropdown);
		Actions.click(dobSelectMonth);
		Actions.click(clickYearDropdown);
		Actions.click(selectDobYear);
		Actions.click(selectDobDate);
	}
	
	
	public void selectGender() throws InterruptedException
	{
		Thread.sleep(3000);
		Actions.click(maleRadioBtn);
	}
	
	public void enterMilitaryService()
	{
		Actions.sendRandomKeys(selectMilitaryService, Actions.getRandomString(6));
	}
	
	
	public void tickSmoker() throws InterruptedException
	{
		Thread.sleep(3000);
		Actions.click(selectCheckBox);
	}
	
	
	public void selctBloodGroup()
	{
		Actions.click(bloodTypeDD);
		Actions.click(selectBloodtype);
	}
	
	
	public void submitBtn()
	{
		Actions.click(saveBtn);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
