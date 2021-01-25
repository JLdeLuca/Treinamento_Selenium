import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteLista {

	WebDriver driver;

	@Before
	public void Inicio() {
		driver = new FirefoxDriver();
		driver.get("https://www.olx.com.br/");

	}

	@Test
	public void ListaItens() throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[2]/div/div/ul/li[8]/a")).click();
//		driver.findElement(By.linkText("São Paulo")).click();
//		driver.findElement(By.linkText("DDD 11 - São Paulo e região")).click();

//		By mySelector = By.xpath("//*[@id=\"main-ad-list\"]");
		List<WebElement> myElements = driver.findElements(By.id("main-ad-list"));
//		List<WebElement> myElements = driver.findElements(By.tagName("li"));
		for (WebElement element : myElements)  {
			System.out.println(element.getText());
			System.out.println("*********************************************************************");

		}
	}

	@After
	public void Finaliza() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();

	}

}