package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoAutodinamicoPages {
	
	static WebDriver driver;
	public DemoAutodinamicoPages (WebDriver driver) {
		this.driver = driver;
	}
	
public void prencheriddinamico() {
	
	WebElement nome = driver.findElement(By.xpath(".//label[text()=\"Full Name* \"]/following-sibling::div[1]/input"));
	nome.sendKeys("Jo�o Luis");
	
}

}
