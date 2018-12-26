package PoppleTestCases;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PopplePages.PoppleHomePage;
import PopplePages.StoryPages;
import PoppleUtils.ReadPropertiesFilesPopple;

public class StoryPageTestCasesTest extends ReportGenerateTest {

	static Properties properties = null;

//	WebDriver driver = new ChromeDriver();
//	String st = System.setProperty("webdriver.chrome.driver", "chromedriver");

//	String string = System.setProperty("webdriver.gecko.driver", "geckodriver");
//	WebDriver driver = new FirefoxDriver();

	

	StoryPages StoryItem = new StoryPages();

//	@BeforeTest
//	public void OpenBrowser() throws IOException {
//
//		ReadPropertiesFilesPopple readConfigFile = new ReadPropertiesFilesPopple();
//
//		properties = readConfigFile.LoadPropertiess();
//
//		driver.get(properties.getProperty("URL"));
//		driver.manage().window().maximize();

//	}

	@Test(priority = 103)
	public void OpenStoryPage() throws Exception {
		
		ReadPropertiesFilesPopple readConfigFile = new ReadPropertiesFilesPopple();

		properties = readConfigFile.LoadPropertiess();

		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();
		test = extent.createTest("Test 1 - Open Story Page");
		StoryItem.ClickFeaturedPost(driver);

	}

	@Test(priority = 104)
	public void CheckAdvertisementFrame() throws Exception {
		test = extent.createTest("Test 2 - Check Advertisement Frame");
		StoryItem.AdvertisementFrame(driver);

	}

	@Test(priority = 105)
	public void CheckStoryFirstImage() throws Exception {
		test = extent.createTest("Test 3 - Check Story First Image");
		StoryItem.StoryFirstImage(driver);
	}

	@Test(priority = 106)
	public void CheckStoryAuthor() throws Exception {
		test = extent.createTest("Test 4 - Check Story Author");
		StoryItem.StoryAuthor(driver);

	}

	@Test(priority = 107)
	public void CheckStoryTitle() throws Exception {
		test = extent.createTest("Test 5 - Check Story Title");
		StoryItem.StoryTitle(driver);

	}

	@Test(priority = 108)
	public void CheckStoryDesc() throws Exception {
		test = extent.createTest("Test 6 - Check Search Option");
		StoryItem.StoryDesc(driver);

	}

	@Test(priority = 109)
	public void CheckStoryShares() throws Exception {

		test = extent.createTest("Test 7 - Check Story Desc");
		StoryItem.StoryShares(driver);

	}

	@Test(priority = 110)
	public void CheckStoryShareOptions() throws Exception {
		test = extent.createTest("Test 8 - Check Story Share Options");
		StoryItem.StoryShareOptions(driver);

	}

	@Test(priority = 111)
	public void CheckStoryContent() throws Exception {
		test = extent.createTest("Test 9 - Check Story Content");
		StoryItem.StoryContent(driver);

	}

}
