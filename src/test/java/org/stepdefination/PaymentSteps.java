package org.stepdefination;

import org.pages.PaymentPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentSteps {
	
	PaymentPage p=new PaymentPage();
	
	@Given("User has into items in the cart")
	public void user_has_into_items_in_the_cart() {
	    p.cartPage();
	}
	
	@When("User proceeds to checkout")
	public void user_proceeds_to_checkout() {
		p.checkout();
	   
	}
	@When("enters valid shipping address and payment details")
	public void enters_valid_shipping_address_and_payment_details() {
		p.enterDetails();
	    
	}
	@Then("Order confirmation page should be displayed")
	public void order_confirmation_page_should_be_displayed() {
		p.conformOrder();
	   
	}
	
	@When("User enters invalid card details")
	public void user_enters_invalid_card_details() {
	   p.invalidCard();
	}


}
