package com.File_read_Helper;

import com.adactin.properties.Configuration_Reader;

public class File_Read_Manager {
	public static File_Read_Manager getInstanceCR() {
		File_Read_Manager helper=new File_Read_Manager();
		return helper;
	}
	
	public Configuration_Reader getInstance() throws Throwable{
		Configuration_Reader reader=new Configuration_Reader();
		return reader;
	}

}
