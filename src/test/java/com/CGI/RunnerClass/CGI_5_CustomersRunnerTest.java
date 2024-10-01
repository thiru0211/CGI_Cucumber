package com.CGI.RunnerClass;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\thirumaran\\eclipse-workspace\\CGI_Cucumber_Project\\src\\test\\resources\\featureFiles\\CGI_Customers.feature",
glue = "com.CGI.Stepdefinition",
//monochrome = true,
//dryRun = true,
//tags="@Test",
plugin = {"pretty","html:Reports/TestReport.html",
		"json:target/cucumber/cucumber.json",
		"html:Reports/cucumber-reports.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/FailedScenarios.txt"
		})
public class CGI_5_CustomersRunnerTest {

}
