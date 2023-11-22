package stepsDefinitons2;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features2",
    glue = {"com.example.steps", "com.example.hooks"},
    plugin = {"pretty", "html:target/cucumber-reports"}
)
public class HooksTestRunner {

	
}
