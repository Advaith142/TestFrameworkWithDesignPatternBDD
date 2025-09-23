package driverManagers;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;



public class DriverFactory {

    public static BrwoserManager createDriver(String browser) {

        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
//        options.setCapability("strictFileInteractability", true);
         options.setCapability("pageLoadStrategy", PageLoadStrategy.NORMAL);

        switch (browser) {
            case "chrome":
                return new ChromeDriverManager();
            case "firefox":
                return new FireFoxDriverManager();
            case "edge":
//                return new EdgeDriver();
            case "safari":
//                return new SafariDriver();
            default:
               throw new IllegalArgumentException("no matching browser");
        }

    }
}
