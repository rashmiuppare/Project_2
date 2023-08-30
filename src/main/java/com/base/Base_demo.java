package com.base;

//import java.io.File;
//import java.io.IOException;

//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_demo {
	public static WebDriver driver;
	public static WebDriver getDriver (String value) {
		
		if(value.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\Demo_AprilMiniProject_2\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(value.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\Demo_AprilMiniProject_2\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
	}
	public static void getUrl(String a) {
		driver.get(a);
	}
	public static void inputValue(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void clickOnElement(WebElement element2) {
		
		element2.click();
	}
		
	/*public static void getTS() throws IOException {
		
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File des=new File("C:\\Users\\USER\\eclipse-workspace\\Demo_AprilminiProject1\\ScreenSHOT\\img.png");
			FileUtils.copyFile(src, des);
	}
		public static void max() {
			driver.manage().window().maximize();
		}
*/
}

