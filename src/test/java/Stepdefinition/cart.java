package Stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class cart {
	@Given("application displays welcome msg")
	public void application_displays_welcome_msg() {
		System.out.println("welcome");
	}

	@Given("users un and psd")
	public void users_un_and_psd() {
		System.out.println("enter username and password");
	}

	@Given("click signin")
	public void click_signin() {
		System.out.println("Signing in");
	}

	@When("user searches for honor")
	public void user_searches_for_honor() {
		System.out.println("searching honor");
	}

	@When("user adding the searched product to cart")
	public void user_adding_the_searched_product_to_cart() {
		System.out.println("Cart display");
	}

	@When("user performing payment process using netbanking")
	public void user_performing_payment_process_using_netbanking() {
		System.out.println("Payment process proceedings");
	}

	@When("user performing logout from online shopping cart")
	public void user_performing_logout_from_online_shopping_cart() {
		System.out.println("added to cart");
	}

}
