package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"@target/failed.txt"},
        glue = { "Steps","BaseClass"},
        tags = "@Login",
        plugin = {"pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true

)
public class FailedRunner extends AbstractTestNGCucumberTests {
}
