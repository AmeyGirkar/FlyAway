package com.flyway.testscripts;



import org.testng.Assert;

import io.cucumber.java.en.Then;

public class GetFlightTestStep extends Driver {

	@Then("user should have clicked on Homepage")
	public void user_should_have_clicked_on_homepage() {
		
		dashBoardPage.clickHome();
	}

	@Then("user should redirect to FLYAWAY HOMEPAGE page")
	public void user_should_redirect_to_flyaway_homepage_page() {
	   
		Assert.assertTrue(driver.getTitle().equals("Fly Away"));
	}

	@Then("user should select Mumbai as source and Bengalore as destination")
	public void user_should_select_mumbai_as_source_and_bengalore_as_destination() {
		homePage.selectSourceDestination();
	   
	}

	@Then("click on submit button")
	public void click_on_submit_button() {
	   
		homePage.clicksubmitBtn();
	}

	@Then("user should have seen a Book Flight option")
	public void user_should_have_seen_a_book_flight_option() {
		
		homePage.bookFlight();;
	    
		
	}
}
