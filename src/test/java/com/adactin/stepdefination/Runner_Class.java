package com.adactin.stepdefination;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.File_read_Helper.File_Read_Manager;
//import org.openqa.selenium.chrome.ChromeDriver;
import com.base.Base_demo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\adactin\\feature\\adactin.feature",
glue="com.adactin.runner",
//monochrome=false,
//tags=("@A"),
//dryRun=false,
plugin= {
		"html:Report/cucumber_Report",
		"json:Report/Cucumber.json",
		"pretty"
}		
)

public class Runner_Class {
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Throwable {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\Demo_AprilMiniProject_2\\Driver\\chromedriver.exe");
		//driver = new ChromeDriver();
		
		String browser=File_Read_Manager.getInstanceCR().getInstance().getBrowser();
		driver=Base_demo.getDriver(browser);
	}
	

}
