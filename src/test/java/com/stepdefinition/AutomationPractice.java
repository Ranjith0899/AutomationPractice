package com.stepdefinition;
import io.cucumber.java.en.*;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.helper.POM_Automation;
import com.runner.automation.*;
import com.utility.Utility_Files;

import io.cucumber.java.en.*;
public class AutomationPractice extends Utility_Files{
	public static WebDriver driver1 = AutomationPractice.driver;
	public static POM_Automation p = new POM_Automation(driver1);
	public static Actions a = Utility_Files.actions();
	
	@Given("user Launches The Url")
	public void user_launches_the_url() {
		getUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}
	@When("user Enters Their EmailId")
	public void user_enters_their_email_id() {
		send_Keys(p.getSignUp().getEmailIn(),"97867645345kfr@gmail.com");
	}
	@When("user Enters Their Password")
	public void user_enters_their_password() {
		  send_Keys(p.getSignUp().getPassIn(), "fghyte123@");
	}
	@When("user Clicks The Login Button")
	public void user_clicks_the_login_button() {
		 click_(p.getSignUp().getSignInBut());
	}
	@When("user Mouseover On The Dresses")
	public void user_mouseover_on_the_dresses() {
		moveToEle(a,p.getMyAcc().getDresses() );
	}
	@Then("user Clicks On Evening Dresses And It Navigates To {string}")
	public void user_clicks_on_evening_dresses_and_it_navigates_to(String string) throws InterruptedException {
		click_(p.getMyAcc().getEveningDresses());
		threadSleep(20000);
		Assert.assertEquals(string, get_Title());
	}
	@Then("user Clicks Size  L Checkbox")
	public void user_clicks_size_l_checkbox() {
		click_(p.getEvgDress().getSize_L_CB());
	}
	@Then("user Clicks Color  Begie Checkbox")
	public void user_clicks_color_begie_checkbox() {
		click_(p.getEvgDress().getColor_Begie_CB());	
	}
	@Then("user Clicks Compositions Viscose Checkbox")
	public void user_clicks_compositions_viscose_checkbox() {
		click_(p.getEvgDress().getComp_CB());
		
	}
	@Then("user Clicks Condition New Checkbox")
	public void user_clicks_condition_new_checkbox() {
		click_(p.getEvgDress().getCond_CB());
	}
	@Then("user Clicks Properties Short Dress Checkbox")
	public void user_clicks_properties_short_dress_checkbox() {
		click_(p.getEvgDress().getProperties_CB());
	}
	@Then("user Clicks Avalilability In Stock Checkbox")
	public void user_clicks_avalilability_in_stock_checkbox() {
		click_(p.getEvgDress().getAvail_CB());
	}
	@Then("user Clicks Manufacturer Fashion Manufacturer Checkbox")
	public void user_clicks_manufacturer_fashion_manufacturer_checkbox() {
		click_(p.getEvgDress().getManu_CB());
	}
	@Then("user Mouseover the Printed Dress Image")
	public void user_mouseover_the_printed_dress_image() {
		  moveToEle(a,p.getEvgDress().getImg() );
	}
	@Then("user Clicks On Quick View")
	public void user_clicks_on_quick_view() {
		click_(p.getEvgDress().getQuickView());
	}
	@Then("user Clicks On Quantity + Button")
	public void user_clicks_on_quantity_button() throws InterruptedException {
		threadSleep(60000);
		switchToFrameByEle(p.getEvgDress().getFrame().get(0));
	    threadSleep(30000);
	    click_(p.getAddTo().getQtyPlus_But());
	}
	@Then("user Clicks On Add To Cart")
	public void user_clicks_on_add_to_cart() throws InterruptedException {
		 click_(p.getAddTo().getAddToCart_But());
			switch_ToDefaultContent();
			threadSleep(30000);
	}
	@Then("user Clicks on Proceeds To Checkout Button And It Navigates To {string}")
	public void user_clicks_on_proceeds_to_checkout_button_and_it_navigates_to(String string) throws InterruptedException {
		click_(p.getAddTo().getCheckout_But());
		threadSleep(20000);
		Assert.assertEquals(string, get_Title());
	}
	@Then("in Summary User clicks on ProceedToCheckout")
	public void in_summary_user_clicks_on_proceed_to_checkout() {
		click_(p.getSumm().getCheckOut());
	}
	@Then("in Address User Enters {string} In Add Comment Text Box")
	public void in_address_user_enters_in_add_comment_text_box(String string) {
		send_Keys(p.getAdd().getDes_Text(),string);	
	}
	@Then("in Address User clicks on ProceedToCheckout")
	public void in_address_user_clicks_on_proceed_to_checkout() {
		click_(p.getAdd().getCheckOut());	
	}
	@Then("in Shiping User Clicks On Terms Of Service Checkbox")
	public void in_shiping_user_clicks_on_terms_of_service_checkbox() {
		click_(p.getShip().getAgree_CB());
	}
	@Then("in Shiping User clicks on ProceedToCheckout And It Navigates To {string}")
	public void in_shiping_user_clicks_on_proceed_to_checkout_and_it_navigates_to(String string) throws InterruptedException {
		click_(p.getShip().getCheckOut());
		threadSleep(20000);
		Assert.assertEquals(string, get_CurrentUrl());
	}
	@Then("user clicks On Pay by bank wire")
	public void user_clicks_on_pay_by_bank_wire() {
		click_(p.getPay1().getBank_But());
	}
	@Then("user clicks On I Confrim My Order Button And It Navigates To {string}")
	public void user_clicks_on_i_confrim_my_order_button_and_it_navigates_to(String string) throws InterruptedException {
		click_(p.getPay2().getOrder_But());
		threadSleep(20000);
		Assert.assertEquals(string, get_Title());
	}
	@Then("user Clicks The Logout Button And It Navigates To {string}")
	public void user_clicks_the_logout_button_and_it_navigates_to(String string) throws InterruptedException {
		click_(p.getOrder().getLogOut_But());
		threadSleep(20000);
		Assert.assertEquals(string, get_Title());
	}
	
	@When("user Mouseover The Dresses")
	public void user_mouseover_the_dresses() {moveToEle(a,p.getMyAcc().getDresses() );
	}
	@Then("user Clicks On Summer Dresses And It Navigates To {string}")
	public void user_clicks_on_summer_dresses_and_it_navigates_to(String string) throws InterruptedException {
		click_(p.getMyAcc().getSummerDresses());
		threadSleep(20000);
		Assert.assertEquals(string, get_Title());
	}
	@Then("user Clicks The Size  L Checkbox")
	public void user_clicks_the_size_l_checkbox() {
		click_(p.getSummer().getSize_L());
	}
	@Then("user Clicks The Color  Yellow Checkbox")
	public void user_clicks_the_color_yellow_checkbox() {
		click_(p.getSummer().getColour_Y());
	}
	@Then("user Clicks The Compositions Viscose Checkbox")
	public void user_clicks_the_compositions_viscose_checkbox() {
		click_(p.getSummer().getCompo_p());
		}
	@Then("user Clicks The Condition New Checkbox")
	public void user_clicks_the_condition_new_checkbox() {
		click_(p.getSummer().getCondition());
		}
	@Then("user Clicks The Properties Short Dress Checkbox")
	public void user_clicks_the_properties_short_dress_checkbox() {
		click_(p.getSummer().getType_Short());
	}
	@Then("user Clicks The Avalilability In Stock Checkbox")
	public void user_clicks_the_avalilability_in_stock_checkbox() {
		click_(p.getSummer().getAvilablity());
	}
	@Then("user Clicks The Manufacturer Fashion Manufacturer Checkbox")
	public void user_clicks_the_manufacturer_fashion_manufacturer_checkbox() {
		click_(p.getSummer().getManu());
		}
	@Then("user Mouseover to Printed Summer Dress Image")
	public void user_mouseover_to_printed_summer_dress_image() {
		moveToEle(a,p.getSummer().getImg() );
	}
	@Then("user Clicks Quick View Button")
	public void user_clicks_quick_view_button() {
		click_(p.getSummer().getQuickView());
	}
	@Then("user Clicks The Quantity + Button")
	public void user_clicks_the_quantity_button() throws InterruptedException {
		threadSleep(60000);
		switchToFrameByEle(p.getEvgDress().getFrame().get(0));
	    threadSleep(30000);
	    click_(p.getAddTo().getQtyPlus_But());
	}
	@Then("user Clicks The Add To Cart Button")
	public void user_clicks_the_add_to_cart_button() throws InterruptedException {
		click_(p.getAddTo().getAddToCart_But());
		switch_ToDefaultContent();
		threadSleep(30000);
	}
	@Then("user Clicks The Proceeds To Checkout Button And It Navigates To {string}")
	public void user_clicks_the_proceeds_to_checkout_button_and_it_navigates_to(String string) throws InterruptedException {
		click_(p.getAddTo().getCheckout_But());
		threadSleep(20000);
		Assert.assertEquals(string, get_Title());
	}
	@Then("in Summary User clicks The ProceedToCheckout")
	public void in_summary_user_clicks_the_proceed_to_checkout() {
		click_(p.getSumm().getCheckOut());
	}
	@Then("in Address User Enters {string} In  The Add Comment Text Box")
	public void in_address_user_enters_in_the_add_comment_text_box(String string) {
		send_Keys(p.getAdd().getDes_Text(),string);
	}
	@Then("in Address User clicks The ProceedToCheckout")
	public void in_address_user_clicks_the_proceed_to_checkout() {
		click_(p.getAdd().getCheckOut());
	}
	@Then("in Shiping User Clicks The Terms Of Service Checkbox")
	public void in_shiping_user_clicks_the_terms_of_service_checkbox() {
		click_(p.getShip().getAgree_CB());
	}
	@Then("in Shiping User clicks The ProceedToCheckout And It Navigates To {string}")
	public void in_shiping_user_clicks_the_proceed_to_checkout_and_it_navigates_to(String string) throws InterruptedException {
		click_(p.getShip().getCheckOut());
		threadSleep(20000);
		Assert.assertEquals(string, get_CurrentUrl());
	}
	@Then("user clicks The Pay by bank wire")
	public void user_clicks_the_pay_by_bank_wire() {
		click_(p.getPay1().getBank_But());
	}
	@Then("user clicks The I Confrim My Order Button And It Navigates To {string}")
	public void user_clicks_the_i_confrim_my_order_button_and_it_navigates_to(String string) throws InterruptedException {
		click_(p.getPay2().getOrder_But());
		threadSleep(20000);
		Assert.assertEquals(string, get_Title());
	}
	@Then("user Clicks on The Logout Button And It Navigates To {string}")
	public void user_clicks_on_the_logout_button_and_it_navigates_to(String string) throws InterruptedException {
		click_(p.getOrder().getLogOut_But());
		threadSleep(20000);
		Assert.assertEquals(string, get_Title());
	}


}

