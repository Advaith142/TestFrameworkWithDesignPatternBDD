package driverManagers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait implements WaitStrategy {
    public ExplicitWait(WebDriver driver, Duration duration) {
    }

    public void applyWait(WebDriver driver, WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.visibilityOf(element));
    }
}
