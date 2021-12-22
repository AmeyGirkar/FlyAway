package com.flyway.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditPage {

	@FindBy(name = "pwd")
	private WebElement passwordBox;
	@FindBy(name = "pwd2")
	private WebElement confirmPassWordBox;
	@FindBy(name = "name")
	private WebElement namme;
	@FindBy(name = "address")
	private WebElement addressBox;
	@FindBy(name = "city")
	private WebElement cityBox;
	@FindBy(css = "button")
	private WebElement updateBtn;
	
	
	public EditPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
					
	}
	
	public void enterPassword(String password) {
		passwordBox.sendKeys(password);
	}

	public void eneterConfirmPassword(String ConfirmPassword) {
		confirmPassWordBox.sendKeys(ConfirmPassword);
	}

	public void enterName(String naame) {
		namme.clear();
		namme.sendKeys(naame);
	}
	
	public void eneterCity(String city) {
		cityBox.clear();
		cityBox.sendKeys(city);
	}

	public void enterAddress(String address) {
		addressBox.clear();
		addressBox.sendKeys(address);
	}
	

	public void clickUpdateBtnbtn() {
		updateBtn.click();
	}
	
}
