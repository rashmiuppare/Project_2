package com.Pomdemo;

import com.base.Base_demo;
import com.project_object_manager.Page_Object_Manager;

public class B extends Base_demo{
	public static void main(String[] args) {
		getDriver("chrome");
		getUrl("https://www.facebook.com/");
	
		Page_Object_Manager p=new Page_Object_Manager(driver);
		inputValue(p.getLogindemo().getUsername(),"Rashmi");
		inputValue(p.getLogindemo().getPassword(),"23414");
		
		//clickOnElement(p.getLogindemo().getLogin());
		clickOnElement(p.getForgetdemo().getForget());
		
		
			
		
		//LoginPage l=new LoginPage(driver);	//constructor
		
		//inputValue(l.getUsername(),"Rashmi");
		
		//inputValue(l.getPassword(),"1234");
		
	//	clickOnElement(l.getLogin());
		
	/*	Forget f=new Forget(driver);
		clickOnElement(f.getForget());
		inputValue(f.getForget(),"rashmi@gmail.com");*/
	}
}
