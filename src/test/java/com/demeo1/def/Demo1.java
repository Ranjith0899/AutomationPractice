package com.demeo1.def;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Demo1{


	@Given("user Enters  User Name {string} Of Account1")
	public void user_enters_user_name_of_account1(String id) {
		System.out.println(id);
	}
	@When("user Enters Password {string}  Of Account1")
	public void user_enters_password_of_account1(String pass) {
		System.out.println(pass);
	}
	@When("user Enters The Insta Feed  In Account1")
	public void user_enters_the_insta_feed_in_account1() {
		System.out.println("feed");
	}






	@When("user Enters The  User Name {string}  Of Account2")
	public void user_enters_the_user_name_of_account2(String id) {
		System.out.println(id);
	}
	@When("user Enters Password {string}  Of Account2")
	public void user_enters_password_0f_account2(String pass) {
		System.out.println(pass);
	}
	@When("user Enters The Insta Feed  In Account2")
	public void user_enters_the_insta_feed_in_account2() {
		System.out.println("feed");
	}


@Before
public void Insta () {
	System.out.println("insta");
	
}

@After
public void logout() {
	System.out.println("Logout");
}



	
}