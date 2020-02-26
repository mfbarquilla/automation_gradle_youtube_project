package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.YoutubeMainPage;
import pages.YoutubeSearchPage;

public class SearchVideoInYoutubeStepDefinition {

	WebDriver driver = null;

	@Before
	public void setUp()
	{
		String path = System.getProperty("user.dir");
        	System.out.println(path);
        	System.setProperty("webdriver.chrome.driver", path + "\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Connection established");
	}
	
	@Given("^I navigate to youtube.com$")
	public void navigateToIRIS()
	{
		driver.get("https://www.youtube.com");
		System.out.println("I navigate to youtube.com");
	}
	
	@When("^I type the video in search box$")
	public void enterUser()
	{
		YoutubeMainPage.typeVideoInSearchBox(driver);
		System.out.println("I click on search box");
	}
	
	@And("^I click on search button$")
	public void enterPassword()
	{
		YoutubeMainPage.clickOnSearchButton(driver);
		System.out.println("I enter password");
	}
	
	@Then("^Video contents exist$")
	public void loginSuccesfully()
	{
		assertEquals(YoutubeSearchPage.searchPageExists(driver),true);
		System.out.println("Video contents exist");
	}
	
	@After
	public void cleanUp()
	{
		driver.close();
		System.out.println("Connection closed");
	}
}
