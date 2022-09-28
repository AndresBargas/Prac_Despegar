package com.selenium.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class Alojamientos_Test {
	
  WebDriver driver=null;
  AlojamientosPage alojamientosPage=null;
 
  @BeforeMethod(alwaysRun=true)
  public void setUp() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Usuario\\drivers\\chromedriver.exe");
	  this.driver=new ChromeDriver();
	  this.driver.get("https://www.despegar.com.ar/");
  }

  @AfterMethod(alwaysRun=true)
  public void afterMethod() {
	 driver.quit();
  }
  
  @DataProvider
  public Object[][] data(){
	return new Object[][] {
		{"Salta"},
		{"Mendoza"}
	};
	  
  }

  @Test(groups="grupo_1", dataProvider="data")
  public void alojamientos_test(String provincia) throws InterruptedException{

	  alojamientosPage = new AlojamientosPage(this.driver);
	  alojamientosPage.cerrarSup();
	  alojamientosPage.cerrarInf();
	  alojamientosPage.clickAlojamientos();
	  alojamientosPage.ingresoDestino(provincia);
	  alojamientosPage.seleccionarFechas();
	  alojamientosPage.seleccionarHabitaciones();
	  alojamientosPage.buscarDestino();
	  alojamientosPage.visualizarDestino();
	  AlojamientosPage.handlesFocus(this.driver, 1);
	  alojamientosPage.recLista();
  }
 
  
  
  
}
