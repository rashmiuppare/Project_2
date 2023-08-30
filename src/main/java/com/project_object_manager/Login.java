package com.project_object_manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public static WebDriver driver;

	@FindBy(id="email")
	private WebElement username;
	
	public WebElement getUsername() {
		return username;
	}
	
	@FindBy(id="pass")
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
	}
	
//	@FindBy(xpath="//button[@type='submit']")
	@FindBy(name="login")
	private WebElement login;
	
	public WebElement getLogin() {
		return login;
	}
	
	public Login(WebDriver driver2) {
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}


}
