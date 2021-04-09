package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        glue = "stepdefinitions",

        /// to generate different type of reporting
        plugin = {"pretty","json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports/index.html",
                "pretty:target/cucumber-reports/cucumber-pretty.txt","usage:target/cucumber-reports/cucumber-usage.json",
                "junit:target/cucumber-reports/cucumber-results.xml"
        },
        // it will check if any step is not defined in step definition file
        strict = true,
        // display the console output in a proper readable format
        monochrome = true,
        // to check the mapping is proper between feature file and step definition file
        dryRun = false,
        publish = true,
//            tags = "(@mahmud) and (not @pending)"
//         tags = "(@smokeTest or @RegressionTest or @IntegrationTest ) and (not @pending)"
        tags = "(@Test1 or @Test2 or @Test3 or @Test4 or @Test5 or @Test6 or @Test7 or " +
                "@Test8 or @Test9 or @Test10 or @Test11 or @Test12 or @Test13 or @Test14 " +
                "or @Test15 or @Test16 or @Test17 or @Test18 or @Test19 or @Test20 or @Test21" +
                "@Test22 or @Test23 or @Test24 or @Test25) "

)


public class BoostmobileTestRunner {





}
