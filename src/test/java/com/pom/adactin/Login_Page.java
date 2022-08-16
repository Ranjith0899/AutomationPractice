package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public WebDriver driver;
	public Login_Page(WebDriver driver1) {
		this.driver = driver1;
	 PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//input[@type='text']")
	private WebElement id;
	@FindBy(xpath ="//input[@type='password']")
	private WebElement pass;
	@FindBy(xpath ="//input[@type='Submit']")
	private WebElement login_But;
	public WebElement getId() {
		return id;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLogin_But() {
		return login_But;
	}
	
}
