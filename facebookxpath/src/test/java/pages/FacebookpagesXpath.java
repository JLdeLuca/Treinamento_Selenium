package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookpagesXpath {
	static WebDriver driver;
	@SuppressWarnings("static-access")
	public FacebookpagesXpath (WebDriver driver) {
		this.driver = driver;
	}

public void PreencherComboxXpath() {
	
	
	WebElement nome = driver.findElement(By.xpath("//*[@id=\"u_0_j\"]"));
	nome.sendKeys("João");
	
	WebElement sobrenome = driver.findElement(By.xpath("//*[@id=\"u_0_l\"]"));
	sobrenome.sendKeys("de Luca");
	
	WebElement email = driver.findElement(By.xpath("//*[@id=\"u_0_o\"]"));
	email.sendKeys("rluca@osite.com.br");
	
	WebElement emailconf = driver.findElement(By.xpath("//*[@id=\"u_0_r\"]"));
	emailconf.sendKeys("rluca@osite.com.br");
	
	WebElement novasenha = driver.findElement(By.xpath("//*[@id=\"u_0_v\"]"));
	novasenha.sendKeys("@Teste12345");
	
	WebElement selecaom = driver.findElement(By.xpath("//*[@id=\"u_0_a\"]"));
	selecaom.click();
	
	Select dia = new Select (driver.findElement(By.xpath(".//*[@id='day']")));
	dia.selectByValue("6");
	
	Select mes = new Select (driver.findElement(By.xpath(".//*[@id='month']")));
	mes.selectByVisibleText("Abr");
	
	Select ano = new Select (driver.findElement(By.xpath(".//*[@id='year']")));
	ano.selectByValue("1964");
	
	}
}

//