package com.flyway.testscripts;

import org.testng.Assert;
import io.cucumber.java.en.Then;

public class LoginTestStep extends Driver {
	

	@Then("user should enter {string},{string}")
	public void user_should_enter(String email, String password) {
	   loginPage.enterEmailID(email);
	   loginPage.enterPassword(password);
	}

	@Then("user should click on login button")
	public void user_should_click_on_login_button() {
	    loginPage.clickloginBtn();	
	}

	@Then("user should redirect to FLYAWAY - DASHBOARD page")
	public void user_should_redirect_to_flyaway_dashboard_page() {
		//String a=driver.getTitle();
		//System.out.println(a);
		Assert.assertTrue(driver.getTitle().equals("Fly Away - Dashboard"));
	}
	   
}
