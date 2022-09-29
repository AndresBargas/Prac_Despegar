package com.selenium.test;

import org.testng.annotations.Test;

import com.selenium.driver.DriverFactory;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class Alojamientos_Test extends DriverFactory{
	
  WebDriver driver=null;
  AlojamientosPage alojamientosPage=null;
 
  @BeforeMethod(alwaysRun=true)
  public void setUp(ITestContext context) throws Exception {
	  String navegadorTestSuite=context.getCurrentXmlTest().getParameter("Navegador");
	  String navegador=navegadorTestSuite !=null ? navegadorTestSuite:"CHROME";
	  driver=DriverFactory.LevantarBrowser(navegador,"https://www.despegar.com.ar/");
	  alojamientosPage = new AlojamientosPage(driver);
	 
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
