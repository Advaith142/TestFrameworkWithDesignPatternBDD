package Steps;

import driverManagers.DriverManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.BasePageClass;
import pages.LoginPage;



public class LoginSteps {

    public WebDriver driver;
    LoginPage loginPage;
    BasePageClass basePage;



    public LoginSteps() {
        driver =  DriverManager.getInstance().getDriver();
        loginPage = new LoginPage(driver);
        basePage=new BasePageClass(driver);

    }

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
//        driver.get("https://practicetestautomation.com/practice-test-login/");
        loginPage.verifyOnloginPage();
       System.out.println( " Navigated to login page");

    }

    @When("I enter valid {string} and {string}")
    public void i_enter_valid_and(String string, String string2) {
        loginPage.enterUsername(string);
        loginPage.enterPassword(string2);
        System.out.println(" Successfully  entered username and password");
    }

    @When("I click the login button")
    public void i_click_the_login_button() {
        loginPage.clickLogin();
        System.out.println(" Successfully  clicked loginPage");
    }

    @Then("I should see the dashboard page")
    public void i_should_see_the_dashboard_page() {
      Assert.assertTrue(loginPage.isDashboardDisplayed());
        System.out.println(" Dashboard is  Displayed");
    }

    @Then("Verify error message text is {string}")
    public void verify_error_message_text_is(String string) {
        Assert.assertTrue (loginPage.isErrorMessagedDisplayed(string));
        System.out.println(" error message text is is  Displayed");
    }
}
