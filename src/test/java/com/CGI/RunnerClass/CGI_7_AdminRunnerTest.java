package com.CGI.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\Administrator.SANKARASOFTWARE\\git\\CGI_Cucumber\\src\\test\\resources\\featureFiles\\CGI_Admin.feature",
glue = "com.CGI.Stepdefinition",
monochrome = true,
//dryRun = true,
//tags="@TC_09",
plugin = {"pretty","html:Reports/TestReport.html",
		"json:target/cucumber/cucumber.json",
		"html:Reports/cucumber-reports.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/FailedScenarios.txt"
		})
public class CGI_7_AdminRunnerTest {

	
}
