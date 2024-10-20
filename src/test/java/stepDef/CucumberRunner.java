package stepDef;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/featureFiles"},
        glue = {"stepDef"},
        tags = {"@smoke"}
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
