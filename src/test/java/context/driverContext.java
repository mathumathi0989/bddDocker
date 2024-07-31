package context;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverContext {

	 private static WebDriver driver;
	private static String browser;

	 public static void setDriver(WebDriver driver) {
	        driverContext.driver = driver;
	    }

	    public static WebDriver getDriver() {
	        return driver;
	    }

	    public static void setBrowser(String browser) {
	        driverContext.browser = browser;
	    }

	    public static String getBrowser() {
	        return browser;
	    }

	    // Method to initialize WebDriver based on browser type
	    public static WebDriver createDriver() {
	        if (driver == null) {
	            switch (browser.toLowerCase()) {
	                case "chrome":
	                    System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	                    driver = new ChromeDriver();
	                    break;
	                case "firefox":
	                    System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
	                    driver = new FirefoxDriver();
	                    break;
	                default:
	                    throw new IllegalArgumentException("Browser not supported.");
	            }
	        }
	        return driver;
	    }
	    
}
