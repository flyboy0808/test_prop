package PagesOnWittyFeedTv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class WittyFeedTagsPage {
	
By tag = By.xpath("/html/body/app-root/app-category/div/div[2]/ul/li[1]/a");


public void tags(WebDriver driver) {
	
	int Element = driver.findElements(tag).size();
		Assert.assertEquals(Element, 1);
	}
	
	
}



