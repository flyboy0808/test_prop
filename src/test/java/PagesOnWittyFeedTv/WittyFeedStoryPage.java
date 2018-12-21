package PagesOnWittyFeedTv;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import UtilsOnFeed.WrapperGenericMethod;


public class WittyFeedStoryPage {
	
	
	By AdvertisementFrame = By.cssSelector("div.vtpl-pramotion:nth-child(1)");
	By FeaturedPostImage = By.cssSelector("div.background--img");
	//By StoryFirstImage = By.cssSelector("div.background--img");
	By StoryAuthor = By.cssSelector(".vtpl-partner");
	By StoryTitle = By.cssSelector(".vtpl_title");
	By StoryDesc = By.cssSelector(".vtpl-storyOneLinear");
	By StoryShares = By.cssSelector("span.st-label:nth-child(1)");
	By FBlink = By.cssSelector("div.st-btn:nth-child(2) > span:nth-child(2)");
	By TweetLink = By.cssSelector("div.st-btn:nth-child(3) > span:nth-child(2)");
	By WhatsappLink = By.cssSelector("div.st-btn:nth-child(4) > span:nth-child(2)");
	By MessangerappLink = By.cssSelector("div.st-btn:nth-child(5) > span:nth-child(2)");
	By DirectShare = By.cssSelector("div.st-btn:nth-child(6) > span:nth-child(2)");
	By StoryContent = By.cssSelector("div.col:nth-child(5) > p:nth-child(1)");
		
	

	WrapperGenericMethod Action = new WrapperGenericMethod();
	
	
	
	
	public void AdvertisementFrame(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int Element = driver.findElements(AdvertisementFrame).size();
		Assert.assertEquals(Element, 1);
	}
	
	public void ClickFeaturedPost(WebDriver driver) {

		Action.Click(driver, FeaturedPostImage);

	}
	

	public void StoryAuthor(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(StoryAuthor);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(StoryAuthor).size();
		Assert.assertEquals(Element, 1);
	}
	
	
	public void StoryTitle(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(StoryTitle);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(StoryTitle).size();
		Assert.assertEquals(Element, 1);
	}
	
	public void StoryDesc(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(StoryDesc);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(StoryDesc).size();
		Assert.assertEquals(Element, 1);
	}
	
	public void StoryShares(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(StoryShares);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(StoryShares).size();
		Assert.assertEquals(Element, 1);
	}
	
	
	public void StoryShareOptions(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(StoryShares);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(FBlink).size();
		Assert.assertEquals(Element, 1);
		int Element1 = driver.findElements(TweetLink).size();
		Assert.assertEquals(Element1, 1);
		int Element2 = driver.findElements(MessangerappLink).size();
		Assert.assertEquals(Element2, 1);
		int Element3 = driver.findElements(WhatsappLink).size();
		Assert.assertEquals(Element3, 1);
		int Element4 = driver.findElements(DirectShare).size();
		Assert.assertEquals(Element4, 1);
	}
	
	public void StoryContent(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(StoryContent);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(StoryContent).size();
		Assert.assertEquals(Element, 1);
	}
	
	

}

