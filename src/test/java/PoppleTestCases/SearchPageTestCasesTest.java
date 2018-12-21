package PoppleTestCases;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PopplePages.SearchPage;
import PoppleUtils.ReadPropertiesFilesPopple;

public class SearchPageTestCasesTest extends ReportGenerateTest{

	SearchPage obj = new SearchPage();
	static Properties properties = null;

//	WebDriver driver = new ChromeDriver();
//	String st = System.setProperty("webdriver.chrome.driver", "chromedriver");

//	@BeforeTest
//	public void OpenBrowser() throws IOException {
//
//		ReadPropertiesFilesPopple readConfigFile = new ReadPropertiesFilesPopple();
//
//		properties = readConfigFile.LoadPropertiess();
//		//webdriver.get("https://www.wittyfeed.tv");
//		driver.get(properties.getProperty("URL"));
//		driver.manage().window().maximize();
//
//	}

	@Test(priority = 99)
	public void ClickSearchOption() throws InterruptedException, IOException {
		
		ReadPropertiesFilesPopple readConfigFile = new ReadPropertiesFilesPopple();

		properties = readConfigFile.LoadPropertiess();
		//webdriver.get("https://www.wittyfeed.tv");
		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();

		test = extent.createTest("Test 1 - Click Author Name");
		obj.ClickSearchOption(driver);

	}

	@Test(priority = 100)
	public void CheckSearchHeader() {
		test = extent.createTest("Test 1 - Click Author Name");
		obj.SearchHeader(driver);
	}

	@Test(priority = 101)
	public void CheckSearchedStoryImage() {
		test = extent.createTest("Test 1 - Click Author Name");
		obj.SearchedStoryImage(driver);

	}

	@Test(priority = 102)
	public void CheckSearchedStoryTitle() {
		test = extent.createTest("Test 1 - Click Author Name");
		obj.SearchedStoryTitle(driver);

	}

}
