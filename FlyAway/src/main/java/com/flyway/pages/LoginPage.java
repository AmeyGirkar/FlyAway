package com.flyway.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(css = "a[href='signup']")
    private WebElement notAMemberSignup;
	
	@FindBy(name ="email_id")
	private WebElement emailidBox;
	
	@FindBy(name = "pwd")
    private WebElement paswordBox;
	
	@FindBy(css = "button")
    private WebElement loginBtn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
					
	}
	
	public void clickSignUPSignBtn() {
		notAMemberSignup.click();
	}
	
	public void enterEmailID(String email) {
	emailidBox.sendKeys(email);;
	}
	
	public void enterPassword(String password) {
		paswordBox.sendKeys(password);
	}
	
	public void clickloginBtn() {
		loginBtn.click();
	}
	
}
