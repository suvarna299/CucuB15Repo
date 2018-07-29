package com.tagsSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
					
					monochrome=true,
					//dryRun=true,
					tags={"@Important"}, //All scenario executed if this is tag for feature file
					
					features= {"src/test/resources/tagsFF/TagsnFF.feature"},
					glue={"tagsSD/RunTagsTest.java/"},
					
					plugin={"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report10.json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport10.html"
					}
			
			)
	
	public class RunTagsTest {	
	

}
