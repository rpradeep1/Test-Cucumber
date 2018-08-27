package com.project.driver;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "Features",
		glue ={"com.project.teststeps"},
		tags = {"@Regression"},
		plugin = {"html:target/cucumber-html-report","json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
				"usage:target/cucumber-usage.json","junit:target/cucumber-results.xml","json:target/cucumber2.json"}
	)

public class testrunner {	

	
	
}
