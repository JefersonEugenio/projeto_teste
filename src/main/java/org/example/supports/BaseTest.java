package org.example.supports;

import org.example.webDrivers.DriverFactory;
import org.example.webDrivers.DriverManager;
import org.example.webDrivers.Drivers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;


import static org.example.webDrivers.DriverFactory.driver;
import static org.example.webDrivers.DriverFactory.getBrowser;

public class BaseTest extends DriverFactory {

    private static String url = "https://the-internet.herokuapp.com/add_remove_elements/";
    @BeforeAll
    public static void setUp(){
        driver = getBrowser(Drivers.CHROME);
        DriverManager.setDriver(driver);
        DriverManager.getDriver().get(url);
        driver.manage().window().maximize();
    }

    @AfterAll
    public static void tearDown(){
        DriverManager.quit();
    }
}