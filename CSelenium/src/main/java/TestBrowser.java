import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBrowser {
	
	private WebDriver driver;
	
	@Before
	public void inicial() throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver", "D:\\Java_Geral\\SeleniumWebdriver\\Drivers-Navegadores\\geckodriver.exe");
//		System.setProperty("webdriver.chrome.driver", "D:\\Java_Geral\\SeleniumWebdriver\\Drivers-Navegadores\\chromedriver.exe");
//		System.setProperty("webdriver.ie.driver", "D:\\Java_Geral\\SeleniumWebdriver\\Drivers-Navegadores\\IEDriverServer.exe");
		driver = new FirefoxDriver();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.quit();

		driver = new ChromeDriver();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.quit();
		
		driver = new InternetExplorerDriver();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.quit();
		
	}

	@After
	public void Finaliza() {
		driver.quit();
	}
	
	@Test
	public void teste() {
		System.out.println("teste de abertura e fechamento do browser: IE, Chrome, Fire");
	}

}
