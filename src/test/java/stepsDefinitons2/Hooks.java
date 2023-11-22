package stepsDefinitons2;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooks {

	@Before("@smoke")
	public void setupForSmokeTests2() {
		System.out.println("Setting up for Smoke Tests 2");
		// Code to set up data or perform setup tasks for smoke tests
	}
	
	@Before("@regression")
	public void setupForSmokeTests3() {
		System.out.println("Setting up for Smoke Tests 3");
		// Code to set up data or perform setup tasks for smoke tests
	}

	@Given("^the user is on the login page$")
	public void userIsOnLoginPage() {
		// Implementation to navigate to the login page
		System.out.println("User is on the login page");
	}

	@When("^the user enters valid username and password$")
	public void userEntersValidCredentials() {
		// Implementation to enter valid credentials
		System.out.println("User enters valid username and password");
	}

	@Then("^the user should be logged in successfully$")
	public void userLoggedInSuccessfully() {
		// Implementation to verify successful login
		System.out.println("User is logged in successfully");
	}

	@When("^the user enters invalid username and password$")
	public void userEntersInvalidCredentials() {
		// Implementation to enter invalid credentials
		System.out.println("User enters invalid username and password");
	}

	@Then("^the user should see an error message$")
	public void userShouldSeeErrorMessage() {
		// Implementation to verify the error message
		System.out.println("User sees an error message");
	}

	@After
	public void tearDown(Scenario scenario) {
		System.out.println("Tearing down after scenario: " + scenario.getName());

	}

}
