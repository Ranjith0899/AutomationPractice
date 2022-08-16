package com.helper;
import org.openqa.selenium.WebDriver;

import com.pom.adactin.*;
public class POM_Adactin {
	public WebDriver driver;
	public POM_Adactin(WebDriver driver1) {
		this.driver = driver1;
	}
	private Login_Page login;
	
	private Search_Hotel search;
	private Select_Hotel select;
	private Book_A_Hotel book;
	private Booking_Conformation book_Con;
	private Booked_Itinerary booked;
	public Login_Page getLogin() {
		if (login==null) {
			login = new Login_Page(driver);
		}
		return login;
	}
	public Search_Hotel getSearch() {
		if (search==null) {
			search = new Search_Hotel(driver);
		}
		return search;
	}
	public Select_Hotel getSelect() {
		if (select==null) {
			select = new Select_Hotel(driver);
		}
		return select;
	}
	public Book_A_Hotel getBook() {
		if (book==null) {
			book = new Book_A_Hotel(driver);
		}
		return book;
		
	}
	public Booking_Conformation getBook_Con() {
		if (book_Con==null) {
			book_Con = new Booking_Conformation(driver);
		}
		return book_Con;
	}
	public Booked_Itinerary getBooked() {
		if (booked==null) {
			booked = new Booked_Itinerary(driver);
		}
		return booked;
	}
}
