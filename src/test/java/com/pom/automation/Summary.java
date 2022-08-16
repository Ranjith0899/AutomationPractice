package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary {
	public WebDriver driver;
	public Summary(WebDriver driver1) {
		this.driver = driver1;
	 PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//p[@class='cart_navigation clearfix']/a/span")
	private WebElement checkOut;
	public WebElement getCheckOut() {
		return checkOut;
	}

}
