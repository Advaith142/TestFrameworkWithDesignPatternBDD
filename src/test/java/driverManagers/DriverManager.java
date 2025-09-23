package driverManagers;

import org.openqa.selenium.WebDriver;



public  class DriverManager {
    private static DriverManager instance;
    private  WebDriver driver;
    private DriverManager() {

    }

    public static synchronized DriverManager getInstance() {
        if (instance == null) {
            instance = new DriverManager();

        }
        return instance;
    }


    public void setDriver(String browser) {

       driver=  DriverFactory.createDriver(browser).getDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }
}


