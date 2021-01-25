import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class ProjetoCombo_steps {

	WebDriver driver;
	int local = 0;

	@Dado("^uma localidade$")
	public void uma_localidade(DataTable arg1) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> data = arg1.raw();
		

		for (int i = 1; i < 5; i++) {

			System.out.println(data.get(i));
			driver = new ChromeDriver();
			driver.get("https://www.nextel.com.br/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

		
			
			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div[2]/div[1]/div/div[2]/button/div/p[2]/i")).click();
			
			switch (i) {

			case 1:
				// São Paulo
				local = 1;
				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div[2]/div[1]/div/div[2]/div/div[1]/button")).click();
				
				break;
			case 2:
				// Rio de Janeiro
				local = 2;
				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div[2]/div[1]/div/div[2]/div/div[2]/button")).click();
				
				break;
			case 3:
				// Dsitrito Federal
				local = 3;
				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div[2]/div[1]/div/div[2]/div/div[3]/button")).click();
				
				break;
			case 4:
				// Outros
				local = 4;
				driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div[2]/div[1]/div/div[2]/div/div[4]/button")).click();
				
				break;

			}
//		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Você está em:'])[1]/following::i[1]")).click();
//		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Você está em:'])[1]/following::button[5]")).click();
//		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Rio de Janeiro'])[2]/following::button[1]")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sou cliente'])[2]/following::button[1]")).click();

//		driver.findElement(By.cssSelector(".right-absolute")).click();
//	    driver.findElement(By.cssSelector(".show > div:nth-child(3) > .dropdown-item")).click();
//	    driver.findElement(By.cssSelector(".nmodalSegmentation-btn-customer-not")).click();

		}
	}
	
	@Quando("^entro$")
	public void entro() {
	}

	@Entao("^eu seleciono que não sou cliente$")
	public void euSelecionoQueNãoSouCliente() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div/div[2]/div[3]/button")).click();

		Thread.sleep(2000);
		driver.quit();
	}

}
