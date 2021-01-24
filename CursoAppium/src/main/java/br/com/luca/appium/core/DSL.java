package br.com.luca.appium.core;

import static br.com.luca.appium.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class DSL {

	public void escrever(By by, String texto) {
		getDriver().findElement(by).sendKeys(texto);
	}

	public String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}
}
