package co.uk.zoopla.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/co/uk/zoopla/features"},
        plugin = {"pretty", "json:target/report.json",
                "de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"},
        glue = {"co/uk/zoopla/hooks", "co/uk/zoopla/stepDefinitions"},
        tags = {"not @ignore"}
)
public class TestRunner {
}
