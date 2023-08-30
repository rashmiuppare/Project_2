package com.adactin.properties;

import java.io.File;
import java.io.FileInputStream;
//import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public  Configuration_Reader() throws Throwable  {
	
		File f=new File("C:\\Users\\USER\\eclipse-workspace\\Demo_AprilMiniProject_2\\src\\test\\java\\com\\adactin\\properties\\Configuration.properties");
		FileInputStream fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);
	}
	public String getBrowser() {
		String browser=p.getProperty("browser");
		return browser;
		}
	public String getUrl() {
		String url=p.getProperty("url");
		return url;
	}
}
