package com.example.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CT03EnviarMensagem {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass (alwaysRun = true)
	public void setUp() throws Exception {

		System.setProperty("webdriver.gecko.driver","D:\\Java_Geral\\SeleniumWebdriver\\Drivers-Navegadores\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "https://livros.inoveteste.com.br/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testCT03EnviarMensagem() throws Exception {
		driver.get(baseUrl + "/contato/");
		driver.findElement(By.name("your-name")).click();
		driver.findElement(By.name("your-name")).clear();
		driver.findElement(By.name("your-name")).sendKeys("JOAO");
		driver.findElement(By.name("your-email")).clear();
		driver.findElement(By.name("your-email")).sendKeys("rluca@osite.com.br");
		driver.findElement(By.name("your-subject")).clear();
		driver.findElement(By.name("your-subject")).sendKeys("Modulos do Curso");
		driver.findElement(By.name("your-message")).clear();
		driver.findElement(By.name("your-message")).sendKeys("Quais são os modulos do curso");
		driver.findElement(By.cssSelector("input.wpcf7-form-control.wpcf7-submit")).click();
		Thread.sleep(40000);
		assertEquals(driver.findElement(By.xpath("//div[@id='wpcf7-f372-p24-o1']/form/div[2]")).getText(),"Agradecemos a sua mensagem. Responderemos em breve.");
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}
	@SuppressWarnings("unused")
	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	@SuppressWarnings("unused")
	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}
	@SuppressWarnings("unused")
	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
