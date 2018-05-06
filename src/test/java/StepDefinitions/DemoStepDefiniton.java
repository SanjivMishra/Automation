package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Helpers.DriverWaitUtility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoStepDefiniton extends GlobalStepDefinition{
	
	
	@Given("^I launch the \"([^\"]*)\" page$")
	public void i_launch_the_page(String url) throws Throwable {
	    
		InvokeDriver(url);
		DriverWaitUtility.waitForPageLoad(_driver);
		
	}



}
