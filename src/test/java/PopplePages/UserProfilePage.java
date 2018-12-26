package PopplePages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.testng.Assert;

import PoppleUtils.WrapperGenericMethod;

public class UserProfilePage {

	By BackgroundImage = By.cssSelector(
			"body > div.row.m-b-0.vtpl-profileWrapper > div.col.s12.p-0.vtpl-profile.m-b-15 > div.vtpl-profileCover > div.profile-back-overlay");

	By AuthorName = By.cssSelector("#vtpl-container > div > div.col.s12.l9.vtpl_card.m-b-15 > p > a");
	By AuthorImage = By.cssSelector(
			"body > div.row.m-b-0.vtpl-profileWrapper > div.col.s12.p-0.vtpl-profile.m-b-15 > div.col.s11.l6.vtpl-profile-card > div > div.vtpl-profile-img");
	By WriterName = By.cssSelector(
			"body > div.row.m-b-0.vtpl-profileWrapper > div.col.s12.p-0.vtpl-profile.m-b-15 > div.col.s11.l6.vtpl-profile-card > div > h1");
	By Editor = By.cssSelector(
			"body > div.row.m-b-0.vtpl-profileWrapper > div.col.s12.p-0.vtpl-profile.m-b-15 > div.col.s11.l6.vtpl-profile-card > div > p.vtpl-profile-writerEmail");
	By FacebooLink = By.cssSelector("#Capa_1");
	By TwitterLink = By.cssSelector("#Capa_1 > path");
	By LinkedinLink = By.cssSelector("#LinkedIn");
	By ProfileDesc = By.cssSelector(
			"body > div.row.m-b-0.vtpl-profileWrapper > div.col.s12.p-0.vtpl-profile.m-b-15 > div.col.s11.l6.vtpl-profile-card > div > p.col.s12.p-0.vtpl-profile-desc.m-b-0");
	By DontMissThisStory = By.cssSelector(
			"body > div.row.m-b-0.vtpl-profileWrapper > div.col.s12.vtpl-profile-stories.p-0 > div.vtpl_mosaicContainer.col.s12.p-0 > div > div > div > div > div:nth-child(1) > div > a > div");
	By LatestStories = By.cssSelector(
			"body > div.row.m-b-0.vtpl-profileWrapper > div.col.s12.vtpl-profile-stories.p-0 > article:nth-child(5) > a > div.vtpl_cover_image");

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
