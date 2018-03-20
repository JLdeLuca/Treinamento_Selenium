package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.FacebookpagesXpath;


public class FacebooktestXpath {

	static WebDriver driver;
	static FacebookpagesXpath facebookpagesXpath;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("WebDriver.chrome.driver", "D:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		facebookpagesXpath = new FacebookpagesXpath(driver);
				
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
	public void test() {
		facebookpagesXpath.PreencherComboxXpath();
		
	}

}
