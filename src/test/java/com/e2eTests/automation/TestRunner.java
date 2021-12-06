package com.e2eTests.automation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/specs/features"}, // for the functionalities
		//glue = {""}, 
		plugin = {"pretty", "html:target/cucmber-html-report"}, //creation dossier pour un simple rapport html
		snippets = SnippetType.CAMELCASE,
		tags = {("@authentication")},
		monochrome = true
		)
public class TestRunner {
	
	

}
