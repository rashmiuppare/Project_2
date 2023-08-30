package com.project_object_manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPass {
public static WebDriver driver;
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement forget;

	public WebElement getForget() {
		return forget;
	}
	
	public ForgetPass(WebDriver driver3) {
		this.driver=driver3;
		
		PageFactory.initElements(driver, this);
	}

}
