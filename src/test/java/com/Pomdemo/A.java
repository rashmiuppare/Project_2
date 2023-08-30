package com.Pomdemo;

import com.POM.Forget;
import com.POM.LoginPage;
//import com.base.Base;
import com.base.Base_demo;

public class A extends Base_demo{
	public static void main(String[] args) {
		getDriver("chrome");
		getUrl("https://www.facebook.com/");
	
		
		LoginPage l=new LoginPage(driver);	//constructor
		
		inputValue(l.getUsername(),"Rashmi");
		
		inputValue(l.getPassword(),"1234");
		
	//	clickOnElement(l.getLogin());
		
		Forget f=new Forget(driver);
		clickOnElement(f.getForget());
		inputValue(f.getForget(),"rashmi@gmail.com");
	}
}
