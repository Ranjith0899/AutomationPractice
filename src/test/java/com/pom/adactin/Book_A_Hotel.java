package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_A_Hotel {
	public WebDriver driver;
	public Book_A_Hotel(WebDriver driver1) {
		this.driver = driver1;
	 PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//input[@id='first_name']")
	private WebElement firstName_Txt;
	@FindBy(xpath ="//input[@id='last_name']")
	private WebElement lastName_Txt;
	@FindBy(xpath ="//textarea[@id='address']")
	private WebElement address_TxtArea;
	@FindBy(xpath ="//input[@id='cc_num']")
	private WebElement ccNum_Txt;
	@FindBy(xpath ="//input[@id='cc_cvv']")
	private WebElement ccCVV_Txt;
	@FindBy(xpath ="//select[@id='cc_type']")
	private WebElement cc_drop;
	@FindBy(xpath ="//select[@id='cc_exp_month']")
	private WebElement expMonth_drop;
	@FindBy(xpath ="//select[@id='cc_exp_year']")
	private WebElement expYear_drop;
	@FindBy(xpath ="//input[@id='book_now']")
	private WebElement bookNow_But;
	public WebElement getFirstName_Txt() {
		return firstName_Txt;
	}
	public WebElement getLastName_Txt() {
		return lastName_Txt;
	}
	public WebElement getAddress_TxtArea() {
		return address_TxtArea;
	}
	public WebElement getCcNum_Txt() {
		return ccNum_Txt;
	}
	public WebElement getCcCVV_Txt() {
		return ccCVV_Txt;
	}
	public WebElement getCc_drop() {
		return cc_drop;
	}
	public WebElement getExpMonth_drop() {
		return expMonth_drop;
	}
	public WebElement getExpYear_drop() {
		return expYear_drop;
	}
	public WebElement getBookNow_But() {
		return bookNow_But;
	}
	

	
}
