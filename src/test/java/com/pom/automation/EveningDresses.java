package com.pom.automation;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EveningDresses {
	public WebDriver driver;
	 public EveningDresses(WebDriver driver1) {
			this.driver = driver1;
		 PageFactory.initElements(driver, this);
		}
		@FindBy(xpath ="//input[@id='layered_id_attribute_group_3']")
		private WebElement size_L_CB;
		@FindBy(xpath ="//input[@id='layered_id_attribute_group_7']")
		private WebElement color_Begie_CB;
		@FindBy(xpath ="//input[@id='layered_id_feature_3']")
		private WebElement comp_CB;
		@FindBy(xpath ="//input[@id='layered_id_feature_16']")
		private WebElement styles_CB;
		@FindBy(xpath ="//input[@id='layered_id_feature_19']")
		private WebElement properties_CB;
		@FindBy(xpath ="//input[@id='layered_quantity_1']")
		private WebElement avail_CB;
		@FindBy(xpath ="//input[@id='layered_manufacturer_1']")
		private WebElement manu_CB;
		@FindBy(xpath ="//input[@id='layered_condition_new']")
		private WebElement cond_CB;
		@FindBy(xpath ="//a[@style='left: 0%;']")
		private WebElement priceRange_CB;
		@FindBy(xpath ="//a[@style='left: 100%;']")
		private WebElement priceRange_CB1;
		@FindBy(xpath ="//img[contains(@alt,'Printed ')]")
		private WebElement img;
		@FindBy(xpath ="//span[.='Quick view']")
		private WebElement quickView;
		@FindBy(tagName = "iframe")
		private List<WebElement> frame;
		@FindBy(xpath ="//i[@class='icon-plus']//parent::span")
		private WebElement qtyPlus_But;
		@FindBy(xpath ="//p[@id='add_to_cart']/button/span")
		private WebElement addToCart_But;
		
		public WebElement getSize_L_CB() {
			return size_L_CB;
		}
		public WebElement getColor_Begie_CB() {
			return color_Begie_CB;
		}
		public WebElement getComp_CB() {
			return comp_CB;
		}
		public WebElement getStyles_CB() {
			return styles_CB;
		}
		public WebElement getProperties_CB() {
			return properties_CB;
		}
		public WebElement getAvail_CB() {
			return avail_CB;
		}
		public WebElement getManu_CB() {
			return manu_CB;
		}
		public WebElement getCond_CB() {
			return cond_CB;
		}
		public WebElement getPriceRange_CB() {
			return priceRange_CB;
		}
		public WebElement getPriceRange_CB1() {
			return priceRange_CB1;
		}
		public WebElement getImg() {
			return img;
		}
		public WebElement getQuickView() {
			return quickView;
		}
		public List<WebElement> getFrame() {
			return frame;
		}
		public WebElement getQtyPlus_But() {
			return qtyPlus_But;
		}
		public WebElement getAddToCart_But() {
			return addToCart_But;
		}
		

}
