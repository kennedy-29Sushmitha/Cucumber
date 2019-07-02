package Stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	@Given("user opens login page in newtours application")
	public void user_opens_login_page_in_newtours_application() {
	    // Write code here that turns the phrase above into concrete actions
	  
	    System.out.println("User opened newtours login app");
	}

	@When("user enter username as {string} and password as {string}")
	public void user_enter_username_as_and_password_as(String string, String string2) {
	    System.out.println("Username and password is entered");
	}

	@When("click Submit button")
	public void click_Submit_button() {
	    System.out.println("Clicked on submit button");
	}

	@Then("verify login success")
	public void verify_login_success() {
	    System.out.println("login successful");

	}



}
