package Stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Signup {
	@Given("user opens signup page")
	public void user_opens_signup_page() {
		System.out.println("opens signup pg");
	}

	@When("user enters fn as {string}")
	public void user_enters_fn_as(String fn) {
		System.out.println("First name"+fn);
	}

	@When("user enters ln as {string}")
	public void user_enters_ln_as(String ln) {
		System.out.println("Last name"+ln);
	}

	@When("user enters d as {string}")
	public void user_enters_d_as(String d) {
		System.out.println("DOB is"+d);
	}

	@When("user enters pwd as {string}")
	public void user_enters_pwd_as(String pwd) {
		System.out.println("password"+pwd);
	}

	@When("user enters cpwd as {string}")
	public void user_enters_cpwd_as(String cpwd) {
		System.out.println("confirm password"+cpwd);
	}

	@Then("click signup button")
	public void click_signup_button() {
		System.out.println("click signup");
	}

	@Then("verify signup success message")
	public void verify_signup_success_message() {
		System.out.println("Success msg displayed");
	}


}
