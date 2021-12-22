package com.flyway.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Given;

public class EditProfileTestStep extends Driver {

	@Given("user should have clicked on EditProfile")
	public void user_should_have_clicked_on_edit_profile() {
		dashBoardPage.clickeditProfile();
	    
	}

	@Given("user should able to redirect to FLYAWAY - EDIT PROFILE page")
	public void user_should_able_to_redirect_to_flyaway_edit_profile_page() {
		Assert.assertTrue(driver.getTitle().equals("Fly Away - Edit Profile"));
	}

	@Given("user should enter {string},{string} ,{string},{string},{string}")
	public void user_should_enter(String password, String confirmPassword, String name, String address, String city) {
	    editPage.enterPassword(password);
	    editPage.eneterConfirmPassword(confirmPassword);
	    editPage.enterName(name);
	    editPage.enterAddress(address);
	    editPage.eneterCity(city);
		
	}

	@Given("user should have clicked on update")
	public void user_should_have_clicked_on_update() {
		editPage.clickUpdateBtnbtn();
	   
	}
}
