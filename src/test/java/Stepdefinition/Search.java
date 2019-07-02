package Stepdefinition;

import java.util.List;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Search {

@When("user searches for products")
public void user_searches_for_products(DataTable productsdata) {
	List<String> productsname=productsdata.asList();
	for(String products:productsname)
	{
		System.out.println(products);
	}
}

@When("verify products displayed")
public void verify_products_displayed() {
	System.out.println("verify products");
}

@Then("close application")
public void close_application() {
	System.out.println("closed");
}

}
