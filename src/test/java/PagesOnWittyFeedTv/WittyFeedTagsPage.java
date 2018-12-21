package PagesOnWittyFeedTv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class WittyFeedTagsPage {
	
By tag = By.cssSelector(".vtpl-storyTag-list > li:nth-child(1) > a:nth-child(1)");


public void tags(WebDriver driver) {
	
	int Element = driver.findElements(tag).size();
		Assert.assertEquals(Element, 1);
	}
	
	
}



