package driverManagers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverManager implements BrwoserManager {
    WebDriver driver;
    @Override
    public WebDriver getDriver() {
        return new FirefoxDriver();
    }
}
