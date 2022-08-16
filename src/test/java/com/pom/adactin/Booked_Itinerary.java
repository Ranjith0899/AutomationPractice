package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Itinerary {
	public WebDriver driver;
	public Booked_Itinerary(WebDriver driver1) {
		this.driver = driver1;
	 PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//a[.='Search Hotel']")
	private WebElement searchHotel_But;
	
	@FindBy(xpath ="//a[.='Logout']")
	private WebElement logout_But;
	public WebElement getSearchHotel_But() {
		return searchHotel_But;
	}

	public WebElement getLogout_But() {
		return logout_But;
	}
}
