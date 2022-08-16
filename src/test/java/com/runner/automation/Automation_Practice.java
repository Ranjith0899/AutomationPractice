package com.runner.automation;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.utility.Utility_Files;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureWithHooks",glue= "com.stepdef.with.hooks",monochrome = true,
plugin = {"html:target2/Html.html/", "json:target/json/file.json","pretty"})
public class Automation_Practice {
	public static WebDriver driver;
	@BeforeClass
	public static void set_Up() {
	driver = Utility_Files.browser_Launch("chrome");
	Utility_Files.impliWait(150);}
	@AfterClass
	public static void tear_Up() {
		Utility_Files.quit_();
	}
}
