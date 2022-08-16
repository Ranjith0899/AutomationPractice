package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	public WebDriver driver;
	public Search_Hotel(WebDriver driver1) {
		this.driver = driver1;
	 PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//select[@id='location']")
	private WebElement location;
	@FindBy(xpath ="//select[@id='hotels']")
	private WebElement hotels;
	@FindBy(xpath ="//select[@id='room_type']")
	private WebElement room_Type;
	@FindBy(xpath ="//select[@id='room_nos']")
	private WebElement room_Nos;
	@FindBy(xpath ="//select[@id='adult_room']")
	private WebElement adult_Room;
	@FindBy(xpath ="//select[@id='child_room']")
	private WebElement child_Room;
	@FindBy(xpath ="//input[@id='Submit']")
	private WebElement Submit;
	@FindBy(xpath ="//input[@id='datepick_in']")
	private WebElement dateIn_Txt;
	@FindBy(xpath ="//input[@id='datepick_out']")
	private WebElement dateOut_Txt;
	@FindBy(xpath ="//a[.='Booked Itinerary']")
	private WebElement booked_But;
	
	public WebElement getBooked_But() {
		return booked_But;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoom_Type() {
		return room_Type;
	}
	public WebElement getRoom_Nos() {
		return room_Nos;
	}
	public WebElement getAdult_Room() {
		return adult_Room;
	}
	public WebElement getChild_Room() {
		return child_Room;
	}
	public WebElement getSubmit() {
		return Submit;
	}
	public WebElement getDateIn_Txt() {
		return dateIn_Txt;
	}
	public WebElement getDateOut_Txt() {
		return dateOut_Txt;
	}

}
