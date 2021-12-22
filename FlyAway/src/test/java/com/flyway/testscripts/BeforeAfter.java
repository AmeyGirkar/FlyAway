package com.flyway.testscripts;

import java.net.MalformedURLException;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class BeforeAfter extends Tools {
	
	@Before
	public void setUp(Scenario scenario) throws MalformedURLException {
		Driver.init();
		driver.manage().window().maximize();
		
		//driver.get("http://localhost:9090/FlyAway/home");
		// Tomcat server on aws
		driver.get("http://174.129.180.167:8080/FlyAway/");
	}

	@After
	public void teardown() {
		driver.quit();
		
	}

}
