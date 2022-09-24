package com.selenium.driver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class DriverFactory {
	private enum browsers {
	CHROME,FIREFOX,EDGE
	}
	public static WebDriver LevantarBrowser(String browserName,String url) {
		WebDriver driver=null;
		switch(browsers.valueOf(browserName)) {
		case CHROME:{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\drivers\\chromedriver.exe");
			Reporter.log("Abrir Navegador Chrome");
			driver=new ChromeDriver();
			break;
		}
		case FIREFOX:
		{
			System.setProperty("webdriver.gecko.driver", "u");
			Reporter.log("Abrir Navegador Firefox");
			driver=new FirefoxDriver();
			break;
		}	
		case EDGE:
		{
			System.setProperty("webdriver.edge.driver", "u");
			Reporter.log("Abrir Navegador Chrome");
			driver=new ChromeDriver();
			break;
		}
		default:
		{
			Reporter.log("No se selecciono un navegador correcto, se abre Chrome por defecto");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\drivers\\chromedriver.exe");
			Reporter.log("Abrir navegador Chrome");
			driver= new ChromeDriver();
			break;
		}
		
	}
	
		//maximizar navegador
		driver.manage().window().maximize();
		//navegamos hacia la pagina
		driver.get(url);
		return driver;
		
	}
	public static void CloseBrowser(WebDriver driver) {
		driver.quit();
	}		
}
	
	
	





