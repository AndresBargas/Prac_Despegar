package com.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	final static String urlDespegar="https://www.despegar.com.ar/";
	public static WebDriver createDriver(String driverOption) {
		WebDriver driver=null;
		switch (driverOption) {
			case "CHROME":{
				 System.setProperty("webdriver.chrome.driver","C:\\Users\\Usuario\\drivers\\chromedriver.exe");
				 driver=new ChromeDriver();
			 }
			case "FIREFOX":{
				 System.setProperty("webdriver.firefox.driver","C:\\Users\\Usuario\\drivers\\geckodriver");
				 driver=new FirefoxDriver();
			 }
			
			default:{
				 System.setProperty("webdriver.chrome.driver","C:\\Users\\Usuario\\drivers\\chromedriver.exe");
				 driver=new ChromeDriver();
			 }
			}
		driver.get(BaseTest.urlDespegar);
		return driver;
		 
	}
}
