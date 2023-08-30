package com.project_object_manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page_Object_Manager {
	
		public static WebDriver driver;
		public static Login l;
		
		private Login logindemo;
		public Login getLogindemo() {
			Login l=new Login(driver);
			return l;
		}

		private ForgetPass forgetdemo;
		public ForgetPass getForgetdemo() {
			ForgetPass f=new ForgetPass(driver);
			return f;
		}
		
		public Page_Object_Manager(WebDriver driver4) {
			this.driver=driver4;
			PageFactory.initElements(driver,this);
			
		}
		
}
