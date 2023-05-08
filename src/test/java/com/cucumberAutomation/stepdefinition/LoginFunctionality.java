package com.cucumberAutomation.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunctionality {
	public WebDriver driver;

	@Given("User is on Login Page")
	public void user_is_on_login_page() {
	    System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");	       
		 System.out.println(" User is on Login Page");
	}

	@When("User Enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    driver.findElement(By.name("user-name")).sendKeys("standard_user");
	    driver.findElement(By.name("password")).sendKeys("secret_sauce");
		 System.out.println(" User Enters valid username and password");
	}

	@And("Clicks on login button")
	public void clicks_on_login_button() {
		driver.findElement(By.name("login-button")).click();
	    System.out.println(" Login Butten clicked");
	}

	@Then("User should be logged in succesfully")
	public void user_should_be_logged_in_succesfully() {
		boolean status= driver.findElement(By.partialLinkText("Sauce Labs")).isDisplayed();
		if (status) {
		
			System.out.println(" User logged in succesfully");
		}
		 
	}

	@And("Close the application")
	public void close_the_application() {
	    driver.close();
		 System.out.println(" Close the application");
	}
}
