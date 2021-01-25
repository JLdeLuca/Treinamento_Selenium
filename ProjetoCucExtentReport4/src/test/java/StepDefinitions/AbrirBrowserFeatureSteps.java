package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AbrirBrowserFeatureSteps {

	WebDriver driver;

	@Given("^eu acesso o site \"([^\"]*)\"$")
	public void euAcessoOSite(String arg1) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(arg1);
		
	}

	@Then("^entro na pagina principal$")
	public void entroNaPaginaPrincipal() {
		driver.quit();
	}

}
