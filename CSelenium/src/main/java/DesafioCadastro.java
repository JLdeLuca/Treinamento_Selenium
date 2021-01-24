import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DesafioCadastro {

	private WebDriver driver;
	private DSL dsl;

	@Before
	public void inicializa() {
		driver = new FirefoxDriver();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.manage().window().maximize();
		dsl = new DSL(driver);
	}

	@After
	public void finaliza() {
		driver.quit();
	}

	

	@Test
	public void formularioDesafioCadastro() {
		
		dsl.escreve("elementosForm:nome", "João");
		dsl.escreve("elementosForm:sobrenome", "de Luca");
		dsl.clicarRadioEBotao("elementosForm:sexo:0");
		dsl.clicarRadioEBotao("elementosForm:comidaFavorita:2");
		new Select(driver.findElement(By.id("elementosForm:escolaridade"))).selectByVisibleText("Mestrado");
		new Select(driver.findElement(By.id("elementosForm:esportes"))).selectByVisibleText("Natacao");
		new Select(driver.findElement(By.id("elementosForm:esportes"))).selectByVisibleText("Futebol");

		dsl.clicarRadioEBotao("elementosForm:cadastrar");

		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Cadastrado!"));
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Nome: João"));
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Sobrenome: de Luca"));
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Sexo: Masculino"));
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Comida: Pizza"));
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Escolaridade: mestrado"));
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Esportes: Natacao Futebol"));
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Sugestoes:"));

		Assert.assertEquals("Sobrenome: de Luca", driver.findElement(By.id("descSobrenome")).getText());

		Assert.assertEquals(
				"Cadastrado!\nNome: João\nSobrenome: de Luca\nSexo: Masculino\nComida: Pizza\nEscolaridade: mestrado\nEsportes: Natacao Futebol\nSugestoes:",
				driver.findElement(By.id("resultado")).getText());

		System.out.println(driver.findElement(By.tagName("body")).getText());

	}

	@Test
	public void deveValidarNomeObrigatorio() {
		dsl.clicarRadioEBotao("elementosForm:cadastrar");
		Alert alert = driver.switchTo().alert();
		Assert.assertEquals("Nome eh obrigatorio", alert.getText());
	}

	@Test
	public void deveValidarSobreNomeObrigatorio() {
		dsl.escreve("elementosForm:nome", "João");
		dsl.clicarRadioEBotao("elementosForm:cadastrar");

		Alert alert = driver.switchTo().alert();
		Assert.assertEquals("Sobrenome eh obrigatorio", alert.getText());

	}

	@Test
	public void deveValidarSexoObrigatorio() {
		dsl.escreve("elementosForm:nome", "João");
		dsl.escreve("elementosForm:sobrenome", "de Luca");

		dsl.clicarRadioEBotao("elementosForm:cadastrar");

		Alert alert = driver.switchTo().alert();
		Assert.assertEquals("Sexo eh obrigatorio", alert.getText());


	}

	@Test
	public void deveValidarComidaVegetariana() {
		dsl.escreve("elementosForm:nome", "João");
		dsl.escreve("elementosForm:sobrenome", "de Luca");
		dsl.clicarRadioEBotao("elementosForm:sexo:1");

		dsl.clicarRadioEBotao("elementosForm:comidaFavorita:0");
		dsl.clicarRadioEBotao("elementosForm:comidaFavorita:3");

		dsl.clicarRadioEBotao("elementosForm:cadastrar");

		Alert alert = driver.switchTo().alert();
		Assert.assertEquals("Tem certeza que voce eh vegetariano?", alert.getText());

	}

	@Test
	public void deveValidarEsportistaIndeciso() {
		dsl.escreve("elementosForm:nome", "João");
		dsl.escreve("elementosForm:sobrenome", "de Luca");
		dsl.clicarRadioEBotao("elementosForm:sexo:1");
		dsl.clicarRadioEBotao("elementosForm:comidaFavorita:0");

		Select combo = new Select(driver.findElement(By.id("elementosForm:esportes")));
		combo.selectByVisibleText("Karate");
		combo.selectByVisibleText("O que eh esporte?");

		dsl.clicarRadioEBotao("elementosForm:cadastrar");

		Alert alert = driver.switchTo().alert();
		Assert.assertEquals("Voce faz esporte ou nao?", alert.getText());

	}

}
