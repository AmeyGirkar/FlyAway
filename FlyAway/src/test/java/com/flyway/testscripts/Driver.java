package com.flyway.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;
import com.flyway.pages.DashboardPage;
import com.flyway.pages.EditPage;
import com.flyway.pages.HomePage;
import com.flyway.pages.LoginPage;
import com.flyway.pages.RegisterConfirmPage;
import com.flyway.pages.SignUpPage;

public class Driver  extends Tools{
	
	protected static HomePage homePage;
	protected static LoginPage loginPage;
	protected static SignUpPage signUpPage;
	protected static RegisterConfirmPage registerConfirmPage;
	protected static DashboardPage dashBoardPage;
	protected static EditPage editPage;
	
public static void init(){
	//System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
	driver = new ChromeDriver();
	homePage =new HomePage(driver);
	loginPage =new LoginPage(driver);
	signUpPage =new SignUpPage(driver);
	dashBoardPage =new DashboardPage(driver);
	editPage=new EditPage(driver);
	

		
	}

}
