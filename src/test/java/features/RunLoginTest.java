package features;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by xinrui on 23/10/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        features = "src/test/resources/features/",
        plugin ={"pretty",
                "html:target/cucumber-report/",
                "json:target/cucumber-report/cucumber.json"
        })
public class RunLoginTest{
}

