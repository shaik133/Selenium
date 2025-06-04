/**
 * 
 */
package com.academy.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.academy.qa.action.Action;
import com.academy.qa.base.BasePage;

/**
 * @author Admin
 *
 */
public class AcademyHomePage extends BasePage{

	public AcademyHomePage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//nav[@class='main-menu']/div[2]/ul/li[7]/a")
	WebElement practiceBtn;
	
	
	public PracticePage clickPracticeBtn()
	{
		Action.explitWait(practiceBtn);
		Action.click(practiceBtn);
		return new PracticePage();
	}
}
