package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Keyspage {
	
	static WebDriver driver;
	
	public Keyspage(WebDriver driver) {
		this.driver = driver;
	}

	public void mouseScroll() throws InterruptedException {
		
		WebElement interaction = driver.findElement(By.cssSelector("li.dropdown:nth-child(6) > a:nth-child(1)"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(interaction).perform();
		Thread.sleep(5000);

		WebElement selecaoitem = driver.findElement(By.cssSelector("#header > nav > div > div.navbar-collapse.collapse.navbar-right > ul > li:nth-child(6) > ul > li:nth-child(2) > a"));
		act.moveToElement(selecaoitem).click().build().perform();
		Thread.sleep(5000);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300)");
		Thread.sleep(5000);
		
	}
}
