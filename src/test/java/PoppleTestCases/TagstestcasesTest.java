package PoppleTestCases;

import java.util.Properties;
import org.testng.annotations.Test;
import PopplePages.PoppleHomePage;
import PopplePages.TagsPage;
import PoppleUtils.ReadPropertiesFilesPopple;

public class TagstestcasesTest extends ReportGenerateTest {

	static Properties properties = null;

	PoppleHomePage DashboardItem = new PoppleHomePage();

	TagsPage obj = new TagsPage();

	@Test(priority = 121)
	public void CheckSearchOption() throws Exception {
		ReadPropertiesFilesPopple readConfigFile = new ReadPropertiesFilesPopple();

		properties = readConfigFile.LoadPropertiess();

		driver.get("https://www.thepopple.com/tags");
		driver.manage().window().maximize();
		test = extent.createTest("Test 1 - Check Search Option");
		DashboardItem.SearchOption(driver);
	}

	@Test(priority = 122)
	public void CheckSearchTags() throws Exception {

		obj.tags(driver);

	}

}
