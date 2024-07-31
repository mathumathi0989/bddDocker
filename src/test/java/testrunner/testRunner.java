package testrunner;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import context.driverContext;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(plugin= {"pretty", "html:target/cucumber-reports/dsalgo.html"},
features={"src/test/resources/features/feature1.feature"},glue= "stepdefinition")
public class testRunner extends AbstractTestNGCucumberTests {

	 @Parameters("browser")
	    @BeforeClass
	    public void setUp(String browser) {
	        driverContext.setBrowser(browser);
	    }
	 
}
