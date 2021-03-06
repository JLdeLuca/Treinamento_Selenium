import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DSL {

	private WebDriver driver;
	private WebElement element;

	public DSL(WebDriver driver) {
		this.driver = driver;
	}

	public void escreve(String id_campo, String texto) {
		driver.findElement(By.id(id_campo)).sendKeys(texto);
	}

	public String obterValorCampo(String id_campo) {
		return driver.findElement(By.id(id_campo)).getAttribute("value");
	}
	public void clicarRadioEBotao(String id) {
		driver.findElement(By.id(id)).click();
	}
	public boolean isRadioMarcado(String id) {
		return driver.findElement(By.id(id)).isSelected();
	}
	public void selecionarCampo(String id, String valor) {
		element = driver.findElement(By.id(id));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}
	public String obterValorCombo(String id) {
		element = driver.findElement(By.id(id));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}
	public void clicarLink(String id) {
		driver.findElement(By.linkText(id)).click();
	}
	public String obterTexto(By by) {
		return driver.findElement(by).getText();
	}
	public String obterTexto(String id) {
		return obterTexto(By.id(id));
	}
	
}
