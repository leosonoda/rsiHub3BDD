package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/GherkinsCucumber", 
glue={"steps"},
snippets = SnippetType.CAMELCASE,
monochrome = true
)

public class testRunner {

}
