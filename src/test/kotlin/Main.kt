import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith

@RunWith(Cucumber::class)
@CucumberOptions(
    features = ["src/test/resources/feature"],
    plugin = [
        "json:target/cucumber/report.json",
        "junit:target/cucumber/report.junit",
        "html:target/cucumber/report.html"
    ],
    glue = [""],
    tags = "",
    monochrome = true,
    dryRun = false,
    strict = true
)
class MainTest