package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Keyspage;


public class Keystest {

	static WebDriver driver;
	static Keyspage keyspage;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("WebDriver.chrome.driver", "D:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		keyspage = new Keyspage(driver);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception  {
	
		keyspage.mouseScroll();
	}

}
