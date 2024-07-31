package Hooks;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

import context.driverContext;
import driver.driverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class hooks {

	private WebDriver driver;

	@Before
    public void setUp() throws Exception {
        String browser = driverContext.getBrowser();
        driver = driverFactory.getDriver(browser);
        if (driver == null) {
            throw new IllegalStateException("WebDriver instance could not be created.");
        }
        driverContext.setDriver(driver);
        System.out.println("WebDriver initialized: " + browser);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    }
