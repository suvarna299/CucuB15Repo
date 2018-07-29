package com.Assignment.MutipleParameters;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		          features={"src/test/resources/Assignment/MutipleParameters/MultiParameter.feature"},
		          glue={"com/Assignment/MutipleParameters"}
		)
public class RunMultiParameter {

}
