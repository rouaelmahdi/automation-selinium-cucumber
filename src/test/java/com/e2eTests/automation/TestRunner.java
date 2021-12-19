package com.e2eTests.automation;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/specs/features"}, // for the functionalities
		//glue = {""}, 
		plugin = {"pretty", "html:target/cucmber-html-report", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/OrangeReport.html"}, //creation dossier pour un simple rapport html
		snippets = SnippetType.CAMELCASE,
		tags = {("@loginOutline")},
		//tags = {("@authentication,@loginOutline")},
		monochrome = true
		)
public class TestRunner {

	@AfterClass
	public static void writeExtentReport() {
		
		Reporter.loadXMLConfig(new File("src/test/resources/configs/extent-config.xml"));
	}

}
