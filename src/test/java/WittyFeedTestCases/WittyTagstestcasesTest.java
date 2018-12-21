package WittyFeedTestCases;

import java.util.Properties;
import org.testng.annotations.Test;

import PagesOnWittyFeedTv.WittyFeedHomePage;
import PagesOnWittyFeedTv.WittyFeedTagsPage;
import UtilsOnFeed.ReadPropertiesFileWittyTv;


public class WittyTagstestcasesTest extends ReportGenerateWittyTest {

	static Properties properties = null;

	WittyFeedHomePage DashboardItem = new WittyFeedHomePage();

	WittyFeedTagsPage obj = new WittyFeedTagsPage();

	@Test(priority = 130)
	public void CheckSearchOption() throws Exception {
		ReadPropertiesFileWittyTv readConfigFile = new ReadPropertiesFileWittyTv();

		properties = readConfigFile.LoadPropertiess();

		driver.get("https://www.wittyfeed.tv/tags");
		driver.manage().window().maximize();
		test = extent.createTest("Test 121 - Check Search Option");
		DashboardItem.SearchOption(driver);
	}

	@Test(priority = 131)
	public void CheckSearchTags() throws Exception {
		test = extent.createTest("Test 122 - Check Search Tags");
		obj.tags(driver);

	}

}
