package com.flyway.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

	@FindBy(name = "email_id")
	private WebElement emaiIdBox;
	@FindBy(name = "pwd")
	private WebElement passwordBox;
	@FindBy(name = "pwd2")
	private WebElement confirmPassWordBox;
	@FindBy(name = "name")
	private WebElement namme;
	@FindBy(css = "button")
	private WebElement signUpbtn;

	public SignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterEmail(String email) {
		emaiIdBox.sendKeys(email);
	}

	public void enterPassword(String password) {
		passwordBox.sendKeys(password);
	}

	public void eneterConfirmPassword(String ConfirmPassword) {
		confirmPassWordBox.sendKeys(ConfirmPassword);
	}

	public void enterName(String naame) {
		namme.sendKeys(naame);
	}

	public void clickSignUpbtn() {
		signUpbtn.click();
	}
	}


