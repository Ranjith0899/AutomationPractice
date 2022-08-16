package com.runner.adactin;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.utility.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "Hooks",glue="com.hooks.stepdef",monochrome = true,
 plugin = {"html:hooksReport1/Html.html/", "json:hooksReport1/json/file.json","pretty"},dryRun = false
 
 
 )
public class Adactin_Runner{
public static WebDriver driver;
@BeforeClass
public static void set_Up() {
driver = Utility_Files.browser_Launch("chrome");
Utility_Files.impliWait(100);}
@AfterClass
public static void tear_Up() {
	Utility_Files.quit_();
}
}