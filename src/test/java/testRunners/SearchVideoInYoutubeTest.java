package testRunners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/searchVideoInYoutube.feature",
		glue = "src/test/java/stepDefinitions/SearchVideoInYoutubeStepDefinition.java"
		)

public class SearchVideoInYoutubeTest {

}
