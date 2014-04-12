package nl.rdj.promoprofs.regression.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "nl.rdj.promoprofs.regression.products"
)
public class RunRegressionIT {
    // Run all features during the maven integration-test / verify phase
}
