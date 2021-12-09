package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature/",
dryRun = false,
 plugin = {"pretty",
	"json:target/cucumber-json-report/cucumber.json"},
glue= "stepDefination"
 ,tags={"@P1"}
)
public class RunTest {

}
