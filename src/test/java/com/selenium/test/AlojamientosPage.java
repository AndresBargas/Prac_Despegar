package com.selenium.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlojamientosPage extends Test_Despegar {
	public WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1));
	
	By cerrar=By.xpath("/html/body/nav/div[4]/div[1]/i");
	By aceptar = By.xpath("//*[@id=\"lgpd-banner\"]/div/a[2]/em");
	By alojamientos = By.xpath("//body/nav[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/a[1]/div[1]/i[1]");

	public AlojamientosPage(WebDriver driver) {
		
		
		
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void ingresarAlojamientos() throws InterruptedException {
		
	
		click(cerrar); wait.until(ExpectedConditions.visibilityOfElementLocated(cerrar));
		
		click(aceptar); wait.until(ExpectedConditions.visibilityOfElementLocated(aceptar));
		Thread.sleep(1000);
		if(isDisplayed(alojamientos)) {
			click(alojamientos);
			
		}else {
			System.out.println("Page no encontrado");
		}
		
	}

}
