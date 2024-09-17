package com.CGI.RunnerClass;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="@target/FailedScenarios.txt",
glue = "com.CGI.Stepdefinition",
//monochrome = true,
//dryRun = true,
plugin = {"pretty","html:Reports/TestReport.html",
		"json:target/cucumber/cucumber.json",
		"html:Reports/cucumber-reports.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"		
		})
public class CGI_ReRunnerTest {
	
}
