package com.features.runner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "Demo",glue="com.demo.def")
public class Cucumber_Feature_runner{
	@BeforeClass
	public static void setup() {
		System.out.println("Chrome launched");
	}
	
	}	
