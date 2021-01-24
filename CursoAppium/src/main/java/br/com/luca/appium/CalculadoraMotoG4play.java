package br.com.luca.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculadoraMotoG4play {

	@Test
	public void deveSomarDoisValores() throws MalformedURLException, InterruptedException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "0029277694");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability("appPackage", "com.google.android.calculator");
		desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"),
				desiredCapabilities);

		Thread.sleep(2000);
		
		MobileElement el4 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_7");
		el4.click();
		MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("multiplicar");
		el5.click();
		MobileElement el6 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_4");
		el6.click();
		MobileElement el7 = (MobileElement) driver.findElementById("com.google.android.calculator:id/result");
		el7.click();

		System.out.println(el7.getText());

		Assert.assertEquals("28", el7.getText()); // resultado esperado e atual

		driver.quit();

	}

}
