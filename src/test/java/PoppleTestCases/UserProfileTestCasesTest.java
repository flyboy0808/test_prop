package PoppleTestCases;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PopplePages.UserProfilePage;
import PoppleUtils.ReadPropertiesFilesPopple;

public class UserProfileTestCasesTest extends ReportGenerateTest {

	static Properties properties = null;

//	WebDriver driver = new ChromeDriver();
//	String st = System.setProperty("webdriver.chrome.driver", "chromedriver");

	UserProfilePage obj = new UserProfilePage();

//	@BeforeTest
//	public void OpenBrowser() throws IOException {
//
//		ReadPropertiesFilesPopple readConfigFile = new ReadPropertiesFilesPopple();
//
//		properties = readConfigFile.LoadPropertiess();
//		driver.get(properties.getProperty("URL"));
//		driver.manage().window().maximize();
//
//	}

	@Test(priority = 112)
	public void ClickAuthorName() throws IOException {

		ReadPropertiesFilesPopple readConfigFile = new ReadPropertiesFilesPopple();

		properties = readConfigFile.LoadPropertiess();
		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();
		test = extent.createTest("Test 1 - Click Author Name");
		obj.ClickAuthorName(driver);

	}

	@Test(priority = 113)
	public void CheckBackgroundImage() {

		test = extent.createTest("Test 1 - Check Background Image");
		obj.BackgroundImage(driver);

	}

	@Test(priority = 114)
	public void CheckAuthorName() {

		test = extent.createTest("Test 1 - Check Author Name");
		obj.AuthorName(driver);

	}

	@Test(priority = 115)
	public void CheckAuthorImage() {
		test = extent.createTest("Test 1 - Check Author Image");
		obj.AuthorImage(driver);

	}

	@Test(priority = 116)
	public void CheckWriterName() {

		test = extent.createTest("Test 1 - Check Writer Name");
		obj.WriterName(driver);
	}

	@Test(priority = 117)
	public void CheckEditor() {
		test = extent.createTest("Test 1 - Check Editor");
		obj.Editor(driver);

	}

//	@Test(priority = 7)
//	public void CheckFacebookLink() {
//		test = extent.createTest("Test 1 - Check Facebook Link");
//		
//		
//		obj.FacebookLink(driver);
//
//	}
//
//	@Test(priority = 8)
//	public void CheckTwitterLink() {
//		test = extent.createTest("Test 1 - Check Twitter Link");
//		obj.TwitterLink(driver);
//
//	}
//
//	@Test(priority = 9)
//	public void CheckLinkedinLink() {
//		test = extent.createTest("Test 1 - Check Linkedin Link");
//		obj.LinkedinLink(driver);
//
//	}

	@Test(priority = 118)
	public void CheckProfileDesc() {
		test = extent.createTest("Test 1 - Check Profile Desc");
		obj.ProfileDesc(driver);
	}

	@Test(priority = 119)
	public void CheckDontMissThisStory() {

		test = extent.createTest("Test 1 - Check Dont Miss This Story");
		obj.DontMissThisStory(driver);

	}

	@Test(priority = 120)
	public void LatestStories() {

		test = extent.createTest("Test 1 - Latest Stories");
		obj.LatestStories(driver);

	}

}
