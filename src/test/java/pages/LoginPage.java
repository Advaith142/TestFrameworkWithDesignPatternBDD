package pages;




import driverManagers.DriverManager;
import driverManagers.ExplicitWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class LoginPage extends BasePageClass

{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public By usernameField = By.id("username");
    public  By passwordField = By.id("password");
    public  By loginButton = By.id("submit");
    public By dashboard = By.className("post-title");
    public By errorText = By.id("error");

    ExplicitWait explicitWait = new ExplicitWait(driver, Duration.ofSeconds(10));

    public void verifyOnloginPage() {
        driver.findElement(usernameField).isDisplayed();
        driver.findElement(passwordField).isDisplayed();
        System.out.println("User is on  Login page is ");
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
        System.out.println("entered username is "+username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
        System.out.println("entered password is "+password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
        System.out.println(" clicked on loginButton");
    }

    public boolean isDashboardDisplayed() {
        WebElement dashboardElement = driver.findElement(dashboard);
        explicitWait.applyWait(driver,dashboardElement);
        System.out.println(" successfully logged in and Dashboard Displayed");
        return dashboardElement.isDisplayed();

    }

    public boolean isErrorMessagedDisplayed(String text) {
        boolean status=false;
        WebElement dashboardElement = driver.findElement(errorText);
        String actual = dashboardElement.getText();
        if(actual.equals(text)) {
            status = true;
            System.out.println(text);
        }

        return status;
    }



}

