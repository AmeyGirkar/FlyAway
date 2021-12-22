package com.flyway.testscripts;

import org.testng.Assert;
import io.cucumber.java.en.Then;

public class BookFlightTestStep extends Driver{
	
	@Then("user should have clicked Book Flight option")
	public void user_should_have_clicked_book_flight_option() throws InterruptedException {
		Thread.sleep(1000);
		homePage.FinalBooking();
	  
	}

	@Then("user should redirect to FLYAWAY - PAYMENT GATEWAY")
	public void user_should_redirect_to_flyaway_payment_gateway() {
	    
		Assert.assertTrue(driver.getTitle().equals("Fly Away - Make Flight Booking"));
		homePage.confirmPayment();
	}

	@Then("User should have clicked on Click to complete Booking")
	public void user_should_have_clicked_on_click_to_complete_booking() {
		Assert.assertTrue(driver.getTitle().equals("Fly Away - Booking Confirmation"));
	   
	}

	@Then("user should see flyway -booking Confirmation message")
	public void user_should_see_flyway_booking_confirmation_message() {
	    
	}


}
