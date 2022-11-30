package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/features", 
glue= {"stepdefinitions"}, 
tags= {"@DataDriven or ~@SmokeTest"},
monochrome=true,
strict=true,
plugin = { "pretty", "html:target/HtmlReports/report.html",
		"json:target/JSONReports/report.json",
		"junit:target/JUnitReports/report.xml"})
public class TestRunner {

}


//Multiple Feature File
//{"src/test/resources/features","src/test/resources/features2"}