package com.example.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CT02ValidarCriticaCamposObrigatorios {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver","D:\\Java_Geral\\SeleniumWebdriver\\Drivers-Navegadores\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "https://livros.inoveteste.com.br/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testCT02ValidarCriticaCamposObrigatorios() throws Exception {
		// Acesso a pagina de contato do site inoveteste
		driver.get(baseUrl + "/contato/");
		// clica no botao enviar
		driver.findElement(By.cssSelector("input.wpcf7-form-control.wpcf7-submit")).click();
		Thread.sleep(25000);
		// Valida os campos obrigatorios
		assertEquals("O campo é obrigatório.",driver.findElement(By.cssSelector("span.wpcf7-not-valid-tip")).getText());
		assertEquals("O campo é obrigatório.",driver.findElement(By.cssSelector("span.wpcf7-form-control-wrap.your-email > span.wpcf7-not-valid-tip")).getText());
		assertEquals("O campo é obrigatório.",driver.findElement(By.cssSelector("span.wpcf7-form-control-wrap.your-subject > span.wpcf7-not-valid-tip")).getText());
		assertEquals("O campo é obrigatório.",driver.findElement(By.cssSelector("span.wpcf7-form-control-wrap.your-message > span.wpcf7-not-valid-tip")).getText());
		assertEquals("Um ou mais campos possuem um erro. Verifique e tente novamente.",driver.findElement(By.xpath("//div[@id='wpcf7-f372-p24-o1']/form/div[2]")).getText());
	}

	@After
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
