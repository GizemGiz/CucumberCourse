package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/main/resources/FeatureFile/Login.feature"},// Location of Feature files we want to execute
        glue = {"StepDefinition"} // glue is for StepDefinition


)



public class TestRunner extends AbstractTestNGCucumberTests {
    // we are gonna execute multiple feature files
}
