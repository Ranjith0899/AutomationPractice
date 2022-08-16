package com.demo.def;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import io.cucumber.messages.internal.com.fasterxml.jackson.annotation.JacksonInject.Value;

public class Demo{
	@Before(order = -2,value =("@Google or @Bing") )
	public void google() {
      System.out.println("Launching Google URl");
	}
	@Before(order = -1)
	public void bing() {
      System.out.println("Launching Bing URl");
	}
	@Given("user Launchesh Google")
	public void user_launchesh_google() {
		System.out.println("Google");
	}

	@When("user Search Something")
	public void user_search_something() {
	    System.out.println("Search in Google");
	}
	@When("user Downloads it")
	public void user_downloads_it() {
		  System.out.println("Downloaded");
	}


	@When("user Launchesh the Bing")
	public void user_launchesh_the_bing() {
		System.out.println("Bing");
	}


	@When("user Searches Something")
	public void user_searches_something() {
		 System.out.println("Search in Bing");
	}
	@When("user Then Downloads it")
	public void user_then_downloads_it() {
		 System.out.println("Downloaded");
	}
	@After(order = -2)
	public void  screenShot() {
     System.out.println("Screenshot Taken");
	}
   @After(order = -1)
   public void quit() {
	System.out.println("Browser closed");
   }





	


	
}