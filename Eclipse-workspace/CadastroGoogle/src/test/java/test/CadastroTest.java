package test;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.CadastroPages;

public class CadastroTest {
	
	static WebDriver driver;
	static CadastroPages cadastroPages;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("WebDriver.chrome.driver", "D:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/SignUp?service=accountsettings&continue=https%3A%2F%2Fmyaccount.google.com%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		cadastroPages = new CadastroPages(driver);
		
		}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//driver.close();
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		cadastroPages.preencherCampos();
		//assertEquals(cadastroPages.validarmensagem(),"Você não pode deixar este campo em branco.");
		
	}

}
