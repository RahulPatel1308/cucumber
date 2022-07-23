package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\15145\\eclipse-workspace\\Amzcucumber\\src\\test\\java\\feature", glue ={"stepdefination"},
plugin= {"pretty","html:target/HTmlreports"},monochrome=true)






public class Testrunner {
	
}
