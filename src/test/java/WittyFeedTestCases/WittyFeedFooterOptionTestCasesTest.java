package WittyFeedTestCases;

import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;
import PagesOnWittyFeedTv.WittyfeedFooterOptionsPages;
import UtilsOnFeed.ReadPropertiesFileWittyTv;

public class WittyFeedFooterOptionTestCasesTest extends ReportGenerateWittyTest {
	static Properties properties = null;

	WittyfeedFooterOptionsPages obj = new WittyfeedFooterOptionsPages();

	@Test(priority = 66)
	public void ClickHamburgerMenu() throws IOException {

		ReadPropertiesFileWittyTv readConfigFile = new ReadPropertiesFileWittyTv();

		properties = readConfigFile.LoadPropertiess();
		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();
		test = extent.createTest("Test 66 - Click hamburger menu");
		obj.ClickHamburgerMenu(driver);
	}

	@Test(priority = 67)
	public void CheckAbutUsLink() {
		test = extent.createTest("Test 67 - Check AbutUs Link");
		obj.AboutUs(driver);
	}

	@Test(priority = 68)
	public void CheckTermsOfUseLink() {
		test = extent.createTest("Test 68 - Check Terms Of UseLink");
		obj.TermsOfUse(driver);

	}

	@Test(priority = 69)
	public void CheckPrivacyPolicyLink() throws InterruptedException {
		test = extent.createTest("Test 69 - Check Privacy Policy Link");
		obj.PrivacyPolicy(driver);
	}

	@Test(priority =70)
	public void CheckCantactUsLink() {
		test = extent.createTest("Test 70 - Check Cantact Us Link");
		obj.ContactUs(driver);
	}

	@Test(priority = 71)
	public void CheckAbutUsPage() throws InterruptedException {
		test = extent.createTest("Test 71 - Check AbutUs Page");
		obj.AboutUsPage(driver);
	}

	@Test(priority = 72)
	public void CheckTermsOfUsePage() throws InterruptedException {
		test = extent.createTest("Test 72 - Check Terms Of Use Page");
		obj.TermsOfUsePage(driver);

	}

	@Test(priority = 73)
	public void CheckPrivacyPolicyPage() throws InterruptedException {
		test = extent.createTest("Test 73 - Check Privacy Policy Page");
		obj.ContactUsPage(driver);

	}

	@Test(priority = 74)
	public void CheckCantactUsPage() {
		test = extent.createTest("Test 74 - Check CantactUs Page");
		obj.ContactUs(driver);
	}

}
