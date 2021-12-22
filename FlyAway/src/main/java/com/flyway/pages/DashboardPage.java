package com.flyway.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	@FindBy(css = "a[href='home']")
    private WebElement home;
	
	@FindBy(css = "a[href='editprofile']")
    private WebElement editProfile;
	
	@FindBy(css = "a[href='memberbookings']")
    private WebElement yourBookings;
	
	@FindBy(css = "a[href='logout']")
    private WebElement logout;
	
	
	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
					
	}
	
	public void clickHome() {
		home.click();
	}
	
	public void clickeditProfile() {
		editProfile.click();
	}
	
	public void clickYourBookings() {
		yourBookings.click();
	}
	public void clickLogout() {
		logout.click();
	}
	
	
}
