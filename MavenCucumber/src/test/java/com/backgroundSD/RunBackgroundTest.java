package com.backgroundSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
					
					monochrome=false,
					//dryRun=true,
					
					features= {"src/test/resources/backgroundFF/BackgroundFF.feature"},
					glue={"com/backgroundSD/"},
					
					plugin={"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report1.json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
					}
			
			)
	
	public class RunBackgroundTest {	
	

}
