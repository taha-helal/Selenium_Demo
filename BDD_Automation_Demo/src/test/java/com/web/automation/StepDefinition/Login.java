package com.web.automation.StepDefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.web.automation.Base.DriverInstance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	WebDriver driver;
	
	@Given("The user landed on login page")
	public void the_user_landed_on_login_page() throws IOException {
		DriverInstance driverInstanc = new DriverInstance();
		driver = driverInstanc.startDriverInstance();
		
		
	}
	@And("The user define username")
	public void the_user_define_username() {
	   driver.findElement(By.name("username")).sendKeys("helal");
	   
	}
	@And("The user define password")
	public void the_user_define_password() {
		driver.findElement(By.name("password")).sendKeys("taha");
	
	}
	@And("The user press on login button")
	public void the_user_press_on_login_button() {
		driver.findElement(By.xpath("//button[@class='button']")).click();
		

	}
	@Then("The user should be logoin")
	public void the_user_should_be_logoin() {
	  

	}
	@When("The user press on logout button")
	public void the_user_press_on_logout_button() {
	    

	}
	@Then("The user should be logout")
	public void the_user_should_be_logout() {
	    
	  
	}

}
