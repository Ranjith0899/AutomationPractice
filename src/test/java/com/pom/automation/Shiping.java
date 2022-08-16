package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shiping {
	public WebDriver driver;
	 public Shiping(WebDriver driver1) {
		this.driver = driver1;
	 PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//input[@id='cgv']")
	private WebElement agree_CB;
	@FindBy(xpath ="//button[@name='processCarrier']")
	private WebElement checkOut;
	public WebElement getAgree_CB() {
		return agree_CB;
	}
	public WebElement getCheckOut() {
		return checkOut;
	}

}
