package org.stepdefination;

import org.pages.RegistrationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {
	RegistrationPage lg=new RegistrationPage();
	@Given("User is on the registration page")
	public void user_is_on_the_registration_page() {
	
		lg.register();
	}

	@When("User enters valid personal details")
	public void user_enters_valid_personal_details() {
	   lg.personalDetails();
	}

	@When("submits the registration form")
	public void submits_the_registration_form() {
	    lg.submitRegistration();
	}

	@Then("User should be registered successfully")
	public void user_should_be_registered_successfully() {
	    lg.successSubmit();
	}

	@Then("redirected to the homepage")
	public void redirected_to_the_homepage() {
	    lg.redirecttoHomePage();
	}

	@When("User enters an already registered email")
	public void user_enters_an_already_registered_email() {
	    lg.personalDetails();
	    lg.submitRegistration();
	    lg.alreadyRegister();
	}

}
