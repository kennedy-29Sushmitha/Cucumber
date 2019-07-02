package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/main/resources/sush5.Feature"},
				  glue="Stepdefinition",
				  plugin="html:target/htmlreport"
				
				  //tags={"@smoke"}
				  //tags={"@regression"}
				  //tags={"~@smoke"}
				  //tags={"@smoke","@regression"}
				 )


public class Runnerclass {

}
