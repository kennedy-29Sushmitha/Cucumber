package Stepdefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class Login2 {
	@Given("open newtours app")
	public void open_newtours_app() {
		System.out.println("User opened newtours");
	}

	@When("user enter un as {string} And psd as {string}")
	public void user_enter_un_as_And_psd_as(String un , String psd) {
		System.out.println("username"+un+" password "+psd);

	}

	@When("click Submit login form")
	public void click_Submit_login_form() {
		System.out.println("Submitted");
	}

	@Then("verify pass")
	public void verify_pass() {
		System.out.println("PASSED");
	}



}
