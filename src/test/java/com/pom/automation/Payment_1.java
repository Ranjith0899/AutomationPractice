package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_1 {
	public WebDriver driver;
	public Payment_1(WebDriver driver1) {
		this.driver = driver1;
	 PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//p[@id='cart_navigation']//button/span")
	private WebElement order_But;
	public WebElement getOrder_But() {
		return order_But;
	}

}
