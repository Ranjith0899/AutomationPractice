package com.stepdef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.helper.POM_Adactin;
import com.runner.adactin.Adactin_Runner;
import com.utility.Utility_Files;

import io.cucumber.java.en.*;

public class Adactin extends Utility_Files {
	public static WebDriver driver = Adactin_Runner.driver; 
	public static POM_Adactin p = new POM_Adactin(driver);
	@Given("user Launch The Application")
	public void user_launch_the_application() {
		getUrl("https://adactinhotelapp.com");
	}
	
	@When("user Enters The Username")
	public void user_enters_the_username() {
		send_Keys(p.getLogin().getId(),"ranjith55");
	}
	@When("user Enters The Password")
	public void user_enters_the_password() {
		send_Keys(p.getLogin().getPass(),"554499");
	}
	@Then("user Clicks The Login Button And It Navigates To {string}")
	public void user_clicks_the_login_button_and_it_navigates_to(String string) throws InterruptedException {
		click_(p.getLogin().getLogin_But());
		threadSleep(15000);
		Assert.assertEquals(string, get_Title());
	}

	@When("user Selects The Location {string}")
	public void user_selects_the_location(String location) {
		Select loc = select(p.getSearch().getLocation());
		selectByText(loc,location);
	}
	@When("user Selects The Hotel {string}")
	public void user_selects_the_hotel(String hotel_) {
		Select hotel = select(p.getSearch().getHotels());
		selectByText(hotel,hotel_);
	}
	@When("user Selects The Room Type {string}")
	public void user_selects_the_room_type(String type) {
		Select roomType = select(p.getSearch().getRoom_Type());
	    selectByText(roomType,type);
		
	}
	@When("user Selects The Number Of Rooms {string}")
	public void user_selects_the_number_of_rooms(String no_Of_Rooms) {
		Select roomNum = select(p.getSearch().getRoom_Nos());
		selectByText(roomNum, no_Of_Rooms);
	}
	@When("user Enters Check In Date {string}")
	public void user_enters_check_in_date(String dateIn_) {
		WebElement dateIn = p.getSearch().getDateIn_Txt();
		clear_(dateIn);
		send_Keys(dateIn,dateIn_ );  
	}
	@When("user Enters Check Out Date {string}")
	public void user_enters_check_out_date(String dateOut_) {
		WebElement dateOut =p.getSearch().getDateOut_Txt();
		clear_(dateOut);
		
		send_Keys(dateOut,dateOut_);
	}
	@When("user Enters Adults per Room {string}")
	public void user_enters_adults_per_room(String adultPerRoom) {
		Select adultNum = select(p.getSearch().getAdult_Room());
	    selectByText(adultNum,adultPerRoom );
	}
	@When("user Children per Room {string}")
	public void user_children_per_room(String childPerRoom) {
		Select childNum = select(p.getSearch().getChild_Room());
	    selectByText(childNum,childPerRoom );
	}
	@Then("user Clicks The Search Button And It Navigates To  {string}")
	public void user_clicks_the_search_button_and_it_navigates_to(String string) throws InterruptedException {
	    click_(p.getSearch().getSubmit());
		threadSleep(15000);
		Assert.assertEquals(string, get_Title());
	}

	@When("user Click On Radio Button Of The Hotel They Want To Book")
	public void user_click_on_radio_button_of_the_hotel_they_want_to_book() {
	    click_(p.getSelect().getRadio_But());
  
	}
	@Then("user Clicks The Continue Button And It Navigates To  {string}")
	public void user_clicks_the_continue_button_and_it_navigates_to(String string) throws InterruptedException {
	    click_(p.getSelect().getContinue_But());
		threadSleep(15000);
		Assert.assertEquals(string, get_Title());
	}

	@When("user Enters Their First Name {string}")
	public void user_enters_their_first_name(String name) {
		send_Keys(p.getBook().getFirstName_Txt(),name);
	    
	}
	@When("user Enters Their Last Name {string}")
	public void user_enters_their_last_name(String last) {
		send_Keys(p.getBook().getLastName_Txt(),last);
	     
	}
	@When("user Enters The Billing Address {string}")
	public void user_enters_the_billing_address(String add) {
		send_Keys(p.getBook().getAddress_TxtArea(),add);
	 
	}
	@When("user Enters Their Cerdit Card No {string}")
	public void user_enters_their_cerdit_card_no(String num) {
		 send_Keys(p.getBook().getCcNum_Txt(),num);
	}
	@When("user Enters Their Cerdit Card Type {string}")
	public void user_enters_their_cerdit_card_type(String cardType) {
		Select card = select(p.getBook().getCc_drop() );
	    selectByText(card,cardType);
	}
	@When("user Select Their Cerdit Expriy Month {string}")
	public void user_select_their_cerdit_expriy_month(String mon) {
		 
		    Select month = select(p.getBook().getExpMonth_drop());
		    selectByText(month, mon);
	}
	@When("user Select Their Cerdit Expriy Year {string}")
	public void user_select_their_cerdit_expriy_year(String year_) {
		    Select year = select(p.getBook().getExpYear_drop());
		    selectByText(year,year_);
	}
	@When("user Enters Their CCV Number {string}")
	public void user_enters_their_ccv_number(String ccv) {
		 send_Keys(p.getBook().getCcCVV_Txt(),ccv);
	}
	@Then("user Clicks The Book Now Button And It Navigates To {string}")
	public void user_clicks_the_book_now_button_and_it_navigates_to(String string) throws InterruptedException {
		click_(p.getBook().getBookNow_But());
		threadSleep(15000);
		Assert.assertEquals(string, get_Title());
	}


	@Then("user Clicks My Itinerary Button And It Navigates to  {string}")
	public void user_clicks_my_itinerary_button_and_it_navigates_to(String string) throws InterruptedException {
		click_(p.getBook_Con().getMyItinerary_But());
		threadSleep(15000);
		Assert.assertEquals(string, get_Title());  
	}


	@Then("user Clicks Logout Button And It Navigates to  {string}")
	public void user_clicks_logout_button_and_it_navigates_to(String string) {
		click_(p.getBooked().getLogout_But());
		
	}





	
	
	
 	
}