package com.cart.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.actions.Action;
import com.crm.base.page.BasePage;

public class CartPage extends BasePage {

	public CartPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(css="table[id='productCartTables'] thead tr:nth-child(1) td b")
	List<WebElement> tableHeaders;
	
	@FindBy(css="\"table[id='productCartTables'] tbody tr td:nth-child(\"+index+\") p\"")
	List<WebElement> tableData;
	
	@FindBy(xpath="//button[text()='Place Order']")
	WebElement placeOrderBtn;
	
	public ArrayList<String> getProducts(String headerName) {
		return Action.iterateCartProducts(tableHeaders,headerName);
	}
	
	public CountryPage clickOrderBtn() throws IOException {
		Action.jsClickBtn(placeOrderBtn);
		return new CountryPage();
	}
	
}
