package org.stepdefination;

import org.pages.ProductPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductSteps {

	@Given("User is on the homepage")
	public void user_is_on_the_homepage() {
		ProductPage.homePage();
		System.out.println("ok done");
	}

	@When("User searches for Laptop")
	public void user_searches_for_Laptop() {
		ProductPage.searchProduct();
	}

	@Then("Relevant products should be displayed")
	public void relevant_products_should_be_displayed() {
		ProductPage.releventProduct();
	}

	@Given("User is on the product listing page")
	public void user_is_on_the_product_listing_page() {
		ProductPage.searchProduct();
	}

	@When("User applies filter Electronics")
	public void user_applies_filter_electronics() {
		ProductPage.electronicPage();
	}

	@Then("Only electronic products should be displayed")
	public void only_electronic_products_should_be_displayed() {
		ProductPage.valaditElectronicProduct();
	}

	@When("User sorts products by Price Low to High")
	public void user_sorts_products_by_price_low_to_high() {
		ProductPage.applyFilter();
	}

	@Then("Products should be displayed in ascending order of price")
	public void products_should_be_displayed_in_ascending_order_of_price() {
		ProductPage.asscending();
	}

}
