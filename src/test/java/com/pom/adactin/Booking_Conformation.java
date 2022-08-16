package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Conformation {
	public WebDriver driver;
	public Booking_Conformation(WebDriver driver1) {
		this.driver = driver1;
	 PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//input[@id='my_itinerary']")
	private WebElement myItinerary_But;
	public WebElement getMyItinerary_But() {
		return myItinerary_But;
	}

}
