package com.flyway.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "Feature", 
glue = "com.flyway.testscripts")

public class TestRunner extends AbstractTestNGCucumberTests {

}
