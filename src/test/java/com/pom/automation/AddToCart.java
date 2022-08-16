package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	public WebDriver driver;
public AddToCart(WebDriver driver1) {
	this.driver = driver1;
 PageFactory.initElements(driver, this);
}
@FindBy(xpath ="//i[@class='icon-plus']//parent::span")
private WebElement qtyPlus_But;
@FindBy(xpath ="//p[@id='add_to_cart']/button/span")
private WebElement addToCart_But;
@FindBy(xpath ="//a[@title='Proceed to checkout']/span")
private WebElement checkout_But;
public WebElement getQtyPlus_But() {
	return qtyPlus_But;
}
public WebElement getAddToCart_But() {
	return addToCart_But;
}
public WebElement getCheckout_But() {
	return checkout_But;
}

}
