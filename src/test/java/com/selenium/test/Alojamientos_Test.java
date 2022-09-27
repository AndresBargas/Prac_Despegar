package com.selenium.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class Alojamientos_Test {
	
  private WebDriver driver;
  AlojamientosPage alojamientosPage;
 
  @BeforeMethod
  public void setUp() throws Exception {
	  alojamientosPage = new AlojamientosPage(driver);
	  driver = alojamientosPage.chromeDriverConnection();
	  alojamientosPage.visit("https://www.despegar.com.ar/");
  }

  @AfterMethod
  public void afterMethod() {
  }


  public void test() throws InterruptedException{
	  alojamientosPage.ingresarAlojamientos();
  }
 
}
