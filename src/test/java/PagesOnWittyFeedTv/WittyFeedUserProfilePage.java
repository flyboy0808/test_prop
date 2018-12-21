package PagesOnWittyFeedTv;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.testng.Assert;

import UtilsOnFeed.WrapperGenericMethod;



public class WittyFeedUserProfilePage {

	By BackgroundImage = By.cssSelector(".profile-back-overlay");
    By AuthorName = By.cssSelector(".vtpl-partnerName");
	By AuthorImage = By.cssSelector(".vtpl-profile-img");
	By WriterName = By.cssSelector(".vtpl-profile-writerName");
	By Editor = By.cssSelector(".vtpl-profile-writerEmail");
	By FacebooLink = By.cssSelector("#Capa_1");
	By TwitterLink = By.cssSelector("#Capa_1 > path");
	By LinkedinLink = By.cssSelector("#LinkedIn");
	By ProfileDesc = By.cssSelector("p.col");
	By DontMissThisStory = By.cssSelector(".vtpl-profile-stories > div:nth-child(1) > h3:nth-child(1)");
	By LatestStories = By.cssSelector(".vtpl-profile-stories > div:nth-child(3) > h3:nth-child(1)");

	WrapperGenericMethod Action = new WrapperGenericMethod();

	public void ClickAuthorName(WebDriver driver) {

		Action.Click(driver, AuthorName);

	}

	public void BackgroundImage(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		int Element = driver.findElements(BackgroundImage).size();
		Assert.assertEquals(Element, 1);
	}

	public void AuthorName(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		int Element = driver.findElements(WriterName).size();
		Assert.assertEquals(Element, 1);
	}

	public void AuthorImage(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		int Element = driver.findElements(AuthorImage).size();
		Assert.assertEquals(Element, 1);
	}

	public void WriterName(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		int Element = driver.findElements(WriterName).size();
		Assert.assertEquals(Element, 1);
	}

	public void Editor(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		int Element = driver.findElements(Editor).size();
		Assert.assertEquals(Element, 1);
	}

//	public void FacebookLink(WebDriver driver) {
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//		Action.GetText(driver, FacebooLink);
//		
//	}
//
//	public void TwitterLink(WebDriver driver) {
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//		Action.GetText(driver, TwitterLink);
//	}
//
//	public void LinkedinLink(WebDriver driver) {
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//		Action.GetText(driver, LinkedinLink);
//	}

	public void ProfileDesc(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		int Element = driver.findElements(ProfileDesc).size();
		Assert.assertEquals(Element, 1);
	}

	public void DontMissThisStory(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		int Element = driver.findElements(ProfileDesc).size();
		Assert.assertEquals(Element, 1);
	}

	public void LatestStories(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int Element = driver.findElements(ProfileDesc).size();
		Assert.assertEquals(Element, 1);
	}
}
