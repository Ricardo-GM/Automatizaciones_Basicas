package Basico;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {

	public static void main(String[] args) throws InterruptedException {
		
		String DServer_Chrome = ".//Drivers//ChromeDriver//chromedriver.exe";

		//Chrome Nav 
		System.setProperty("webdriver.chrome.driver", DServer_Chrome);
		WebDriver driverChrome = new ChromeDriver();
		
		//Fijando URL
		driverChrome.get("https://www.saucedemo.com/");
		
		//Maximizar ventana
		driverChrome.manage().window().maximize();
		
		//Localizar elementos
		WebElement usuario = driverChrome.findElement(By.id("user-name"));
		WebElement contrasena = driverChrome.findElement(By.name("password"));
		WebElement btnLogin = driverChrome.findElement(By.id("login-button"));
		
		//Llenar inputs
		usuario.sendKeys("standard_user");
		contrasena.sendKeys("secret_sauce");
		
		//Dar click en botón de Login
		btnLogin.click();
		
		//Timer 
		Thread.sleep(3000);
		
		//Obtener e imprimir el nombre de la página
		System.out.print("El nombre de la página es: " + driverChrome.getTitle());
		
		//Cerrar Navegador
		driverChrome.quit();
		

	}

}
