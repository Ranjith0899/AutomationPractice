package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	public WebDriver driver;
	public Select_Hotel(WebDriver driver1) {
		this.driver = driver1;
	 PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//input[@type='radio']")
	private WebElement radio_But;
	@FindBy(xpath ="//input[@id='continue']")
	private WebElement continue_But;
	public WebElement getRadio_But() {
		return radio_But;
	}
	public WebElement getContinue_But() {
		return continue_But;
	}

}
