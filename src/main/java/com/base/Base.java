package com.base;

//import java.io.File;
//import java.io.IOException;

//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	public static void getBrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\Demo_AprilMiniProject_2\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	public static void Input(WebElement element,String value) {
		element.sendKeys(value);
	}
/*		public static void getTS() throws IOException {
		
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File des=new File("C:\\Users\\USER\\eclipse-workspace\\Demo_AprilminiProject1\\ScreenSHOT\\img.png");
			FileUtils.copyFile(src, des);
	}
		public static void max() {
			driver.manage().window().maximize();
		}*/

}
