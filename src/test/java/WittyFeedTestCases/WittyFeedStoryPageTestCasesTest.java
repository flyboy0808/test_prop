package WittyFeedTestCases;

import java.util.Properties;
import org.testng.annotations.Test;
import PagesOnWittyFeedTv.WittyFeedStoryPage;
import UtilsOnFeed.ReadPropertiesFileWittyTv;


public class WittyFeedStoryPageTestCasesTest extends ReportGenerateWittyTest {

	static Properties properties = null;

	WittyFeedStoryPage StoryItem = new WittyFeedStoryPage();


    @Test(priority = 113)
	public void OpenStoryPage() throws Exception {
		
		ReadPropertiesFileWittyTv readConfigFile = new ReadPropertiesFileWittyTv();

		properties = readConfigFile.LoadPropertiess();

		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();
		test = extent.createTest("Test 113 - Open Story Page");
		StoryItem.ClickFeaturedPost(driver);

	}

//	@Test(priority = 114)
//	public void CheckAdvertisementFrame() throws Exception {
//		test = extent.createTest("Test 114 - Check Advertisement Frame");
//		StoryItem.AdvertisementFrame(driver);
//
//	}

	@Test(priority = 115)
	public void CheckStoryAuthor() throws Exception {
		test = extent.createTest("Test 115 - Check Story Author");
		StoryItem.StoryAuthor(driver);

	}

	@Test(priority = 116)
	public void CheckStoryTitle() throws Exception {
		test = extent.createTest("Test 116 - Check Story Title");
		StoryItem.StoryTitle(driver);

	}

	@Test(priority = 117)
	public void CheckStoryDesc() throws Exception {
		test = extent.createTest("Test 117 - Check Search Desc");
		StoryItem.StoryDesc(driver);

	}

	@Test(priority = 118)
	public void CheckStoryShares() throws Exception {

		test = extent.createTest("Test 1118 - Check Story Shares");
		StoryItem.StoryShares(driver);

	}

	@Test(priority = 119)
	public void CheckStoryShareOptions() throws Exception {
		test = extent.createTest("Test 119 - Check Story Share Options");
		StoryItem.StoryShareOptions(driver);

	}

	@Test(priority = 120)
	public void CheckStoryContent() throws Exception {
		test = extent.createTest("Test 120 - Check Story Content");
		StoryItem.StoryContent(driver);

	}

}
