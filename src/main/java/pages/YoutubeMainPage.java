package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YoutubeMainPage {
	
	public static void typeVideoInSearchBox (WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement inputVideo = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@id='search-input']/input[@id='search']")));
		inputVideo.clear();
		inputVideo.sendKeys("selenium");
	}
	
	public static void clickOnSearchButton (WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement searchButton = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(".//button[@id='search-icon-legacy']")));
		searchButton.click();
	}
	
}
