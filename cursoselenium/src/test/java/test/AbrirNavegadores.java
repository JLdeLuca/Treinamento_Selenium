package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AbrirNavegadores {

	//instanciando a classe webdriver
	static WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//dizer onde esta o executavel
//		System.setProperty("webdriver.gecko.driver", "D:\\Java_Geral\\SeleniumWebdriver\\Drivers-Navegadores\\geckodriver.exe");
//		System.setProperty("webdriver.chrome.driver", "D:\\Java_Geral\\SeleniumWebdriver\\Drivers-Navegadores\\chromedriver.exe");
//		System.setProperty("webdriver.ie.driver","D:\\Java_Geral\\SeleniumWebdriver\\Drivers-Navegadores\\IEDriverServer.exe");
		
		//internet explorer 
		driver = new InternetExplorerDriver();
		driver.get("http://www.youtube.com.br");
		Thread.sleep(5000);
		driver.quit();

		//firefox
		driver = new FirefoxDriver();
		driver.get("http://www.youtube.com.br");
		Thread.sleep(5000);
		driver.quit();
		
		//chromedriver
		driver = new ChromeDriver();
		driver.get("http://www.youtube.com.br");
		Thread.sleep(5000);
		
		
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();

	}
	

	@Test
	public void test() throws InterruptedException {
		//fail("Not yet implemented");
	}

}
