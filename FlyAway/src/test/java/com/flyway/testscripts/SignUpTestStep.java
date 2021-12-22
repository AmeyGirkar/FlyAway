package com.flyway.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SignUpTestStep extends Driver{
	
	@Given("a user is on the home of FlyAway")
	public void a_user_is_on_the_home_of_fly_away() {
		//System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().equals("Fly Away"));
	}

	@Given("user should have click on Login-signup")
	public void user_should_have_click_on_login_signup() {
	    homePage.clickLoginSignBtn();
	    
	}

	@Given("user should be redirect to LoginPage")
	public void user_should_be_redirect_to_login_page() {
		
		Assert.assertTrue(driver.getTitle().equals("Fly Away - Login"));
	}

	@Given("user should click on Not a member? Signup")
	public void user_should_click_on_not_a_member_signup() {
		  loginPage.clickSignUPSignBtn();
	}

	@Given("user should able to redirect to FLYAWAY - MEMBER REGISTRATION page")
	public void user_should_able_to_redirect_to_flyaway_member_registration_page() {
		
		Assert.assertTrue(driver.getTitle().equals("Fly Away - Register"));
	}

	@Then("user should enter {string},{string},{string} ,{string}")
	public void user_should_enter(String email, String password, String confirmpassword, String naame){
		
		signUpPage.enterEmail(email);
		signUpPage.enterPassword(password);
		signUpPage.eneterConfirmPassword(confirmpassword);
		signUpPage.enterName(naame);
		signUpPage.clickSignUpbtn();
		
	}

	@Then("user should redirect to Fly Away - Registration Confirmation page")
	public void user_should_redirect_to_fly_away_registration_confirmation_page() {
		
		Assert.assertTrue(driver.getTitle().equals("Fly Away - Registration Confirmation"));
	   
	}

	
	
	
}
