package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(features = "src\\test\\resources\\features",
                              glue="steps",
                              tags = "@reg7898",
                              stepNotifications = true,dryRun = false)

public class Regrunner {

}
