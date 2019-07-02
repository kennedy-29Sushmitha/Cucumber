package Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loggg {
	WebDriver driver;
	@Given("navigate to home page")
	public void navigate_to_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("user enters us as {string} and user enters pd as {string}")
	public void user_enters_us_as_and_user_enters_pd_as(String username, String passwd) {
		Pageobject loginpage=PageFactory.initElements(driver, Pageobject.class);
		Pageobject.un.sendKeys("lalitha");
		Pageobject.psd.sendKeys("password123"); 
	}

	@Then("user logged in successfully")
	public void user_logged_in_successfully() {
		System.out.print("User Login successfully");
	}
	
	@Then("click up signin button")
	public void click_up_signin_button() {
		System.out.println("signed in");
		 Pageobject.ok.click();
	}

	@Then("verify signin")
	public void verify_signin() {
		System.out.println("successful signin");
	}
	
	

}
