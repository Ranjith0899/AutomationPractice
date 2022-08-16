package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	public WebDriver driver;
	public Payment(WebDriver driver1) {
		this.driver = driver1;
	 PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//div[@id='center_column']")
	private WebElement payInfo;
	@FindBy(xpath ="//a[@class='bankwire']")
	private WebElement bank_But;
	@FindBy(xpath = "//p[@class='product-name']/a")
	private WebElement dressName;
	public WebElement getDressName() {
		return dressName;
	}
	public WebElement getPayInfo() {
		return payInfo;
	}
	public WebElement getBank_But() {
		return bank_But;
	}
}
