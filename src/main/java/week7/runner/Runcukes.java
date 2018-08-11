package week7.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/week7/featurefile/testcases.feature", glue = "week7.pagesimplemented")

public class Runcukes {

}
