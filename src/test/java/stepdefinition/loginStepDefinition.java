package stepdefinition;

import org.openqa.selenium.WebDriver;
import context.driverContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDefinition {

	  private WebDriver driver = driverContext.getDriver();
	
	@Given("Go to login page")
	public void go_to_login_page() {
	   System.out.println("Login page displayed");
	   driver.get("http://google.com");
	}
	@When("I enter username and password")
	public void i_enter_username_and_password() {
		System.out.println("Entered username and password");
	}
	@When("click on login button")
	public void click_on_login_button() {
		System.out.println("Login button clicked");
	}
	@Then("dashboard page appears")
	public void dashboard_page_appears() {
		System.out.println("Dashboard page displayed");
	}

	
}
