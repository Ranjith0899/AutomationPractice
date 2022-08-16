package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
	 
		public WebDriver driver;
	public MyAccount(WebDriver driver1) {
			this.driver = driver1;
		 PageFactory.initElements(driver, this);
		}
		@FindBy(xpath ="//div[@id ='block_top_menu']/ul/li/a[@title='Dresses']")
		private WebElement dresses;
		@FindBy(xpath ="//div[@id ='block_top_menu']/ul/li/ul/li/a[@title='Evening Dresses']")
		private WebElement eveningDresses;
		@FindBy(xpath ="//div[@id ='block_top_menu']/ul/li/ul/li/a[@title='Summer Dresses']")
		private WebElement summerDresses;
		
		public WebElement getSummerDresses() {
			return summerDresses;
		}
		public WebElement getDresses() {
			return dresses;
		}
		public WebElement getEveningDresses() {
			return eveningDresses;
		}
}
