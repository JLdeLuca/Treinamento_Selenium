package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CadastroPages {
	
	static WebDriver driver;
	static CadastroPages cadastroPages;
	
	public CadastroPages(WebDriver driver) {
		this.driver = driver;
	}

	public void preencherCampos() {
		
		WebElement nome = driver.findElement(By.id("FirstName"));
		nome.sendKeys("Joao Luis");
		
		WebElement sobrenome = driver.findElement(By.name("LastName"));
		sobrenome.sendKeys("de Luca");
	
		WebElement email = driver.findElement(By.name("GmailAddress"));
		email.sendKeys("joaoluisdeluca");
			
		
				
		
		WebElement senha = driver.findElement(By.name("Passwd"));
		senha.sendKeys("@Tenta12");
		
		WebElement repetesenha = driver.findElement(By.name("PasswdAgain"));
		repetesenha.sendKeys("@Tenta12");
		
		WebElement dia = driver.findElement(By.name("BirthDay"));
		dia.sendKeys("22");
		
		WebElement mes = driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[1]"));
		mes.click();
		
		WebElement mesdezembro = driver.findElement(By.xpath(".//*[@id=':c']/div"));
		mesdezembro.click();
		
		WebElement ano = driver.findElement(By.name("BirthYear"));
		ano.sendKeys("1950");
	
		WebElement sexo = driver.findElement(By.xpath("//*[@id=\"Gender\"]/div[1]"));
		sexo.click();
		
		WebElement sexoMasculino = driver.findElement(By.xpath("//*[@id=\":f\"]/div")); 
		sexoMasculino.click();
		
		WebElement celular = driver.findElement(By.id("RecoveryPhoneNumber"));
		celular.sendKeys("11 996162980");
		
		WebElement recemail = driver.findElement(By.id("RecoveryEmailAddress"));
		recemail.sendKeys("jlrqluca21@gmail.com");
		
		WebElement Local = driver.findElement(By.id(":i"));
		Local.click();
		
		WebElement lbrasil = driver.findElement(By.xpath("//*[@id=\":j\"]/div"));
		lbrasil.click();
		
		WebElement proximaetapa = driver.findElement(By.id("submitbutton"));
		proximaetapa.click();
		
		WebElement botaodesce = driver.findElement(By.xpath("//*[@id=\"tos-scroll-button\"]/div/img"));
		botaodesce.click();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"iagreebutton\"]")));

		WebElement botaoaceitar = driver.findElement(By.xpath("//*[@id=\"iagreebutton\"]"));
		botaoaceitar.click();
		
				
	}
//	public String validarmensagem() {
//		return driver.findElement(By.id("errormsg_0_GmailAddress")).getText();
//	}
}
