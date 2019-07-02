package Stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pageobject {
	//store all the obj available in every page
	static WebDriver driver;
	public void PageObject()
	{
		PageFactory.initElements(driver, this);
	}
	//identify elements
	@FindBy(xpath="//*[@id='userName']") public static WebElement un;
	@FindBy(xpath="//*[@id='password']") public static WebElement psd;
	@FindBy(xpath="/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]") public static WebElement ok;


/*public void login()
{
	un.sendKeys("lalitha");
	psd.sendKeys("password123");
	ok.click();
}*/
}
