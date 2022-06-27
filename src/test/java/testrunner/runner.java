package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/feature",
        glue ={"stepdefinition"},
        plugin = {"pretty"},
        monochrome=true
        )

public class runner {
	

}
