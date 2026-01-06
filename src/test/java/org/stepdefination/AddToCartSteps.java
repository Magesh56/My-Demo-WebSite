package org.stepdefination;

import org.pages.AddtoCartPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartSteps {
	AddtoCartPage ag=new AddtoCartPage();
	@Given("User is on the product details page")
	public void user_is_on_the_product_details_page() {
	     ag.productDetail();
	}

	@When("User clicks Add to Cart")
	public void user_clicks_Add_to_Cart() {
		 ag.addtoCart();
	}

	@Then("Product should be added to the cart")
	public void product_should_be_added_to_the_cart() {
		ag.productaddedtoCart();
	}

	@Then("Cart count should increase")
	public void cart_count_should_increase() {
		ag.increaseCartCount();
	}

	@Given("User has items in the cart")
	public void user_has_items_in_the_cart() {
	   ag.userInCartPage();
	}

	@When("User removes a product")
	public void user_removes_a_product() {
	    ag.userRemoveProduct();
	}

	@Then("Product should no longer appear in the cart")
	public void product_should_no_longer_appear_in_the_cart() {
	   ag.apperanceCartPage();
	}


}
