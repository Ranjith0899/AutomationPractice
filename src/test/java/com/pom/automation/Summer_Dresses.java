package com.pom.automation;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summer_Dresses {
	public WebDriver driver;
	public Summer_Dresses(WebDriver driver1) {
		this.driver= driver1;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath = "//input[@id='layered_id_attribute_group_3']")
 private WebElement size_L;
@FindBy(xpath = "//input[@id='layered_id_attribute_group_16']")
private WebElement colour_Y;
@FindBy(xpath = "//input[@id='layered_id_feature_1']")
private WebElement compo_p;
@FindBy(xpath ="//input[@id='layered_id_feature_19']")
private WebElement type_Short;
@FindBy(xpath = "//input[@id='layered_manufacturer_1']")
private WebElement manu;
@FindBy(xpath = "//input[@id='layered_condition_new']")
private WebElement condition;
@FindBy(xpath = "//input[@id='layered_quantity_1']")
private WebElement avilablity;
@FindBy(xpath ="//img[contains(@alt,'Printed ')]")
private WebElement img;
@FindBy(xpath ="//span[.='Quick view']")
private WebElement quickView;

public WebElement getSize_L() {
	return size_L;
}
public WebElement getColour_Y() {
	return colour_Y;
}
public WebElement getCompo_p() {
	return compo_p;
}
public WebElement getType_Short() {
	return type_Short;
}

public WebElement getManu() {
	return manu;
}
public WebElement getCondition() {
	return condition;
}
public WebElement getAvilablity() {
	return avilablity;
}
public WebElement getImg() {
	return img;
}
public WebElement getQuickView() {
	return quickView;
}

}
