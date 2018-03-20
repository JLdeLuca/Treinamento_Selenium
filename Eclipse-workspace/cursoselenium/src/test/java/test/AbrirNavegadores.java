package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbrirNavegadores {

	static WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	// localização do chromdriver
	System.setProperty("WebDriver.chrome.driver", "d:/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.youtube.com.br");
		
	}
		
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.close();
	}
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	//	fail("Not yet implemented");
	}

}
