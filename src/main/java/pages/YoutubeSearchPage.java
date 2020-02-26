package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YoutubeSearchPage {
	
	public static boolean searchPageExists (WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement mainpage = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath(".//div[@id='contents']")));
		return mainpage.isDisplayed();
	}
	
}
