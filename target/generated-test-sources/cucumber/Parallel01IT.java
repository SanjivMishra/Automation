import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
features = {"F:/Git/Automation/Features/Demo.feature"},
plugin = {"pretty", "json:target/1.json", "html:target/1.html"},
monochrome = true,
 tags = {"@Regression1"}, glue = { "StepDefinitions" })
public class Parallel01IT {
}
