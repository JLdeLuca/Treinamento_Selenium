package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroPages {
	
	static WebDriver driver;
	static CadastroPages cadastroPages;
	
	public CadastroPages(WebDriver driver) {
		CadastroPages.driver = driver;
	}

	public void preencherCampos() {
		
		WebElement nome = driver.findElement(By.id("firstName"));
		nome.sendKeys("Joao Luis");
		
		WebElement sobrenome = driver.findElement(By.name("lastName"));
		sobrenome.sendKeys("de Luca");
	
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("joaoluisdeluca123");
				
		WebElement senha = driver.findElement(By.name("Passwd"));
		senha.sendKeys("@Tenta12");
		
		WebElement repetesenha = driver.findElement(By.name("ConfirmPasswd"));
		repetesenha.sendKeys("@Tenta12");

		WebElement botaoproximo = driver.findElement(By.xpath("//*[@id='accountDetailsNext']/content/span")); 
		botaoproximo.click();

		WebElement telefone = driver.findElement(By.id("phoneNumberId"));
		telefone.sendKeys("5511996162980");
		telefone.click();
		
		WebElement botaoproximo2 = driver.findElement(By.xpath("//*[@id='gradsIdvPhoneNext']/content/span"));
		botaoproximo2.click();
		
		WebElement dia = driver.findElement(By.name("day"));
		dia.sendKeys("22");
		
		WebElement mes = driver.findElement(By.xpath(".//*[@id='day']/div[1]"));
		mes.click();
		
		WebElement mesdezembro = driver.findElement(By.xpath(".//*[@id=':c']/div"));
		mesdezembro.click();
		
		WebElement ano = driver.findElement(By.name("year"));
		ano.sendKeys("1950");
	
		WebElement sexo = driver.findElement(By.xpath("//*[@id=\"gender\"]/div[1]"));
		sexo.click();

					
		WebElement botaopersonal = driver.findElement(By.xpath("//*[@id='personalDetailsNext']/content/span"));
		botaopersonal.click();
		
		WebElement contratopriva = driver.findElement(By.xpath("//*[@id='view_container']/form/div[2]/div/div/div/div[1]/div/div/content/span/svg"));
		contratopriva.click();
		contratopriva.click();
		contratopriva.click();
				
		WebElement concordo = driver.findElement(By.xpath("//*[@id='termsofserviceNext']/content/span"));
		concordo.click();
		
		WebElement fecharconta = driver.findElement(By.xpath("//*[@id='gb']/div[2]/div[3]/div/div[2]/div/a"));
		fecharconta.click();
		
		WebElement sairconta = driver.findElement(By.xpath("//*[@id='gb_71']"));
		sairconta.click();
		
		
//		WebElement sexoMasculino = driver.findElement(By.xpath("//*[@id=\":f\"]/div")); 
//		sexoMasculino.click();
		
//		WebElement celular = driver.findElement(By.id("RecoveryPhoneNumber"));
//		celular.sendKeys("11 996162980");
		
//		WebElement recemail = driver.findElement(By.id("RecoveryEmailAddress"));
//		recemail.sendKeys("jlrqluca21@gmail.com");
		
//		WebElement Local = driver.findElement(By.id(":i"));
//		Local.click();
		
//		WebElement lbrasil = driver.findElement(By.xpath("//*[@id=\":j\"]/div"));
//		lbrasil.click();
		
//		WebElement proximaetapa = driver.findElement(By.id("submitbutton"));
//		proximaetapa.click();
		
//		WebElement botaodesce = driver.findElement(By.xpath("//*[@id=\"tos-scroll-button\"]/div/img"));
//		botaodesce.click();
		
//		WebDriverWait wait = new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"iagreebutton\"]")));

//		WebElement botaoaceitar = driver.findElement(By.xpath("//*[@id=\"iagreebutton\"]"));
//		botaoaceitar.click();
		
				
	}
//	public String validarmensagem() {
//		return driver.findElement(By.id("errormsg_0_GmailAddress")).getText();
//	}
}
