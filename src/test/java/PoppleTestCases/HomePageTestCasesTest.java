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
import PoppleUtils.ReadPropertiesFilesPopple;

public class HomePageTestCasesTest extends ReportGenerateTest {

	static Properties properties = null;
	

	PoppleHomePage DashboardItem = new PoppleHomePage();

//	@BeforeTest
//	public void OpenBrowser() throws IOException {
//		
//
//		ReadPropertiesFilesPopple readConfigFile = new ReadPropertiesFilesPopple();
//
//		properties = readConfigFile.LoadPropertiess();
//
//		driver.get(properties.getProperty("URL"));
//		driver.manage().window().maximize();
//
//}

	@Test(priority = 68)
	public void CheckSearchOption() throws Exception {
		ReadPropertiesFilesPopple readConfigFile = new ReadPropertiesFilesPopple();

		properties = readConfigFile.LoadPropertiess();

		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();
		test = extent.createTest("Test 1 - Check Search Option");
		DashboardItem.SearchOption(driver);

	}

	@Test(priority = 69)
	public void CheckFacebookLink() throws Exception {
		test = extent.createTest("Test 2 - Check Facebook Link");
		DashboardItem.FacebookLink(driver);

	}

	@Test(priority = 70)
	public void CheckInstaLink() throws Exception {
		test = extent.createTest("Test 3 - Check Facebook Link");
		DashboardItem.InstaLink(driver);

	}

	@Test(priority = 71)
	public void CheckTwittLink() throws Exception {
		test = extent.createTest("Test 4 - Check Twitter Link");
		DashboardItem.TwittLink(driver);

	}

	@Test(priority = 72)
	public void CheckYouTubeLink() throws Exception {
		test = extent.createTest("Test 5 - Check YouTube Link");
		DashboardItem.YouTubeLink(driver);

	}

	@Test(priority = 73)
	public void CheckSiteLogo() throws Exception {
		test = extent.createTest("Test 6 - Check Site Logo");
		DashboardItem.SiteLogo(driver);

	}

	@Test(priority = 74)
	public void CheckPositiveCategoriesLink() throws Exception {
		test = extent.createTest("Test 7 - Check PositiveCategories Link");
		DashboardItem.PositiveCategories(driver);

	}

	@Test(priority = 75)
	public void CheckpopularCategoriesLink() throws Exception {
		test = extent.createTest("Test 8 - Check popular Categories Link");
		DashboardItem.popularCategories(driver);

	}

	@Test(priority = 76)
	public void CheckPeopleCategoriesLink() throws Exception {
		test = extent.createTest("Test 9 - Check People Categories Link");
		DashboardItem.PeopleCategories(driver);

	}

	@Test(priority = 77)
	public void CheckVideosLink() throws Exception {
		test = extent.createTest("Test 10 - Check Videos Link");
		DashboardItem.Videos(driver);

	}

	@Test(priority = 78)
	public void CheckQuizLink() throws Exception {
		test = extent.createTest("Test 11 - Check Quiz Link");
		DashboardItem.Quize(driver);

	}

	@Test(priority = 79)
	public void CheckFeaturedPostImage() throws Exception {
		test = extent.createTest("Test 12 - Check Featured Post Image");
		DashboardItem.FeaturedPostImage(driver);

	}

	@Test(priority = 80)
	public void CheckFeaturedPostTitle() throws Exception {
		test = extent.createTest("Test 13 - Check Featured Post Title");
		DashboardItem.FeaturedPostContent(driver);

	}

	@Test(priority = 81)
	public void CheckFeaturedPostAuthor() throws Exception {
		test = extent.createTest("Test 14 - Check Featured Post Author");
		DashboardItem.FeaturedPostAuthor(driver);

	}

	@Test(priority = 82)

	public void CheckSecondPostImage() {
		test = extent.createTest("Test 15 - Check Second Post Image");

		DashboardItem.SecondPostImage(driver);
	}

	@Test(priority = 83)

	public void CheckSecondPostTitle() {
		test = extent.createTest("Test 16 - Check Second Post Title");

		DashboardItem.SecondPostContent(driver);
	}

	@Test(priority = 84)

	public void CheckSecondPostAuthor() {
		test = extent.createTest("Test 17 - Check Second Post Author");

		DashboardItem.SecondPostAuthor(driver);

	}

	@Test(priority = 85)
    public void CheckThirdPostImage() {
		test = extent.createTest("Test 18 - Check Third Post Image");

		DashboardItem.ThirdPostImage(driver);
	}

	@Test(priority = 86)
    public void CheckThirdPostTitle() {
		test = extent.createTest("Test 19 - Check Third Post Title");

		DashboardItem.ThirdPostContent(driver);
	}

	@Test(priority = 87)
    public void CheckThirdPostAuthor() {
		test = extent.createTest("Test 20 - Check Third Post Author");

		DashboardItem.ThirdPostAuthor(driver);
	}

	@Test(priority = 88)
    public void CheckLatestStoryImage() {
		test = extent.createTest("Test 21 - Check Latest Story Image");
		// *[@id="_2223202241376"]/g[3]/path[3]
		DashboardItem.LatestStoryImage(driver);
	}

	@Test(priority = 89)

	public void CheckLatestStoryTitle() {
		test = extent.createTest("Test 22 - Check Latest Story Title");

		DashboardItem.LatestStoryContent(driver);
	}

	@Test(priority = 90)

	public void CheckLatestStoryAuthor() throws InterruptedException {
		test = extent.createTest("Test 23 - Check Latest Story Author");

		DashboardItem.LatestStoryAuthor(driver);
	}

	@Test(priority = 91)

	public void CheckTheVideo1() throws InterruptedException {
		test = extent.createTest("Test 24 - Check first video");

		DashboardItem.video1(driver);

	}

	@Test(priority = 92)

	public void Checkvideo2() throws InterruptedException {
		test = extent.createTest("Test 25 - Check second video");

		DashboardItem.video2(driver);

	}

	@Test(priority = 93)

	public void CheckQuizeFeedImage() throws InterruptedException {
		test = extent.createTest("Test 26 - Check Quize Feed Image");

		DashboardItem.QuizeFeedImage(driver);

	}

	@Test(priority = 94)

	public void CheckQuizefeedTitle() throws InterruptedException {
		test = extent.createTest("Test 27 - Check Quize feed Title");

		DashboardItem.QuizefeedContent(driver);

	}

	@Test(priority = 95)

	public void QuizeFeedAuthor() throws InterruptedException {
		test = extent.createTest("Test 28 - Quize Feed Author");

		DashboardItem.QuizeFeedAuthor(driver);

	}

	@Test(priority = 96)

	public void CheckEatSleepReadReaptImage() throws InterruptedException {
		test = extent.createTest("Test 29 - Check Eat Sleep ReadReapt Image");

		DashboardItem.EatSleepReadReaptImage(driver);

	}

	@Test(priority = 97)

	public void CheckEatSleepReadReaptTitle() throws InterruptedException {
		test = extent.createTest("Test 30 - Check Eat Sleep ReadReapt Title");

		DashboardItem.EatSleepReadReaptContent(driver);

	}

	@Test(priority = 98)

	public void CheckEatSleepReadReaptAuthor() throws InterruptedException {
		test = extent.createTest("Test 31 - Check Eat SleepRead Reapt Author");

		DashboardItem.EatSleepReadReaptAuthor(driver);

	}

}
