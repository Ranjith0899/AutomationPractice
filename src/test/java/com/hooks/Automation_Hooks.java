package com.hooks;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.helper.POM_Automation;
import com.stepdefinition.AutomationPractice;
import com.utility.Utility_Files;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
public class Automation_Hooks extends Utility_Files{
	public static WebDriver driver1 = AutomationPractice.driver;
	public static POM_Automation p = new POM_Automation(driver1);
	@Before(order = 0)
	public void user_launches_the_url() {
		getUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}
	@Before(order = 1)
	public void user_enters_their_email_id() {
		send_Keys(p.getSignUp().getEmailIn(),"97867645345kfr@gmail.com");
	}
	@Before(order = 2)
	public void user_enters_their_password() {
		  send_Keys(p.getSignUp().getPassIn(), "fghyte123@");
	}
	@Before(order =3)
	public void user_clicks_the_login_button() {
		 click_(p.getSignUp().getSignInBut());
	}
	@After(order = 3)
	public void user_clicks_the_quantity_button() throws InterruptedException {
		threadSleep(60000);
		switchToFrameByEle(p.getEvgDress().getFrame().get(0));
	    threadSleep(30000);
	    click_(p.getAddTo().getQtyPlus_But());
	}
	@After(order = 4)
	public void user_clicks_the_add_to_cart_button() throws InterruptedException {
		click_(p.getAddTo().getAddToCart_But());
		switch_ToDefaultContent();
		threadSleep(30000);
	}
	@After(order = 5)
	public void user_clicks_the_proceeds_to_checkout_button_and_it_navigates_to() throws InterruptedException {
		click_(p.getAddTo().getCheckout_But());
		threadSleep(20000);
		Assert.assertEquals("", get_Title());
	}
	@After(order = 6)
	public void in_summary_user_clicks_the_proceed_to_checkout() {
		click_(p.getSumm().getCheckOut());
	}
	@After(order = 7)
	public void in_address_user_enters_in_the_add_comment_text_box() {
		send_Keys(p.getAdd().getDes_Text(),"");
	}
	@After(order = 8)
	public void in_address_user_clicks_the_proceed_to_checkout() {
		click_(p.getAdd().getCheckOut());
	}
	@After(order = 9)
	public void in_shiping_user_clicks_the_terms_of_service_checkbox() {
		click_(p.getShip().getAgree_CB());
	}
	@After(order = 10)
	public void in_shiping_user_clicks_the_proceed_to_checkout_and_it_navigates_to() throws InterruptedException {
		click_(p.getShip().getCheckOut());
		threadSleep(20000);
		Assert.assertEquals("", get_CurrentUrl());
	}
	@After(order = 11)
	public void user_clicks_the_pay_by_bank_wire() {
		click_(p.getPay1().getBank_But());
	}
	@After(order = 12)
	public void user_clicks_the_i_confrim_my_order_button_and_it_navigates_to() throws InterruptedException {
		click_(p.getPay2().getOrder_But());
		threadSleep(20000);
		Assert.assertEquals("", get_Title());
	}
	@After(order = 13)
	public void user_clicks_on_the_logout_button_and_it_navigates_to() throws InterruptedException {
		click_(p.getOrder().getLogOut_But());
		threadSleep(20000);
		Assert.assertEquals("", get_Title());
	}
	

}