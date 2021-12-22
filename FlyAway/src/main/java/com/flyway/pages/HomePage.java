package com.flyway.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;


public class HomePage {

	//private Actions actions;
	//private WebDriverWait wait;

	@FindBy(css = "a[href='login']")
	private WebElement loginSignup;

	// @FindBy(css = "form table tbody tr td:nth-of-type(3) button")
	// private WebElement submit;

	@FindBy(css = "button")
	private WebElement submit;

	@FindBy(css = "a[href='dashboard']")
	private WebElement dashboard;

	@FindBy(css = "a[href='editprofile']")
	private WebElement editProfile;

	@FindBy(css = "a[href='home']")
	private WebElement home;

	@FindBy(css = "a[href='logout']")
	private WebElement logout;

	@FindBy(name = "source")
	private WebElement from;

	@FindBy(name = "destination")
	private WebElement to;

	@FindBy(tagName = "table")
	private WebElement tableResult;

	// @FindBy(linkText="Book Flight")
	// private WebElement BookFlight;

	@FindBy(linkText = "Book Flight")
	private WebElement BookFlightbtn;

	@FindBy(linkText = "Click to complete booking")
	private WebElement ComleteBooking;

	@FindBy(linkText = "See Your Bookings")
	private WebElement seeYourBooking;

	private Select select;

	// private WebElement Bookingpage;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//actions = new Actions(driver);
		//wait = new WebDriverWait(driver, 1000);

	}

	public void clickLoginSignBtn() {
		loginSignup.click();
	}

	public void clickseditProfilebtn() {
		editProfile.click();
	}

	public void dashBoardBtn() {
		dashboard.click();
	}

	public void logoutBtn() {
		logout.click();
	}

	public void selectSourceDestination() {

		select = new Select(from);
		select.selectByVisibleText("Mumbai");

		select = new Select(to);
		select.selectByVisibleText("Bangalore");

	}

	public void bookFlight() {
		tableResult.isDisplayed();
	}

	public void clicksubmitBtn() {
		submit.click();
	}

	public void FinalBooking() {
//		  //tableResult.isDisplayed();
//		  //System.out.println("Table is present");
//		  wait.until(ExpectedConditions.visibilityOf(tableResult));
//		  //System.out.println(tableResult.getText());
//		  tableResult.findElement(By.linkText("Book Flight")).click();
//		  System.out.println(tableResult.getText());

		BookFlightbtn.click();

	}

	public void confirmPayment() {

		ComleteBooking.click();
	}
	
	public void viewBoookings() {
		seeYourBooking.isDisplayed();
	}

}
