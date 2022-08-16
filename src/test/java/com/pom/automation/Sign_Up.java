 package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_Up {
	public WebDriver driver;
	public Sign_Up(WebDriver driver1) {
		this.driver = driver1;
	 PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailIn;
	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement passIn;
	@FindBy(xpath = "//button[@id='SubmitLogin']/span")
	private WebElement signInBut;
	public WebElement getEmailIn() {
		return emailIn;
	}
	public WebElement getPassIn() {
		return passIn;
	}
	public WebElement getSignInBut() {
		return signInBut;
	}
	
	

}
