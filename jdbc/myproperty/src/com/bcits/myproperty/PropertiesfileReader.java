package com.bcits.myproperty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesfileReader {
	public static void main(String[] args) {
		try {
			FileInputStream inputStream = new FileInputStream("dbinfo.properties");
			Properties properties = new Properties();
			properties.load(inputStream);
			System.out.println("Drivername .."+properties.getProperty("drivername"));
			System.out.println("dbUrl .."+properties.getProperty("dbURl"));
			System.out.println("password.."+properties.getProperty("password"));
			System.out.println("user.."+properties.getProperty("user"));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
