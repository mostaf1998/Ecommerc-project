package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = "src/main/resources/Feature",
                 glue = {"org.example.stepDefinitions"},
                 tags = "@smoke"


        )

public class Runner extends  AbstractTestNGCucumberTests {

}
