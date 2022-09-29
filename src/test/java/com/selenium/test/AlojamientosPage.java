package com.selenium.test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.driver.DriverFactory;

public class AlojamientosPage{
	WebDriver driver=null;
	WebDriverWait wait;
	
	@FindBy(xpath="/html/body/nav/div[4]/div[1]/i") WebElement cerrar;
	@FindBy(xpath="//*[@id=\"lgpd-banner\"]/div/a[2]/em") WebElement aceptar;
	@FindBy(xpath="//body/nav[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/a[1]/div[1]/i[1]") WebElement alojamientos;
	@FindBy(xpath="//*[@id=\"searchbox-sbox-box-hotels\"]/div/div/div/div/div[3]/div[1]/div/div/div/input") WebElement destino;
	@FindBy(xpath="//*[@id=\"searchbox-sbox-box-hotels\"]/div/div/div/div/div[3]/div[2]/div/div[1]/div/div/div/div/input") WebElement searchEntrada;
	@FindBy(xpath="//*[@id=\"component-modals\"]/div[4]/div[1]/div[2]/div[1]/div[3]/div[29]/div") WebElement fechaEntrada;
	@FindBy(xpath="//*[@id=\"component-modals\"]/div[4]/div[1]/div[2]/div[1]/div[3]/div[30]/div") WebElement fechaSalida;
	@FindBy(xpath="//*[@id=\"component-modals\"]/div[4]/div[2]/div[1]/button/em") WebElement aceptarFecha;
	@FindBy(xpath="//*[@id=\"searchbox-sbox-box-hotels\"]/div/div/div/div/div[3]/div[3]/div/div/div[1]/input") WebElement boxHabitaciones;
	@FindBy(xpath="//*[@id=\"component-modals\"]/div[5]/div/div/div[1]/div[2]/div[1]/div[2]/div/button[2]") WebElement selectAdultos;
    @FindBy(xpath="//*[@id=\"component-modals\"]/div[5]/div/div/div[1]/div[2]/div[2]/div[2]/div/button[2]") WebElement selectMenores;
	@FindBy(xpath="//*[@id=\"component-modals\"]/div[5]/div/div/div[2]/a[1]/em") WebElement aplicar;
	@FindBy(xpath="//*[@id=\"searchbox-sbox-box-hotels\"]/div/div/div/div/div[3]/button") WebElement buscar;
	@FindBy(xpath="/html/body/aloha-app-root/aloha-results/div/div/div/div[2]/div[2]/aloha-list-view-container/div[3]/div[1]/aloha-cluster-container/div/div") WebElement primerOpcion;
	@FindBy(xpath="/html/body/nav/div[2]/div/div[3]/ul/li[6]/a/div/i") static WebElement vActividades;
	@FindBy(css="ul.header-list-products>li>a") List<WebElement> list ;
	

	public AlojamientosPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void cerrarSup(){
		wait=new WebDriverWait(driver,Duration.ofSeconds(1));
		wait.until(ExpectedConditions.visibilityOf(cerrar));
		cerrar.click();
	}
	
	public void cerrarInf(){
		
		wait.until(ExpectedConditions.visibilityOf(aceptar));
		aceptar.click();
	}
	
	public void clickAlojamientos() {

	wait.until(ExpectedConditions.visibilityOf(alojamientos));
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	alojamientos.click();
	
	}
	
	public void ingresoDestino(String prov)  {
		
			destino.click(); try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			destino.sendKeys(prov); try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			destino.sendKeys(Keys.ENTER); try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	
	public void seleccionarFechas() {

		
		searchEntrada.click(); 
		
		wait.until(ExpectedConditions.visibilityOf(fechaEntrada));
		fechaEntrada.click(); try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		wait.until(ExpectedConditions.visibilityOf(fechaSalida));
		fechaSalida.click(); try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		wait.until(ExpectedConditions.visibilityOf(aceptarFecha));
		aceptarFecha.click();
		
	}
	
	public void seleccionarHabitaciones() {
		wait.until(ExpectedConditions.visibilityOf(boxHabitaciones));
		boxHabitaciones.click(); try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(selectAdultos));
		selectAdultos.click();
		
		wait.until(ExpectedConditions.visibilityOf(selectMenores));
		selectMenores.click();
		
		Select select = new Select (driver.findElement(By.xpath("//*[@id=\"component-modals\"]/div[5]/div/div/div[1]/div[2]/div[3]/div[2]/div/div/select")));
		select.selectByIndex(2);
		
		wait.until(ExpectedConditions.visibilityOf(aplicar));
		aplicar.click();
	}
	public void buscarDestino() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(buscar));
		buscar.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void visualizarDestino() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		primerOpcion.click();
	}
	
	public static void handlesFocus(WebDriver driver, int index) {
		ArrayList<String> listHandles = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(listHandles.get(index));
		vActividades.click();
	}
	public void recLista() {
		for(WebElement i:list) {
			System.out.println(i.getAttribute("href"));
		}
	}
	
}
