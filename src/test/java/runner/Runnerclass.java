package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/main/resources/sush1.Feature"},
				  glue="Stepdefinition",
				  plugin="json:target/jsonreport"
				
				  //tags={"@smoke"}
				  //tags={"@regression"}
				  //tags={"~@smoke"}
				  //tags={"@smoke","@regression"}
				 )


public class Runnerclass {

}
