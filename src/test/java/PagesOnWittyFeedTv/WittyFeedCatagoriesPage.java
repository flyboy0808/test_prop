package PagesOnWittyFeedTv;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import UtilsOnFeed.WrapperGenericMethod;


public class WittyFeedCatagoriesPage {

	By HomePageLogo = By.cssSelector(".brand-logo > svg:nth-child(1)");
	By HamburgerMenu = By.cssSelector(".navSide-logo > a:nth-child(1) > svg:nth-child(1)");
    By News = By.cssSelector("li.vtpl_listMenu__section:nth-child(1) > a:nth-child(1)");
    By Politics = By.cssSelector("li.vtpl_listMenu__section:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)");
    By Social = By.cssSelector("li.vtpl_listMenu__section:nth-child(1) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)");
    By Trending = By.cssSelector("li.vtpl_listMenu__section:nth-child(1) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1)");
    By Global = By.cssSelector("li.vtpl_listMenu__section:nth-child(1) > ul:nth-child(2) > li:nth-child(4) > a:nth-child(1)");
    By LifeStyle = By.cssSelector("li.vtpl_listMenu__section:nth-child(2) > a:nth-child(1)");
    By Health = By.cssSelector("li.vtpl_listMenu__section:nth-child(2) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)");
    By Relationship = By.cssSelector("li.vtpl_listMenu__section:nth-child(2) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)");
    By Travel = By.cssSelector("li.vtpl_listMenu__section:nth-child(2) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1)");
    By Culture = By.cssSelector("li.vtpl_listMenu__section:nth-child(2) > ul:nth-child(2) > li:nth-child(4) > a:nth-child(1)");
    By Fashion = By.cssSelector("li.vtpl_listMenu__section:nth-child(2) > ul:nth-child(2) > li:nth-child(5) > a:nth-child(1)");
    By Entertainment = By.cssSelector("li.vtpl_listMenu__section:nth-child(3) > a:nth-child(1)");
    By Bollywood = By.cssSelector("li.vtpl_listMenu__section:nth-child(3) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)");
    By SocialCelebrities = By.cssSelector("li.vtpl_listMenu__section:nth-child(3) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)");
    By Sports = By.cssSelector("li.vtpl_listMenu__section:nth-child(3) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1)");
    By Hollywood = By.cssSelector("li.vtpl_listMenu__section:nth-child(3) > ul:nth-child(2) > li:nth-child(4) > a:nth-child(1)");
    By Opinion = By.cssSelector("li.vtpl_listMenu__section:nth-child(4) > a:nth-child(1)");
    By IndiaKaPulse = By.cssSelector("li.vtpl_listMenu__section:nth-child(5) > a:nth-child(1)");
    By SocialImpact = By.cssSelector("li.vtpl_listMenu__section:nth-child(6) > a:nth-child(1)");
    By Girling = By.cssSelector("li.vtpl_listMenu__section:nth-child(7) > a:nth-child(1)");
    By Videos = By.cssSelector("li.vtpl_listMenu__section:nth-child(8) > a:nth-child(1)");
    By Quiz = By.cssSelector("li.vtpl_listMenu__section:nth-child(9) > a:nth-child(1)");


	WrapperGenericMethod Action = new WrapperGenericMethod();


	public void ClickHamburgerMenu(WebDriver driver) {

		Action.Click(driver, HamburgerMenu);
	}

	public void NewsCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(News);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(News).size();
		Assert.assertEquals(Element, 1);
	}

	public void NewsSubCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Politics);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Politics).size();
		Assert.assertEquals(Element, 1);
	}

	public void LifeStyleCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(LifeStyle);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(LifeStyle).size();
		Assert.assertEquals(Element, 1);
	}

	public void LifeStyleSubCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Health);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Health).size();
		Assert.assertEquals(Element, 1);
	}

	public void EntertainmentCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Entertainment);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Entertainment).size();
		Assert.assertEquals(Element, 1);
	}

	
	public void EntertainmentSubCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Entertainment);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Entertainment).size();
		Assert.assertEquals(Element, 1);
	}

	public void BollywoodSubCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Bollywood);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Bollywood).size();
		Assert.assertEquals(Element, 1);
	}

	public void Opinion(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Opinion);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Opinion).size();
		Assert.assertEquals(Element, 1);
	}

	public void IndiaKaPulse(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(IndiaKaPulse);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(IndiaKaPulse).size();
		Assert.assertEquals(Element, 1);
	}
	
	public void SocialImpact(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(SocialImpact);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(SocialImpact).size();
		Assert.assertEquals(Element, 1);
	}
	
	public void Girling(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Girling);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Girling).size();
		Assert.assertEquals(Element, 1);
	}

	public void Videos(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(Videos);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Videos).size();
		Assert.assertEquals(Element, 1);
	}
	public void Quiz(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(IndiaKaPulse);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(Quiz).size();
		Assert.assertEquals(Element, 1);
	}
	public void ClickNews(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(News);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, News);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.wittyfeed.tv/news");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
		

	}

	public void ClickPolitics(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Politics);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Politics);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.wittyfeed.tv/news/politics");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickSocial(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Social);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Social);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.wittyfeed.tv/news/social");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickTrending(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Trending);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Trending);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.wittyfeed.tv/news/trending");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickGlobal(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Global);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Global);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.wittyfeed.tv/news/global");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void ClickLifeStyle(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(LifeStyle);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, LifeStyle);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.wittyfeed.tv/lifestyle");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void Health(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Health);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Health);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.wittyfeed.tv/lifestyle/health");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void Relationship(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Relationship);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Relationship);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.wittyfeed.tv/lifestyle/relationship");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void Travel(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Travel);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Travel);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.wittyfeed.tv/lifestyle/travel");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}
	
	public void Culture(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Culture);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Culture);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.wittyfeed.tv/lifestyle/culture");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void Fashion(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Fashion);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Fashion);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.wittyfeed.tv/lifestyle/fashion");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void Entertainment(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Entertainment);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Entertainment);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.wittyfeed.tv/entertainment");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void Bollywood(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Bollywood);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Bollywood);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.wittyfeed.tv/entertainment/bollywood");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void SocialCelebrities(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(SocialCelebrities);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, SocialCelebrities);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.wittyfeed.tv/entertainment/social-celebrities");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void Sports(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Sports);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Sports);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.wittyfeed.tv/entertainment/sports");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void Hollywood(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Hollywood);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Hollywood);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.wittyfeed.tv/entertainment/hollywood");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}



	public void ClickOpinion(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Opinion);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Opinion);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.wittyfeed.tv/opinion");
		
		Action.Click(driver, HomePageLogo);
		
	}
	
public void ClickIndiaKaPulse(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(IndiaKaPulse);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, IndiaKaPulse);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.wittyfeed.tv/india-ka-pulse");
		
		Action.Click(driver, HomePageLogo);
		
	}
public void ClickSocialImpact(WebDriver driver) throws InterruptedException {
	
	WebElement element1 = driver.findElement(SocialImpact);
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
	Thread.sleep(1000);

	Action.Click(driver, SocialImpact);

	String URL = driver.getCurrentUrl();

	Assert.assertEquals(URL, "https://www.wittyfeed.tv/social-impact");
	
	Action.Click(driver, HomePageLogo);
	
}
public void ClickGirling(WebDriver driver) throws InterruptedException {
	
	WebElement element1 = driver.findElement(Girling);
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
	Thread.sleep(1000);

	Action.Click(driver, Girling);

	String URL = driver.getCurrentUrl();

	Assert.assertEquals(URL, "https://www.wittyfeed.tv/girling");
	
	Action.Click(driver, HomePageLogo);
	
}
public void ClickVideos(WebDriver driver) throws InterruptedException {
	
	WebElement element1 = driver.findElement(Videos);
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
	Thread.sleep(1000);

	Action.Click(driver, Videos);

	String URL = driver.getCurrentUrl();

	Assert.assertEquals(URL, "https://www.wittyfeed.tv/videos");
	
	Action.Click(driver, HomePageLogo);
	
}
public void ClickQuiz(WebDriver driver) throws InterruptedException {
	
	WebElement element1 = driver.findElement(Opinion);
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
	Thread.sleep(1000);

	Action.Click(driver, Quiz);

	String URL = driver.getCurrentUrl();

	Assert.assertEquals(URL, "https://www.wittyfeed.tv/quiz");
	
	Action.Click(driver, Quiz);
	
}

}
