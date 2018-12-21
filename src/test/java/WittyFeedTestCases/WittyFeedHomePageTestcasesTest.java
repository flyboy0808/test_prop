package WittyFeedTestCases;

import java.util.Properties;
import org.testng.annotations.Test;
import PagesOnWittyFeedTv.WittyFeedHomePage;
import UtilsOnFeed.ReadPropertiesFileWittyTv;

public class WittyFeedHomePageTestcasesTest extends ReportGenerateWittyTest {

   static Properties properties = null;

	WittyFeedHomePage obj = new WittyFeedHomePage();

	@Test(priority = 75)
	public void CheckSearchOption() throws Exception {
		ReadPropertiesFileWittyTv readConfigFile = new ReadPropertiesFileWittyTv();

		properties = readConfigFile.LoadPropertiess();
        driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();
		test = extent.createTest("Test 75 - Check Search Option");
		obj.SearchOption(driver);
}

	@Test(priority = 76)
	public void CheckSiteLogo() {
		test = extent.createTest("Test 76 - Check Search Option");
		obj.SiteLogo(driver);

	}

	@Test(priority = 77)
	public void CheckNewsCategories() {
		test = extent.createTest("Test 77 - Check Search Option");

		obj.NewsCategories(driver);
	}

	@Test(priority = 78)
	public void CheckLifeStyleCategories() throws InterruptedException {
		test = extent.createTest("Test 78 - Check Search Option");

		obj.LifeStyleCategories(driver);
	}

	@Test(priority = 79)
	public void CheckEntertainmentCategories() {
		test = extent.createTest("Test 79 - Check Search Option");

		obj.EntertainmentCategories(driver);
	}

	@Test(priority = 80)
	public void CheckOpinion( ) {
		test = extent.createTest("Test 80 - Check Search Option");

		obj.Opinion(driver);
	}

	@Test(priority = 81)
	public void CheckIndiaKaPulse( ) {
		test = extent.createTest("Test 81 - Check Search Option");

		obj.IndiaKaPulse(driver);
	}

	@Test(priority = 82)
	public void CheckGirling( ) {
		test = extent.createTest("Test 82 - Check Search Option");

		obj.Girling(driver);
	}

	@Test(priority = 83)
	public void CheckVideos( ) {
		test = extent.createTest("Test 83 - Check Search Option");

		obj.Videos(driver);
	}

	@Test(priority = 84)
	public void CheckQuiz( ) {
		test = extent.createTest("Test 84 - Check Search Option");
		obj.Quiz(driver);
	}

	@Test(priority = 85)
	public void CheckInstaLink( ) {
		test = extent.createTest("Test 85 - Check Search Option");

		obj.InstaLink(driver);
	}

	@Test(priority = 86)
	public void CheckTwitterLink( ) {
		test = extent.createTest("Test 86 - Check Search Option");

		obj.TwitterLink(driver);
	}

	@Test(priority = 87)
	public void CheckFacebookLink( ) {
		test = extent.createTest("Test 87 - Check Search Option");
		obj.FacebookLink(driver);
	}

	@Test(priority = 88)
	public void CheckYouTubeLink( ) {
		test = extent.createTest("Test 88 - Check Search Option");
		obj.YouTubeLink(driver);
	}

	@Test(priority = 89)
	public void CheckFeaturedPostImage( ) {
		test = extent.createTest("Test 89 - Check Search Option");
		obj.FeaturedPostImage(driver);
	}

	@Test(priority = 90)
	public void CheckFeaturedPostTitle( ) {
		test = extent.createTest("Test 90 - Check Search Option");
		obj.FeaturedPostTitle(driver);

	}

	@Test(priority = 91)
	public void CheckFeaturedPostAuthor( ) {
		test = extent.createTest("Test 91 - Check Search Option");
		obj.FeaturedPostAuthor(driver);
	}

	@Test(priority = 92)
	public void CheckSecondPostImage( ) {
		test = extent.createTest("Test 92 - Check Search Option");
		obj.SecondPostImage(driver);
	}

	@Test(priority = 93)
	public void CheckSecondPostTitle( ) {
		test = extent.createTest("Test 93 - Check Search Option");
		obj.SecondPostTitle(driver);

	}

	@Test(priority = 94)
	public void CheckSecondPostAuthor( ) {
		test = extent.createTest("Test 94 - Check Search Option");
		obj.SecondPostAuthor(driver);

	}

	@Test(priority = 95)
	public void CheckThirdPostImage( ) {
		test = extent.createTest("Test 95 - Check Search Option");
		obj.ThirdPostImage(driver);
	}

	@Test(priority = 96)
	public void CheckThirdPostTitle( ) {
		test = extent.createTest("Test 96 - Check Search Option");
		obj.ThirdPostTitle(driver);
	}

	@Test(priority = 97)
	public void CheckThirdPostAuthor( ) throws InterruptedException {
		test = extent.createTest("Test 97 - Check Search Option");

		obj.ThirdPostAuthor(driver);
	}

	@Test(priority = 98)
	public void CheckLatestStoryImage( ) throws InterruptedException {
		test = extent.createTest("Test 98 - Check Search Option");

		obj.LatestStoryImage(driver);
	}

	@Test(priority = 99)
	public void CheckLatestStoryTitle( ) throws InterruptedException {
		test = extent.createTest("Test 99 - Check Search Option");

		obj.LatestStoryTitle(driver);

	}

	@Test(priority = 100)
	public void CheckLatestStoryAuthor( ) throws InterruptedException {
		test = extent.createTest("Test 100 - Check Search Option");

		obj.LatestStoryAuthor(driver);
	}

	@Test(priority = 101)
	public void CheckWittyVideo1( ) throws InterruptedException {
		test = extent.createTest("Test 101 - Check Search Option");
		obj.WittyVideo1(driver);

	}

	@Test(priority = 102)
	public void CheckWittyVideo2( ) throws InterruptedException {
		test = extent.createTest("Test 102 - Check Search Option");
		obj.WittyVideo2(driver);

	}

	@Test(priority = 103)
	public void CheckQuizeFeedImage( ) throws InterruptedException {
		test = extent.createTest("Test 103 - Check Search Option");
		obj.QuizeFeedImage(driver);

	}

	@Test(priority = 104)
	public void CheckQuizefeedTitle( ) throws InterruptedException {
		test = extent.createTest("Test 104 - Check Search Option");
		obj.QuizefeedTitle(driver);

	}

	@Test(priority = 105)
	public void CheckQuizeFeedAuthor( ) throws InterruptedException {
		test = extent.createTest("Test 105 - Check Search Option");
		obj.QuizeFeedAuthor(driver);

	}

	@Test(priority = 106)
	public void CheckEatSleepReadReaptImage( ) throws InterruptedException {
		test = extent.createTest("Test 106 - Check Search Option");
		obj.EatSleepReadReaptImage(driver);
	}

	@Test(priority = 107)
	public void CheckEatSleepReadReaptTitle( ) throws InterruptedException {
		test = extent.createTest("Test 107 - Check Search Option");

		obj.EatSleepReadReaptTitle(driver);
	}

	@Test(priority = 108)
	public void CheckEatSleepReadReaptAuthor( ) throws InterruptedException {
		test = extent.createTest("Test 108 - Check Search Option");

		obj.EatSleepReadReaptAuthor(driver);

	}
}
