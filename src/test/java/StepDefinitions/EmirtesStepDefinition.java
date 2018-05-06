package StepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Helpers.DriverWaitUtility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmirtesStepDefinition extends GlobalStepDefinition {

	@Given("^that Bill has decided to check available flights in \"([^\"]*)\"$")
	public void that_Bill_has_decided_to_check_available_flights_in(String url)
			throws Throwable {

		InvokeDriver(url);
		DriverWaitUtility.waitForPageLoad(_driver);

	}
	
	@When("^he looks at a return trip from \"([^\"]*)\" to \"([^\"]*)\" leaving one week from now$")
	public void he_looks_at_a_return_trip_from_to_leaving_one_week_from_now(String src, String des) throws Throwable {
	  

		DriverWaitUtility.waitForElementClickable(_driver, "//*[@id='BE_flight_arrival_city']");
		_driver.findElement(By.id("BE_flight_origin_city")).click();
		_driver.findElement(By.id("BE_flight_origin_city")).clear();
		_driver.findElement(By.id("BE_flight_origin_city")).sendKeys(src);
		Thread.sleep(3000);
		
		DriverWaitUtility.waitForElementClickable(_driver, "//p[contains(.,'Dubai')]");
		_driver.findElement(By.xpath("//p[contains(.,'Dubai')]")).click();
		DriverWaitUtility.waitForRequestsToComplete(_driver);
		
		_driver.findElement(By.id("BE_flight_arrival_city")).click();
		_driver.findElement(By.id("BE_flight_arrival_city")).clear();
		_driver.findElement(By.id("BE_flight_arrival_city")).sendKeys(des);
		Thread.sleep(3000);
		DriverWaitUtility.waitForElementClickable(_driver, "//p[contains(.,'London')]");
		
		_driver.findElement(By.xpath("//p[contains(.,'London')]")).click();
		DriverWaitUtility.waitForRequestsToComplete(_driver);
	}


	@Then("^he should be shown the cheapest return ticket from DXB to LHR$")
	public void he_should_be_shown_the_cheapest_return_ticket_from_DXB_to_LHR()
			throws Throwable {
		
		WebElement DatePicker1 = _driver.findElement(By.xpath("//input[@class='BE_flight_origin_date']"));
		DatePicker1.click();
		WebElement from = _driver.findElement(By.xpath("//td[@id='06/05/2018']"));
		from.click();
		
		DriverWaitUtility.waitForRequestsToComplete(_driver);
		
		WebElement DatePicker2 = _driver.findElement(By.xpath("//input[@class='BE_flight_arrival_date']"));
		DatePicker2.click();
		WebElement to = _driver.findElement(By.xpath("//td[@id='13/05/2018']"));
		to.click();
		
		_driver.findElement(By.id("BE_flight_flsearch_btn")).click();
		DriverWaitUtility.waitForPageLoad(_driver);
			
		}
		

	

}
