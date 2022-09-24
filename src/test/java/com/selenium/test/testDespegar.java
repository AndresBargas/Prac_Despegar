package com.selenium.test;

import static org.testng.Assert.assertTrue;

import java.sql.Time;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Test
public class testDespegar{
	
	private WebDriver driver;
	
	
	By cerrar=By.xpath("/html/body/nav/div[4]/div[1]/i");
	By aceptar = By.xpath("//*[@id=\"lgpd-banner\"]/div/a[2]/em");
	By alojamientos = By.xpath("//body/nav[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/a[1]/div[1]/i[1]");
	By destino = By.xpath("//*[@id=\"searchbox-sbox-box-hotels\"]/div/div/div/div/div[3]/div[1]/div/div/div/input");
	By searchEntrada = By.xpath("//*[@id=\"searchbox-sbox-box-hotels\"]/div/div/div/div/div[3]/div[2]/div/div[1]/div/div/div/div");
	By fechaEntrada = By.xpath("//*[@id=\"component-modals\"]/div[4]/div[1]/div[2]/div[1]/div[3]/div[20]/div");
	By fechaSalida = By.xpath("//*[@id=\"component-modals\"]/div[4]/div[1]/div[2]/div[1]/div[3]/div[26]");
	By aceptarFecha = By.xpath("//*[@id=\"component-modals\"]/div[4]/div[2]/div[1]/button/em");
	By boxHabitaciones= By.xpath("//*[@id=\"searchbox-sbox-box-hotels\"]/div/div/div/div/div[3]/div[3]/div/div/div[1]");
	By selectAdultos=By.xpath("//*[@id=\"component-modals\"]/div[5]/div/div/div[1]/div[2]/div[1]/div[2]/div/button[2]");
	By selectMenores=By.xpath("//*[@id=\"component-modals\"]/div[5]/div/div/div[1]/div[2]/div[2]/div[2]/div/button[2]");
	By aplicar=By.xpath("//*[@id=\"component-modals\"]/div[5]/div/div/div[2]/a[1]/em");
	By buscar=By.xpath("//*[@id=\"searchbox-sbox-box-hotels\"]/div/div/div/div/div[3]/button/em");
    By primerOpcion=By.xpath("/html/body/aloha-app-root/aloha-results/div/div/div/div[2]/div[2]/aloha-list-view-container/div[3]/div[1]/aloha-cluster-container");
	By vActividades=By.xpath("/html/body/nav/div[2]/div/div[3]/ul/li[6]/a/div/i");
    
    @BeforeClass 
	public void setProp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.despegar.com.ar/");
			
	}
	public void tcDespegar() throws InterruptedException {
	
				
		driver.findElement(alojamientos).click(); 
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1));
		wait.until(ExpectedConditions.visibilityOfElementLocated(alojamientos));
		assertTrue(driver.findElement(alojamientos).isDisplayed());
		driver.findElement(aceptar).click(); wait.until(ExpectedConditions.elementToBeClickable(aceptar));
		driver.findElement(cerrar).click(); wait.until(ExpectedConditions.elementToBeClickable(cerrar));
	
		driver.findElement(destino).click(); wait.until(ExpectedConditions.elementToBeClickable(destino));
		driver.findElement(destino).sendKeys("Salta"); wait.until(ExpectedConditions.visibilityOfElementLocated(destino));
		driver.findElement(destino).sendKeys(Keys.CONTROL); 
		driver.findElement(destino).sendKeys(Keys.ENTER); 
		
		driver.findElement(searchEntrada).click(); 
		driver.findElement(searchEntrada).isDisplayed(); wait.until(ExpectedConditions.elementToBeClickable(searchEntrada));
		driver.findElement(fechaEntrada).click(); 
		driver.findElement(fechaSalida).click(); 
		
		driver.findElement(aceptarFecha).click(); wait.until(ExpectedConditions.elementToBeClickable(aceptarFecha));
		driver.findElement(boxHabitaciones).click(); wait.until(ExpectedConditions.elementToBeClickable(boxHabitaciones));
		driver.findElement(selectAdultos).click(); 
		driver.findElement(selectMenores).click(); 
	
		
		Select select = new Select (driver.findElement(By.xpath("//*[@id=\"component-modals\"]/div[5]/div/div/div[1]/div[2]/div[3]/div[2]/div/div/select")));
		select.selectByIndex(2);
		driver.findElement(aplicar).click(); wait.until(ExpectedConditions.visibilityOfElementLocated(aplicar));
		driver.findElement(buscar).click(); wait.until(ExpectedConditions.visibilityOfElementLocated(buscar));
		driver.findElement(primerOpcion).click(); wait.until(ExpectedConditions.visibilityOfElementLocated(primerOpcion));
		
	}
	@AfterClass
	
	public void cierrePag() {
		//driver.quit();
	}
}