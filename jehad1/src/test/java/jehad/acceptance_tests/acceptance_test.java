package jehad.acceptance_tests;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "uses_cases", plugin = {
		"html:target/cucumber/wikipedia.html" }, monochrome = true, snippets = SnippetType.CAMELCASE, glue = {
				"jehad.acceptance_tests" })

public class acceptance_test {

}