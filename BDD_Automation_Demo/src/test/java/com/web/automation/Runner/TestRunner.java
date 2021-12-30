package com.web.automation.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.ExtentProperties;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFile",
				monochrome = true,
				dryRun = false,
				glue = {"com.web.automation.StepDefinition"},
				plugin = {
						"html:target/cucumber-reports",
						"pretty:target/pretty.txt" ,
                        "json:target/cucumber.json" ,
                        "junit:target/cucumber-results.xml",
                      //  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                        })

public class TestRunner {

	
	@BeforeClass
	public static void setReportConfigration () {
		
		ExtentProperties properties = ExtentProperties.INSTANCE;
		properties.setReportPath("./Reports/Report.html");
		
	}
	
	@AfterClass
	public static void setConfigration() {
		
		//Reporter.loadXMLConfig("./ConfigFile/extent-config.xml");
	}
	
	
	
}
