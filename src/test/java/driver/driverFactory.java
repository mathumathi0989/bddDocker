package driver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class driverFactory {
	public static WebDriver getDriver(String browser) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        switch (browser.toLowerCase()) {
            case "firefox":
                capabilities.setBrowserName("firefox");
                break;
            case "chrome":
            default:
                capabilities.setBrowserName("chrome");
                break;
        }
        return new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
    }
}
