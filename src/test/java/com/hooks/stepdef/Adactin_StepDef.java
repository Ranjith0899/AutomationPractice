package com.hooks.stepdef;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.helper.POM_Adactin;
import com.runner.adactin.Adactin_Runner;
import com.utility.Utility_Files;

import io.cucumber.java.en.*;

public class Adactin_StepDef extends Utility_Files {
	public static WebDriver driver1 = Adactin_Runner.driver;
	public static POM_Adactin p = new POM_Adactin(driver1);
	public static Logger log = Logger.getLogger(Adactin_StepDef.class);

	 @Given("user Selects The Location {string} In scenario One")
	 public void user_selects_the_location_in_scenario_one(String location) {
		 Select loc = select(p.getSearch().getLocation());
			selectByText(loc,location);
	 }
	
	@When("user Selects The Hotel {string} In scenario One")
	public void user_selects_the_hotel_in_scenario_one(String hotel_) {
		Select hotel = select(p.getSearch().getHotels());
		selectByText(hotel,hotel_);
	}
	@When("user Selects The Room Type {string} In scenario One")
	public void user_selects_the_room_type_in_scenario_one(String type) {
		Select roomType = select(p.getSearch().getRoom_Type());
	    selectByText(roomType,type);
	}
	@When("user Selects The Number Of Rooms {string} In scenario One")
	public void user_selects_the_number_of_rooms_in_scenario_one(String no_Of_Rooms) {
		Select roomNum = select(p.getSearch().getRoom_Nos());
		selectByText(roomNum, no_Of_Rooms);
	}
	@When("user Enters Check In Date {string} In scenario One")
	public void user_enters_check_in_date_in_scenario_one(String dateIn_) {
		WebElement dateIn = p.getSearch().getDateIn_Txt();
		clear_(dateIn);
		send_Keys(dateIn,dateIn_ ); 
	}
	@When("user Enters Check Out Date {string} In scenario One")
	public void user_enters_check_out_date_in_scenario_one(String dateOut_) {
		WebElement dateOut =p.getSearch().getDateOut_Txt();
		clear_(dateOut);
		send_Keys(dateOut,dateOut_);
	}
	@When("user Enters Adults per Room {string} In scenario One")
	public void user_enters_adults_per_room_in_scenario_one(String adultPerRoom) {
		Select adultNum = select(p.getSearch().getAdult_Room());
	    selectByText(adultNum,adultPerRoom );
	}
	@When("user Children per Room {string} In scenario One")
	public void user_children_per_room_in_scenario_one(String childPerRoom) {
		Select childNum = select(p.getSearch().getChild_Room());
	    selectByText(childNum,childPerRoom );
	}
	@Then("user Clicks The Search Button And It Navigates To  {string} In scenario One")
	public void user_clicks_the_search_button_and_it_navigates_to_in_scenario_one(String string) throws InterruptedException {
		  click_(p.getSearch().getSubmit());
		  threadSleep(15000);
		Assert.assertEquals(string, get_Title());
	}


	@Given("user Selects The Location {string} In scenario Two")
	public void user_selects_the_location_in_scenario_two(String location) {
		Select loc = select(p.getSearch().getLocation());
		selectByText(loc,location);
	}
	@When("user Selects The Hotel {string} In scenario Two")
	public void user_selects_the_hotel_in_scenario_two(String hotel_) {
		Select hotel = select(p.getSearch().getHotels());
		selectByText(hotel,hotel_);
	}
	@When("user Selects The Room Type {string} In scenario Two")
	public void user_selects_the_room_type_in_scenario_two(String type) {
		Select roomType = select(p.getSearch().getRoom_Type());
	    selectByText(roomType,type);
	}
	@When("user Selects The Number Of Rooms {string} In scenario Two")
	public void user_selects_the_number_of_rooms_in_scenario_two(String no_Of_Rooms) {
		Select roomNum = select(p.getSearch().getRoom_Nos());
		selectByText(roomNum, no_Of_Rooms);
	}
	@When("user Enters Check In Date {string} In scenario Two")
	public void user_enters_check_in_date_in_scenario_two(String dateIn_) {
		WebElement dateIn = p.getSearch().getDateIn_Txt();
		clear_(dateIn);
		send_Keys(dateIn,dateIn_ ); 
	}
	@When("user Enters Check Out Date {string} In scenario Two")
	public void user_enters_check_out_date_in_scenario_two(String dateOut_) {
		WebElement dateOut =p.getSearch().getDateOut_Txt();
		clear_(dateOut);
		send_Keys(dateOut,dateOut_);
	}
	@When("user Enters Adults per Room {string} In scenario Two")
	public void user_enters_adults_per_room_in_scenario_two(String adultPerRoom) {
		Select adultNum = select(p.getSearch().getAdult_Room());
	    selectByText(adultNum,adultPerRoom );
	}
	@When("user Children per Room {string} In scenario Two")
	public void user_children_per_room_in_scenario_two(String childPerRoom) {
		Select childNum = select(p.getSearch().getChild_Room());
	    selectByText(childNum,childPerRoom );
	}
	
	@Given("user Clicks The Search Button And It Navigates To  {string} In scenario Two")
	public void user_clicks_the_search_button_and_it_navigates_to_in_scenario_two(String string) throws InterruptedException {
		  click_(p.getSearch().getSubmit());
		  threadSleep(15000);
		Assert.assertEquals(string, get_Title());
	}
	
	@When("user Selects The Location {string} In scenario Three")
	public void user_selects_the_location_in_scenario_three(String location) {
		Select loc = select(p.getSearch().getLocation());
		selectByText(loc,location);
	}
	@When("user Selects The Hotel {string} In scenario Three")
	public void user_selects_the_hotel_in_scenario_three(String hotel_) {
		Select hotel = select(p.getSearch().getHotels());
		selectByText(hotel,hotel_);
	}
	@When("user Selects The Room Type {string} In scenario Three")
	public void user_selects_the_room_type_in_scenario_three(String type) {
		Select roomType = select(p.getSearch().getRoom_Type());
	    selectByText(roomType,type);
	}
	@When("user Selects The Number Of Rooms {string} In scenario Three")
	public void user_selects_the_number_of_rooms_in_scenario_three(String no_Of_Rooms) {
		Select roomNum = select(p.getSearch().getRoom_Nos());
		selectByText(roomNum, no_Of_Rooms);
	}
	@When("user Enters Check In Date {string} In scenario Three")
	public void user_enters_check_in_date_in_scenario_three(String dateIn_) {
		WebElement dateIn = p.getSearch().getDateIn_Txt();
		clear_(dateIn);
		send_Keys(dateIn,dateIn_ ); 
	}
	@When("user Enters Check Out Date {string} In scenario Three")
	public void user_enters_check_out_date_in_scenario_three(String dateOut_) {
		WebElement dateOut =p.getSearch().getDateOut_Txt();
		clear_(dateOut);
		send_Keys(dateOut,dateOut_);
	}
	@When("user Enters Adults per Room {string} In scenario Three")
	public void user_enters_adults_per_room_in_scenario_three(String adultPerRoom) {
		Select adultNum = select(p.getSearch().getAdult_Room());
	    selectByText(adultNum,adultPerRoom );
	}
	@When("user Children per Room {string} In scenario Three")
	public void user_children_per_room_in_scenario_three(String childPerRoom) {
		Select childNum = select(p.getSearch().getChild_Room());
	    selectByText(childNum,childPerRoom );
	}
	@Given("user Clicks The Search Button And It Navigates To  {string} In scenario Three")
	public void user_clicks_the_search_button_and_it_navigates_to_in_scenario_three(String string) throws InterruptedException {
		  click_(p.getSearch().getSubmit());
		  threadSleep(15000);
		Assert.assertEquals(string, get_Title());
	}
	
	@When("user Selects The Location {string} In scenario Four")
	public void user_selects_the_location_in_scenario_four(String location) {
		Select loc = select(p.getSearch().getLocation());
		selectByText(loc,location);
	}
	@Given("user Selects The Hotel {string} In scenario Four")
	public void user_selects_the_hotel_in_scenario_four(String hotel_) {
		Select hotel = select(p.getSearch().getHotels());
		selectByText(hotel,hotel_);
	}
	@When("user Selects The Room Type {string} In scenario Four")
	public void user_selects_the_room_type_in_scenario_four(String type) {
		Select roomType = select(p.getSearch().getRoom_Type());
	    selectByText(roomType,type);
	}
	@When("user Selects The Number Of Rooms {string} In scenario Four")
	public void user_selects_the_number_of_rooms_in_scenario_four(String no_Of_Rooms) {
		Select roomNum = select(p.getSearch().getRoom_Nos());
		selectByText(roomNum, no_Of_Rooms);
	}
	@When("user Enters Check In Date {string} In scenario Four")
	public void user_enters_check_in_date_in_scenario_four(String dateIn_) {
		WebElement dateIn = p.getSearch().getDateIn_Txt();
		clear_(dateIn);
		send_Keys(dateIn,dateIn_ ); 
	}
	@When("user Enters Check Out Date {string} In scenario Four")
	public void user_enters_check_out_date_in_scenario_four(String dateOut_) {
		WebElement dateOut =p.getSearch().getDateOut_Txt();
		clear_(dateOut);
		send_Keys(dateOut,dateOut_);
	}
	@When("user Enters Adults per Room {string} In scenario Four")
	public void user_enters_adults_per_room_in_scenario_four(String adultPerRoom) {
		Select adultNum = select(p.getSearch().getAdult_Room());
	    selectByText(adultNum,adultPerRoom );
	}
	@When("user Children per Room {string} In scenario Four")
	public void user_children_per_room_in_scenario_four(String childPerRoom) {
		Select childNum = select(p.getSearch().getChild_Room());
	    selectByText(childNum,childPerRoom );
	}
	@Then("user Clicks The Search Button And It Navigates To  {string} In scenario Four")
	public void user_clicks_the_search_button_and_it_navigates_to_in_scenario_four(String string) throws InterruptedException {
		  click_(p.getSearch().getSubmit());
		  threadSleep(15000);
		Assert.assertEquals(string, get_Title());
	}



}