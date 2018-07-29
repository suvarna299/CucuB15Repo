package com.dataTable;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


@CucumberOptions(features = {"src/test/resources/dataTable/DataTableMapsTest.feature"},
					glue={"com/dataTable/"}
				)


public class RunDataTableCukesTest {
}