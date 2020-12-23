package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"rerun/failed_scnerio.txt"},
                 glue="stepDefinition",
                 monochrome=true,
                 plugin= {"pretty","rerun:rerun/failed_scnerio.txt"})
public class FailedRunner {

}
