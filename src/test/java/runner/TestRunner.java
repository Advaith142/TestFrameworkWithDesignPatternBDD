package runner;


//import cucumber.api.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.DataProvider;


@CucumberOptions(

            features = "src/test/resources/features",
            glue = { "Steps","driverManagers.BaseClass"},
            plugin = {"pretty", "html:target/cucumber-reports.html",
                    "json:target/cucumber-reports/cucumber.json",
                    "junit:target/cucumber-reports/cucumber.xml"},
            monochrome = true,
            tags = "@Login"
    )
public class TestRunner  extends AbstractTestNGCucumberTests {

    TestNGCucumberRunner testNGCucumberRunner;
//    @DataProvider(name="Login")
    public Object[][] scenarios()
    {
        if(testNGCucumberRunner == null){
            testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
        }
        return testNGCucumberRunner.provideScenarios();
    }
}
