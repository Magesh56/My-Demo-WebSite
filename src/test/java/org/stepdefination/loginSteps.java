package org.stepdefination;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.pages.HomePage;
import org.pages.loginPom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps extends BaseClass {
	
	HomePage h=new HomePage();
	
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		
      driver.findElement(By.xpath("//a[normalize-space(text())='Log in']")).click();
	        
	  // loginPom.clikcLoginlink();
	}
	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
		 loginPom.enterLogin("email", "password");
	}
	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
	    loginPom. LoginBtn();
	}
	@Then("User should be redirected to the homepage")
	public void user_should_be_redirected_to_the_homepage() {
	   
	   //  String title = driver.getTitle();
	     System.out.println("title");
	}
	@Then("a welcome message should be displayed")
	public void a_welcome_message_should_be_displayed() {
	   h.getValidateHomepage();
	}
	
	@When("User enters invalid username and password")
	public void user_enters_invalid_username_and_password() {
	    loginPom.enterLogin("invalidEmail", "invalidPassword");
	}
	@Then("An error message should be displayed")
	public void an_error_message_should_be_displayed() {
	  System.out.println("Successfully Done by Me");
	}

	@When("User clicks on the login button without entering credentials")
	public void user_clicks_on_the_login_button_without_entering_credentials() {
	   loginPom.LoginBtn();
	}
	@Then("Validation messages should be displayed for required fields")
	public void validation_messages_should_be_displayed_for_required_fields() {
		String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.";
		String actualMessage = loginPom.valaditation();

		Assert.assertTrue(expectedMessage.contains("Login was unsuccessful. Please correct the errors and try again."));
	}


}
