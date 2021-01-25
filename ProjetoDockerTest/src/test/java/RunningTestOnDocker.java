import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RunningTestOnDocker {

	@Test
	public void runTestOnDocker() throws Exception {
		DesiredCapabilities dcap = DesiredCapabilities.chrome();
		String driverPath = System.getProperty("user.dir") + "/exe/chromedriver";
		System.setProperty("webdriver.chrome.driver", driverPath);

		// You should check the Port No here.
		URL gamelan = new URL("http://192.168.15.22:32773/wd/hub");
		WebDriver driver = new RemoteWebDriver(gamelan, dcap);
		// Get URL
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		// Print Title
		System.out.println(driver.getTitle());
		// Pesquisa no google
		String vpesquisa = "bicicleta";
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys(vpesquisa);
		driver.findElement(By.name("btnK")).click();

		System.out.println("Pesquisa realizada: " + vpesquisa);
		String vnomebicicleta = driver
				.findElement(By
						.xpath("//*[@id=\"rso\"]/div[1]/div/div[2]/div/div[4]/div[1]/div[1]/div/div/a/div/div[2]/span"))
				.getText();
		System.out.println("Bicicleta encontrada foi: " + vnomebicicleta);
		Thread.sleep(15000);
		driver.quit();
	}
}
