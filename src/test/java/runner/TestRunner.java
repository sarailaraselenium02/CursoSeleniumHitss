package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\larasr\\eclipse2-workspace\\tau.cucumber.curse\\src\\test\\java\\feature",
		glue= {"stepDefinitions"},
		plugin= {"pretty","html:test-output"}
)

public class TestRunner {

}
