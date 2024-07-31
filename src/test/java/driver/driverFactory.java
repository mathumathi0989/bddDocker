package driver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class driverFactory {
	public static WebDriver getDriver(String browser) throws MalformedURLException {
		 WebDriver driver = null;
	        try {
	        	ChromeOptions options = new ChromeOptions();
	        	 options.addArguments("--no-sandbox");
	             options.addArguments("--disable-dev-shm-usage");
	            // options.addArguments("--headless"); // Optional
	             options.addArguments("--disable-gpu"); // Optional
	            DesiredCapabilities capabilities = new DesiredCapabilities();
	            capabilities.setBrowserName("chrome");
	             driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), new ChromeOptions());
	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	        }
	        return driver;
	}
}
