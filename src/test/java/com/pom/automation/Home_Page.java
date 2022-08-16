package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	public WebDriver driver;
	public Home_Page(WebDriver driver1) {
		this.driver= driver1;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath = "//a[@class='login']")
 private WebElement logInBut;
public WebElement getLogInBut() {
	return logInBut;
}
}
