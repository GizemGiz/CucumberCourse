package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions (

        tags = "@Regression",  // it is going to execute only regression scenarios.
        // if we are put regression and smoke.it will execute both.
        // it can be executing multiple tags
        features = {"src/main/resources/FeatureFile"},
        glue = {"StepDefinition"},
        plugin = {"html:target/report/RegressionTestResult.html"}
)




public class TestRunnerAlFeatureFiles extends AbstractTestNGCucumberTests {}
