package com.helper;

import org.openqa.selenium.WebDriver;

import com.pom.automation.*;

public class POM_Automation {
	public WebDriver driver;
	private  Home_Page home ;
	private Sign_Up signUp  ;
	private  MyAccount myAcc ;
	private  EveningDresses evgDress ;
	private  AddToCart addTo ;
	private  Summary summ ;
	private  Address add ;
	private  Shiping ship ;
	private  Payment pay1;
	private  Payment_1 pay2;
	private  orderConfirmation order;
	private Summer_Dresses summer;

	public Summer_Dresses getSummer() {
		if (summer==null) {
			summer = new Summer_Dresses(driver);
		}
		return summer;
	}
	public POM_Automation(WebDriver driver2) {
		this.driver = driver2;
	}
	public  orderConfirmation getOrder() {
		if (order==null) {
			order = new orderConfirmation(driver);
		}
		return order;
	}
	public Home_Page getHome() {
		if (home==null) {
			home = new Home_Page(driver);
		}
		return home;
	}
	public Sign_Up getSignUp() {
		if (signUp==null) {
			signUp = new Sign_Up(driver);
		}
		return signUp;
	}
	public MyAccount getMyAcc() {
		if (myAcc==null) {
			myAcc = new MyAccount(driver);
			}
		return myAcc;
	}
	public EveningDresses getEvgDress() {
		if (evgDress==null) {
			evgDress = new EveningDresses(driver);
			}
		return evgDress;
	}
	public  AddToCart getAddTo() {
		if (addTo==null) {
			addTo = new AddToCart(driver);
			}
		return addTo;
	}
	public  Summary getSumm() {
		if (summ==null) {
			summ = new Summary(driver);
			}
		return summ;
	}
	public  Address getAdd() {
		if (add==null) {
			add= new Address(driver);
			}
		return add;
	}
	public  Shiping getShip() {
		if (ship==null) {
			ship = new Shiping(driver);
			}
		return ship;
	}
	public  Payment getPay1() {
		if (pay1==null) {
			pay1 = new Payment(driver);
			}
		return pay1;
	}
	public  Payment_1 getPay2() {
		if (pay2==null) {
			pay2 = new Payment_1(driver);
			}
		return pay2;
	}

}
