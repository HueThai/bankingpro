package stepdefinition;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


/**
 * Created by huethait. on 11/25/16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources"},

        plugin = {"pretty", "json:target/cucumber-report.json"}, // lưu report bằng file  khi mở jenkin
        //plugin = {"pretty", "html:target/cucumber-report/cucumber.html"},lưu report bằng file html khi mở jenkin
        tags = {}
)
public class RunCukesTest {
    @BeforeClass
    public static void setup() {
    }

    @AfterClass
    public static void shutdown() {

    }


}
