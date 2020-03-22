package com.cucumber_io_testng;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
        features = {"src/test/resources/"},
        glue = {"com.cucumber.stepdefinitions"},
        plugin = {"pretty", "html:target/cucumber-html-report",
        		"json:target/cucumber.json", "junit:target/cucumber.xml"},
        		tags={ "@tag2"}
)


public class TestngRunner extends AbstractTestNGCucumberTests{
 
}
