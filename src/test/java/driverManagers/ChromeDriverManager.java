package driverManagers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager implements BrwoserManager {
    WebDriver driver;
    @Override
    public WebDriver getDriver() {
        return new ChromeDriver();
    }
}
