package com.cucumberAutomation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\Features\\",
glue="com.cucumberAutomation.stepdefinition",
dryRun = false,
plugin = {"html:reports/webreport.html"},
tags = "@regression"
		)
public class RunnerClass {

}
