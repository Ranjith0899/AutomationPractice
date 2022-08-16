package com.hooks.stepdef;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.helper.POM_Adactin;
import com.runner.adactin.Adactin_Runner;
import com.utility.Utility_Files;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksAdactin extends Utility_Files {
	public static WebDriver driver1 = Adactin_Runner.driver;
	public static POM_Adactin p = new POM_Adactin(driver1);
	public static Logger log = Logger.getLogger(HooksAdactin.class);
	 @Before(order = 0,value = "@London")
	 public void url_Launch () {
		 getUrl("https://adactinhotelapp.com");
		 BasicConfigurator.configure();
		 log.info("Adactin URL Opened");
	 }
	 @Before(order = 1,value = "@London")
	 public void Login () throws InterruptedException {
		 send_Keys(p.getLogin().getId(),"ranjith55");
		 send_Keys(p.getLogin().getPass(),"554499");
		 click_(p.getLogin().getLogin_But());
		 threadSleep(15000);
		 Assert.assertEquals("Adactin.com - Search Hotel", get_Title());
		log.info("User Logged Into Adactin Account And Search Hotel Opened ");
	 }
	    @After(order = 4)
	    public void select_Hotel ( ) throws InterruptedException {
	    	 click_(p.getSelect().getRadio_But());
	    	 click_(p.getSelect().getContinue_But());
	 		threadSleep(15000);
	 		Assert.assertEquals("Adactin.com - Book A Hotel", get_Title());
	 		log.info("A Hotel Chosen from Select Hotel");
	    } 
	    @After(order = 3)
	    public void book_Hotel ( ) throws InterruptedException {
	    	send_Keys(p.getBook().getFirstName_Txt(),"Ranjith");
	    	send_Keys(p.getBook().getLastName_Txt(),"R");
	    	send_Keys(p.getBook().getAddress_TxtArea(),"Nasamaniponiya theru,Cuddalore");
	    	send_Keys(p.getBook().getCcNum_Txt(),"1234567890123456");
	    	Select card = select(p.getBook().getCc_drop() );
		    selectByText(card,"VISA");
		    Select month = select(p.getBook().getExpMonth_drop());
		    selectByText(month, "April");
		    Select year = select(p.getBook().getExpYear_drop());
		    selectByText(year,"2022");
		    send_Keys(p.getBook().getCcCVV_Txt(),"663");
		    click_(p.getBook().getBookNow_But());
		    log.info("User Provides Required Detials For Booking and Clicks On Book Now Button");
			threadSleep(15000);
			Assert.assertEquals("Adactin.com - Hotel Booking Confirmation", get_Title());   
	    }
	    @After(order = 2)
	    public void booked_Itinerary ( ) throws InterruptedException {
	    	click_(p.getBook_Con().getMyItinerary_But());
			threadSleep(15000);
			Assert.assertEquals("Adactin.com - Select Hotel", get_Title());
	    	log.info("Users Enters Booked Itinerary For verifying Booking ");
	    	 }
	    @After(order=1,value =("@London or @Paris or @LosAngeles") )
	    public void searchHotel() throws InterruptedException {
	    	 click_(p.getBooked().getSearchHotel_But());
	    	 log.info("User Clicks On Search Hotel Button");
	         threadSleep(15000);
	    	 Assert.assertEquals("Adactin.com - Search Hotel", get_Title());
	    	 log.info("Search Hotel Page Opened");
		}
	    @After(order = 0 ,value = "@Sydney")
	    public void logout() {
	    	click_(p.getBooked().getLogout_But());
	    	log.info("User Logs Out The Adactin Account");
	    }
}
