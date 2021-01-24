
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TesteCampoTreinamento {

	private WebDriver driver;
	private DSL dsl;
	
	@Before
	public void inicial() {
		driver = new FirefoxDriver();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.manage().window().maximize();
		dsl = new DSL(driver);	
	}
	@After
	public void Finaliza() {
		driver.quit();
	}
		
	@Test	
	public void testeIncluirTexto() {
		dsl.escreve("elementosForm:nome", "Teste de Escrita");
		Assert.assertEquals("Teste de Escrita", dsl.obterValorCampo("elementosForm:nome"));
	}

	
	@Test
	public void deveInteragircomTextArea() {
		dsl.escreve("elementosForm:sugestoes", "teste area\nnova linha\noutralinha\n ate o final");
		Assert.assertEquals("teste area\nnova linha\noutralinha\n ate o final", dsl.obterValorCampo("elementosForm:sugestoes"));
	}

	@Test
	public void deveInteragircomRadioButton() {
		dsl.clicarRadioEBotao("elementosForm:sexo:0");
		Assert.assertTrue(dsl.isRadioMarcado("elementosForm:sexo:0"));
	}

	@Test
	public void deveInteragircomCheckBox() {
		dsl.clicarRadioEBotao("elementosForm:comidaFavorita:2");
		Assert.assertTrue(dsl.isRadioMarcado("elementosForm:comidaFavorita:2"));
	}

	@Test
	public void deveInteragircomCombo() {
		dsl.selecionarCampo("elementosForm:escolaridade", "2o grau completo");
		Assert.assertEquals("2o grau completo", dsl.obterValorCombo("elementosForm:escolaridade"));
	}

	@Test
	public void deveVerificarValoresCombo() {
		WebElement element = driver.findElement(By.id("elementosForm:escolaridade"));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		Assert.assertEquals(8, options.size());
		boolean encontrou = false;
		for (WebElement option : options) {
			if (option.getText().equals("Mestrado")) {
				encontrou = true;
				break;
			}
		}
		Assert.assertTrue(encontrou);
	}

	@Test
	public void deveVerificarValoresComboMultiplo() {
		dsl.selecionarCampo("elementosForm:esportes", "Natacao");
		dsl.selecionarCampo("elementosForm:esportes", "Corrida");
		dsl.selecionarCampo("elementosForm:esportes", "O que eh esporte?");

		WebElement element = driver.findElement(By.id("elementosForm:esportes"));
		Select combo = new Select(element);
		List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
		Assert.assertEquals(3, allSelectedOptions.size());

		combo.deselectByVisibleText("Corrida");
		allSelectedOptions = combo.getAllSelectedOptions();
		Assert.assertEquals(2, allSelectedOptions.size());
	}

	@Test
	public void deveInteragirComBotoes() {
		dsl.clicarRadioEBotao("buttonSimple");
		WebElement botao = driver.findElement(By.id("buttonSimple"));
		Assert.assertEquals("Obrigado!", botao.getAttribute("value"));
	}

	@Test
	public void deveInteragirComLinks() {
		dsl.clicarLink("Voltar");
		Assert.assertEquals("Voltou!", dsl.obterTexto("resultado"));
	}

	@Test
	public void deveBuscarTextosNaPagina() {
//		driver.findElement(By.tagName("body"));
//		System.out.println(driver.findElement(By.tagName("body")).getText());

// 		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Campo de Treinamento"));
		Assert.assertEquals("Campo de Treinamento", dsl.obterTexto(By.tagName("h3")));
		Assert.assertEquals("Cuidado onde clica, muitas armadilhas...", dsl.obterTexto(By.className("facilAchar")));
	}

}
