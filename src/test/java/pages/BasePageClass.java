package pages;

import org.openqa.selenium.WebDriver;

public class BasePageClass {
    public WebDriver driver;
    public BasePageClass(WebDriver driver){
        this.driver = driver;
    }
}
