package driverManagers;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
import java.util.Properties;

//import java.util.logging.Logger;


public class BaseClass{
    public static final Logger logger = LogManager.getLogger(BaseClass.class);

Properties prop;
    public BaseClass() {
    }
    public WebDriver driver;
    @Before
    public void setup(Scenario scenario) {
//            prop= ConfigReader.getProperties();
//        DriverManager.getDriver().get(prop.getProperty("url"));
//        System.out.println("Initsiating the Browser");
            DriverManager.getInstance().setDriver("chrome");
         driver =  DriverManager.getInstance().getDriver();
         driver.get("https://practicetestautomation.com/practice-test-login");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
         driver.manage().window().maximize();


        scenario.log(scenario.getName() +" - Initsiating the Browser");
        scenario.log((scenario.getName()+" - initializeTest - Step\n"));
        scenario.log(scenario.getName()+" - initializeTest - Before Class");
        scenario.log(scenario.getName()+" - initializeTest - Browser Name - "+ "Chrome");

        if(scenario.isFailed()){

           TakesScreenshot takesScreenshot= (TakesScreenshot)driver;
            File source=takesScreenshot.getScreenshotAs(OutputType.FILE);
//            scenario.attach(source,"image/png","screenshot");
              File destination=new File("target/Screenshots/"+scenario.getName()+".png");
                try {
                    Files.copy(source.toPath(), destination.toPath());
                } catch (IOException e) {
                 throw new RuntimeException(e);
                }
        }
    }

    @After
    public void tearDown(){
        driver.quit();

    }
}
