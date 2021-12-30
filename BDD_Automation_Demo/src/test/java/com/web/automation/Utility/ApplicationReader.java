package com.web.automation.Utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ApplicationReader {

	public static String applicationConfige(String keyName) {
		String value =null;
		
		try {
			
	    FileReader file =new FileReader(new File("./ConfigFile/ProjectConfigurations.properties"));
		Properties property = new Properties();
		property.load(file);
		return property.getProperty(keyName).trim();
		
		}
		catch(Exception exception){
			
			exception.printStackTrace();
			throw(new RuntimeException("Error....."+ keyName + "  Not Avaliable"));
		}
	}

	public static String locatorsReader(String LocaterName) throws IOException {
		String value =null;
		
		try {
			
		FileReader file =new FileReader(new File("./ElementLocators/Locators.propreties"));
		Properties property = new Properties();
		property.load(file);
		return property.getProperty(LocaterName).trim();
		
		}
		catch(Exception exception){
			
			exception.printStackTrace();
			throw(new RuntimeException("Error....."+ LocaterName + "  Not Avaliable"));
		}
	}
}
