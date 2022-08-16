package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderConfirmation {
	public WebDriver driver;
	public orderConfirmation(WebDriver driver1) {
		this.driver = driver1;
	 PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//div[@id='center_column']//div")
	private WebElement order_det;
	@FindBy(xpath = "//a[@title='Log me out']")
	private WebElement logOut_But;
	@FindBy(xpath = "//span[@class='price']/strong")
	private WebElement price;
	
	public WebElement getPrice() {
		return price;
	}
	public WebElement getOrder_det() {
		return order_det;
	}
	public WebElement getLogOut_But() {
		return logOut_But;
	}

}
