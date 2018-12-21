package PopplePages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TagsPage {
	
By tag = By.cssSelector("body > div.row.vtpl-storyTags.contain > div.col.s12.vtpl-storyTagWapper > ul > li:nth-child(1) > a");


public void tags(WebDriver driver) {
	
	int Element = driver.findElements(tag).size();
		Assert.assertEquals(Element, 1);
	}
	
	
}



