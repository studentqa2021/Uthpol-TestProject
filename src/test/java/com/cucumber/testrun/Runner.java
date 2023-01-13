package com.cucumber.testrun;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		plugin = {
				"pretty",
				"html:target/site/cucumber-pretty.html",
				"rerun:target/rerun.txt",
				"json:target/cucumber.json"   //<--- .json is mandatory
				},
				
		features = { 
				"src/main/resources/AutomationLogin.feature"     //feature here
		},
				
		glue = { 
			    "com.cucumber.testrun"	  //step def =pakage name --->replace / with .
		}
		
		)

public class Runner extends AbstractTestNGCucumberTests{// extend with (dev ---> created) AbstractTestNGCucumberTests
} 

