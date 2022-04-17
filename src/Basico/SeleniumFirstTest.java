package Basico;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumFirstTest {

	public static void main(String[] args) throws InterruptedException {
		
		String DServer_Chrome = ".//Drivers//ChromeDriver//chromedriver.exe";
		String DServer_Firefox = ".//Drivers//FirefoxDriver//geckodriver.exe";
		String DServer_IExplorer = ".//Drivers//InternetExplorerDriver//IEDriverServer.exe";
		
		//Chrome Nav 
		System.setProperty("webdriver.chrome.driver", DServer_Chrome);
		WebDriver driverChrome = new ChromeDriver();
		
		//Firefox Nav 
		//System.setProperty("webdriver.gecko.driver", DServer_Firefox);
		//WebDriver driverFirefox = new FirefoxDriver();
				
		//Internet Explorer Nav 
		//System.setProperty("webdriver.ie.driver", DServer_IExplorer);
		//WebDriver driverIExplorer = new InternetExplorerDriver();
		
		
		
		driverChrome.get("https://lectortmo.com/");
		
		String titulo = driverChrome.getTitle();
		
		System.out.println(titulo);
		
		Thread.sleep(3000);
		
		driverChrome.close();
		

	}

}
