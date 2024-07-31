package Hooks;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

import driver.driverFactory;
import context.driverContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

	 private WebDriver driver;

	    @Before
	    public void setUp() throws MalformedURLException {
	        String browser = System.getProperty("browser", "chrome");
	        driver = driverFactory.getDriver(browser);
	        driverContext.setDriver(driver);
	    }

	    @After
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
}
