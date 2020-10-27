package cucumberTest;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = {"stepDefinition"},
    tags = "@Activity1",
    monochrome = true,
    publish=true
)
public class Activity1runner
{

	
}
