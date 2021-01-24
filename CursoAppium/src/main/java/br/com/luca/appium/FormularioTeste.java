package br.com.luca.appium;

import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.luca.appium.core.DSL;
import br.com.luca.appium.core.DriverFactory;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class FormularioTeste {

	private AndroidDriver<MobileElement> driver; // variavel global
	
	private DSL dsl = new DSL();

	@Before
	public void InicializarAppium() throws MalformedURLException {
		driver = DriverFactory.getDriver();
		
		// Selecionar o formulario
		driver.findElement(By.xpath("//*[@text='Formulário']")).click();
	}

	@After
	public void tearDown() {
		DriverFactory.killDriver();
	}

	@Test
	public void devePreencherCampoTexto() throws MalformedURLException {
		// Escrever o nome
		dsl.escrever(MobileBy.AccessibilityId("nome"), "JOAO");

		// checar nome escrito
		Assert.assertEquals("JOAO", dsl.obterTexto(MobileBy.AccessibilityId("nome")));

	}

	@Test
	public void deveInterargirCombo() throws MalformedURLException {
		// Clicar no combo
		driver.findElement(MobileBy.AccessibilityId("console")).click();

		// Selecione a opção desejadq
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Nintendo Switch']")).click();

		// verificar a opção escolhida
		String text = driver.findElement(By.xpath("//android.widget.Spinner/android.widget.TextView")).getText();
		Assert.assertEquals("Nintendo Switch", text);

	}

	@Test
	public void deveInterargirSwitchCheckbox() throws MalformedURLException {
		// Verificar status dos elementos
		MobileElement check = driver.findElement(By.className("android.widget.CheckBox"));
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(check));

		MobileElement switc = driver.findElement(MobileBy.AccessibilityId("switch"));
		WebDriverWait wait1 = new WebDriverWait(driver, 15);
		wait1.until(ExpectedConditions.visibilityOf(switc));

		Assert.assertTrue(check.getAttribute("checked").equals("false"));
		Assert.assertTrue(switc.getAttribute("checked").equals("true"));

		// clicar nos elementos
		check.click();
		switc.click();

		// verificar os status alterados
		Assert.assertFalse(check.getAttribute("checked").equals("false"));
		Assert.assertFalse(switc.getAttribute("checked").equals("true"));

	}

	@Test
	public void deveResolverDesafio() throws MalformedURLException {

		// Preencher campos data e hora
		WebDriverWait wait = new WebDriverWait(driver, 15);		
		WebElement ediT = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("android.widget.EditText"))));
		ediT.sendKeys("Octavio de Sousa");
//		driver.findElement(By.className("android.widget.EditText")).sendKeys("Octavio de Sousa");
		driver.findElement(By.className("android.widget.CheckBox")).click();
		;
		driver.findElement(By.className("android.widget.Switch")).click();
		driver.findElement(By.className("android.widget.Spinner")).click();
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Nintendo Switch']")).click();

		// clicar no botao salvar
		driver.findElement(By.xpath("//*[@text='SALVAR']")).click();

		// Verificações
		MobileElement nome = driver.findElement(By.xpath("//android.widget.TextView[@text='Nome: Octavio de Sousa']"));
		Assert.assertEquals("Nome: Octavio de Sousa", nome.getText());

		MobileElement combo = driver.findElement(By.xpath("//android.widget.TextView[starts-with(@text,'Console:')]"));
		Assert.assertEquals("Console: switch", combo.getText());

		MobileElement swit = driver.findElement(By.xpath("//android.widget.TextView[starts-with(@text,'Switch:')]"));
		Assert.assertTrue(swit.getText().endsWith("Off"));

		MobileElement chec = driver.findElement(By.xpath("//android.widget.TextView[starts-with(@text,'Checkbox:')]"));
		Assert.assertTrue(chec.getText().endsWith("Marcado"));

	}
}
