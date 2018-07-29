package com.hooksSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
					
					monochrome=true,
					//dryRun=true,//it will give right java code and to check if anything is wrong in code but not execute.
					//It will check that all the methods are as per feature file.
					features= {"src/test/resources/hooksFF/HooksFF.feature"},
					glue={"com/hooksSD/"},
					
					plugin={"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report5.json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport5.html"
					}
			
			)
	
	public class RunHooksTest {	
	

}
