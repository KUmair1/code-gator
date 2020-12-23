package stepDefinition;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;

import Utilities.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest extends BaseClass{
	@Given("^I am on the login page$")
	public void i_am_on_the_login_page()  {
		openBrowser()
		driver.get("https://login.salesforce.com/");
	   
	}

	@Given("^I entered valid username$")
	public void i_entered_valid_username()  {
		driver.findElement(By.id("username")).sendKeys("test.user@gmail.com.test");
	}

	@Given("^I entered Valid password$")
	public void i_entered_Valid_password()  {
		driver.findElement(By.id("password")).sendKeys("Pa55word");
	}

	@When("^I click the login button$")
	public void i_click_the_login_button()  {
		driver.findElement(By.id("Login")).click();
	}

	@Then("^I should see the dashboard$")
	public void i_should_see_the_dashboard()  {
		System.out.println("I can see the dashboard");
	}

	
	@Given("^I entered the invalid username$")
	public void i_entered_the_invalid_username() {
		driver.findElement(By.id("username")).sendKeys("test.123user@gmail.com.test");
	}

	@Given("^I entered the invalid password$")
	public void i_entered_the_invalid_password()  {
		driver.findElement(By.id("password")).sendKeys("Pa555word");
	}

	@Then("^I should see the error message$")
	public void i_should_see_the_error_message()  {
		System.out.println("Error message is popped");
	}

}
