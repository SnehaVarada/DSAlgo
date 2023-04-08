package runner1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","html:taget/Html.html"},monochrome=true,
//dryRun=true,
features={"C:\\Users\\saisn\\eclipse-workspace\\DsAlgo\\src\\test\\resources\\FeatureFiles"},
glue={"stepDefinition"})


public class DsAlgoRunner extends AbstractTestNGCucumberTests
{

}
