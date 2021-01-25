import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/",
		tags = {"~@ignore"},
		plugin = {"pretty", "html:target/report-html", "json:target/report.json"}, //mostrar a execu��o cenarios e steps
		monochrome = false, //melhorar o visual - usando o ansicon
		snippets = SnippetType.CAMELCASE, // deixar o metodo sem underline
		dryRun = false, //pula os cen�rios 
		strict = false //mostra falho se tiver outro cenario que n�o foi efetuado
		)

public class RunnerTest {

}
