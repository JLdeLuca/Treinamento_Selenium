package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/" }, snippets = SnippetType.CAMELCASE, glue = {
		"StepDefinitions" }, plugin = { "pretty", "html:target/cucumber-htmlreport",
				"json:target/cucumber-report1.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html" }, monochrome = true)

public class testRunner {

}


