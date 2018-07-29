package com.B15Demo;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		          features={"src/test/resources/B15Demo/CucumberPath.feature","src/test/resources/B15Demo/CucumberPath2.feature"},
                  glue={"com/B15Demo"}
		         )


public class RunCucumberPathStepDefs {
	
	
}

