package com.cucumberAutomation.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunctionalityDataDriven {
	public WebDriver driver;
	@Given("User is on Login Page of sausedemo")
	public void user_is_on_login_page_of_sausedemo() {
	    System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");	       
		 System.out.println(" User is on Login Page");
	}

	@When("User enters credentials {string} and {string}")
	public void user_enters_credentials_and(String username, String password) {
		 driver.findElement(By.name("user-name")).sendKeys(username);
		    driver.findElement(By.name("password")).sendKeys(password);
			 System.out.println(" User Enters valid username and password");
	}

	@And("user Clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.name("login-button")).click();
	    System.out.println(" Login Butten clicked");
	}

	@Then("User should be logged in succesfully in sausedemo")
	public void user_should_be_logged_in_succesfully_in_sausedemo() {
		boolean status= driver.findElement(By.partialLinkText("Sauce Labs")).isDisplayed();
		if (status) {
		
			System.out.println(" User logged in succesfully");
		}
	}

	@And("Close the application sausedemo")
	public void close_the_application_sausedemo() {
		   driver.close();
			 System.out.println(" Close the application");
	}

}
