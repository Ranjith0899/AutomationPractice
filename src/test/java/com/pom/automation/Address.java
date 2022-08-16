package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {
	public WebDriver driver;
	public Address(WebDriver driver1) {
		this.driver = driver1;
	 PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//div[@id='ordermsg']/textarea")
	private WebElement des_Text;
	@FindBy(xpath ="//button[@name='processAddress']/span")
	private WebElement checkOut;
	public WebElement getDes_Text() {
		return des_Text;
	}
	public WebElement getCheckOut() {
		return checkOut;
	}

}
