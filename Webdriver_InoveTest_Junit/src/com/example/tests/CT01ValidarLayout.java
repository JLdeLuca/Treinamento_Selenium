package com.example.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
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


public class CT01ValidarLayout {

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
	public void testCT01ValidarLayout() throws Exception {
		// Abrir o site
		driver.get(baseUrl + "/contato/");
		// Valido o layout de subtitulos
		assertEquals("Envie uma mensagem", driver.findElement(By.cssSelector("h1")).getText());
		assertEquals("Demais contatos", driver.findElement(By.xpath("//div[2]/div/div/div/div/h1")).getText());
		// Valido layout de campos na tela
		assertTrue(isElementPresent(By.cssSelector("label")));
		assertTrue(isElementPresent(By.xpath("//div[@id='wpcf7-f372-p24-o1']/form/p[2]/label")));
		assertTrue(isElementPresent(By.xpath("//div[@id='wpcf7-f372-p24-o1']/form/p[3]/label")));
		assertTrue(isElementPresent(By.xpath("//div[@id='wpcf7-f372-p24-o1']/form/p[4]/label")));
		assertTrue(isElementPresent(By.cssSelector("input.wpcf7-form-control.wpcf7-submit")));
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

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
