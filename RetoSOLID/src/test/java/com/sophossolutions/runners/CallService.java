package com.sophossolutions.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    glue = "com.sophossolutions.stepdefinitions",
    features = "src/test/resources/features/call_service.feature",
    snippets = SnippetType.CAMELCASE,
    monochrome = true
)
public class CallService {


}