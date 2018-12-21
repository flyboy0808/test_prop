package WittyFeedTestCases;

import java.util.Properties;
import org.testng.annotations.Test;
import PagesOnWittyFeedTv.WittyFeedCatagoriesPage;
import UtilsOnFeed.ReadPropertiesFileWittyTv;

public class WittyFeedCatagoiesTestCasesTest extends ReportGenerateWittyTest {

	static Properties properties = null;

	WittyFeedCatagoriesPage CatagoryItem = new WittyFeedCatagoriesPage();

	@Test(priority = 33)
    public void ClickHamburgerMenu() throws Exception {

		ReadPropertiesFileWittyTv readConfigFile = new ReadPropertiesFileWittyTv();

		properties = readConfigFile.LoadPropertiess();

		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();

		test = extent.createTest("Test 33 - Click hamburger menu");
		CatagoryItem.ClickHamburgerMenu(driver);

	}
    
	@Test(priority = 34)
	public void CheckNewsCata() throws Exception {

		test = extent.createTest("Test 34 - Check News Catagory");
		CatagoryItem.NewsCata(driver);

	}

	@Test(priority = 35)
	public void CheckNewsSubCata() throws Exception {
		test = extent.createTest("Test 35 - Check News SubCatagory");
		CatagoryItem.NewsSubCata(driver);
	}

	@Test(priority = 36)
	public void CheckLifeStyleCata() throws Exception {
		test = extent.createTest("Test 36 - Check LifeStyle Catagory");
		CatagoryItem.LifeStyleCata(driver);

	}

	@Test(priority = 37)
	public void CheckLifeStyleSubCata() throws Exception {
		test = extent.createTest("Test 37 - Check LifeStyle SubCatagory");
		CatagoryItem.LifeStyleSubCata(driver);

	}

	@Test(priority = 38)
	public void CheckEntertainmentCata() throws Exception {
		test = extent.createTest("Test 38 - Check Entertainment Catagory");
		CatagoryItem.EntertainmentCata(driver);

	}

	@Test(priority = 39)
	public void CheckEntertainmentSubCata() throws Exception {
		test = extent.createTest("Test 39 - Check Entertainment SubCatagory");

		CatagoryItem.EntertainmentSubCata(driver);
	}

	@Test(priority = 40)
	public void CheckOpinionLink() throws Exception {
		test = extent.createTest("Test 40 - Check Opinion Link");
		CatagoryItem.Opinion(driver);

	}

	@Test(priority = 41)
	public void CheckIndiaKaPulseLink() throws Exception {
		test = extent.createTest("Test 41 - Check IndiaKaPulse Link");
		CatagoryItem.IndiaKaPulse(driver);

	}

	@Test(priority = 42)
	public void CheckSocialImpactLink() throws Exception {
		test = extent.createTest("Test 42 - Check SocialImpac Link");
		CatagoryItem.SocialImpact(driver);

	}

	@Test(priority = 43)
	public void CheckGirlingLink() throws Exception {
		test = extent.createTest("Test 43 - Check Girling Link");
		CatagoryItem.Girling(driver);

	}

	@Test(priority = 44)
	public void CheckVideosLink() throws Exception {
		test = extent.createTest("Test 44 - Check Videos Link");
		CatagoryItem.Videos(driver);

	}

	@Test(priority = 45)
	public void CheckQuizLink() throws Exception {
		test = extent.createTest("Test 45 - Check Quiz Link");
		CatagoryItem.Quiz(driver);

	}

	@Test(priority = 46)
	public void CheckNewsPage() throws Exception {
		test = extent.createTest("Test 46 - Check News Page");
		CatagoryItem.ClickNews(driver);

	}

	@Test(priority = 47)
	public void CheckPoliticsPage() throws Exception {
		test = extent.createTest("Test 47 - Check Politics Page");
		CatagoryItem.ClickPolitics(driver);
	}

	@Test(priority = 48)
	public void CheckSocialPage() throws Exception {
		test = extent.createTest("Test 48 - Check Social Page");
		CatagoryItem.ClickSocial(driver);
	}

	@Test(priority = 49)
	public void CheckTrendingPage() throws Exception {
		test = extent.createTest("Test 49 - Check Trending Page");
		CatagoryItem.ClickTrending(driver);
	}

	@Test(priority = 50)
	public void CheckLifeStylePage() throws Exception {
		test = extent.createTest("Test 50 - Check LifeStyle Page");
		CatagoryItem.ClickLifeStyle(driver);
	}

	@Test(priority = 51)
	public void CheckHealthPage() throws Exception {
		test = extent.createTest("Test 51 - Check Health Page");
		CatagoryItem.Health(driver);

	}

	@Test(priority = 52)
	public void CheckRelationshipPage() throws Exception {
		test = extent.createTest("Test 52 - Check Relationship Page");
		CatagoryItem.Relationship(driver);
	}

	@Test(priority = 53)
	public void CheckTravelPage() throws Exception {
		test = extent.createTest("Test 53 - Check Travel Page");
		CatagoryItem.Travel(driver);
	}

	@Test(priority = 54)
	public void CheckFashionPage() throws Exception {
		test = extent.createTest("Test 54 - Check Fashion Page");
		CatagoryItem.Fashion(driver);
	}

	@Test(priority = 55)
	public void CheckEntertainmentPage() throws Exception {
		test = extent.createTest("Test 55 - Check Entertainment Page");
		CatagoryItem.Entertainment(driver);
	}

	@Test(priority = 56)
	public void CheckBollywoodPage() throws Exception {
		test = extent.createTest("Test 56 - Check Bollywood Page");
		CatagoryItem.Bollywood(driver);
	}

	@Test(priority = 57)
	public void CheckSocialCelebritiesPage() throws Exception {
		test = extent.createTest("Test 57 - Check SocialCelebrities Page");
		CatagoryItem.SocialCelebrities(driver);
	}

	@Test(priority = 58)
	public void CheckSportsPage() throws Exception {
		test = extent.createTest("Test 58 - Check Sports Page");
		CatagoryItem.Sports(driver);
	}

	@Test(priority = 59)
	public void CheckHollywoodPage() throws Exception {
		test = extent.createTest("Test 59 - Check Hollywood Page");
		CatagoryItem.Relationship(driver);
	}

	@Test(priority = 60)
	public void CheckOpinionPage() throws Exception {
		test = extent.createTest("Test 60 - Check Opinion Page");
		CatagoryItem.Opinion(driver);

	}

	@Test(priority = 61)
	public void CheckIndiaKaPulsePage() throws Exception {
		test = extent.createTest("Test 61 - Check IndiaKaPulse Page");
		CatagoryItem.IndiaKaPulse(driver);

	}

	@Test(priority = 62)
	public void CheckSocialImpactPage() throws Exception {
		test = extent.createTest("Test 62 - Check SocialImpact Page");
		CatagoryItem.SocialImpact(driver);

	}

	@Test(priority = 63)
	public void CheckGirlingPage() throws Exception {
		test = extent.createTest("Test 63 - Check Girling Page");
		CatagoryItem.Girling(driver);

	}

	@Test(priority = 64)
	public void CheckVideosPage() throws Exception {
		test = extent.createTest("Test 64 - Check Videos Page");
		CatagoryItem.Videos(driver);

	}

	@Test(priority = 65)
	public void CheckQuizPage() throws Exception {
		test = extent.createTest("Test 65 - Check Quiz Page");
		CatagoryItem.Quiz(driver);

	}

}
