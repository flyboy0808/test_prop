package PoppleTestCases;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import PopplePages.CatagoriesPage;
import PoppleUtils.ReadPropertiesFilesPopple;

public class CatagoriesPageTestCasesTest extends ReportGenerateTest {

	static Properties properties = null;

	CatagoriesPage CatagoryItem = new CatagoriesPage();

	@Test(priority = 33)

	public void ClickHamburgerMenu() throws Exception {

		ReadPropertiesFilesPopple readConfigFile = new ReadPropertiesFilesPopple();

		properties = readConfigFile.LoadPropertiess();

		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();

		test = extent.createTest("Test 1 - Click hamburger menu");
		CatagoryItem.ClickHamburgerMenu(driver);

	}

	@Test(priority = 34)
	public void CheckPositiveCata() throws Exception {

		test = extent.createTest("Test 2 - Check Positive Catagory");
		CatagoryItem.PositiveCata(driver);

	}

//	@Test(priority = 35)
//	public void CheckPositiveSubCata() throws Exception {
//		test = extent.createTest("Test 3 - Check Positive SubCatagory");
//		CatagoryItem.PositiveSubCata(driver);
//	}

	@Test(priority = 36)
	public void CheckPopularCata() throws Exception {
		test = extent.createTest("Test 4 - Check Popular Catagory");
		CatagoryItem.PopularCata(driver);

	}

//	@Test(priority = 37)
//	public void CheckPopularSubCata() throws Exception {
//		test = extent.createTest("Test 5 - Check Popular SubCatagory");
//		CatagoryItem.PopularSubCata(driver);
//
//	}

	@Test(priority = 38)
	public void CheckpeopleCata() throws Exception {
		test = extent.createTest("Test 6 - Check people Catagory");
		CatagoryItem.peopleCata(driver);

	}

//	@Test(priority = 39)
//	public void CheckpeopleSubCata() throws Exception {
//		test = extent.createTest("Test 7 - Check people SubCatagory");
//
//		CatagoryItem.peopleSubCata(driver);
//	}

	@Test(priority = 40)
	public void CheckVideoLink() throws Exception {
		test = extent.createTest("Test 8 - Check Video Link");
		CatagoryItem.Videocata(driver);

	}

	@Test(priority = 41)
	public void CheckQuizLink() throws Exception {
		test = extent.createTest("Test 26 - Check Quiz Link");
		CatagoryItem.Quizcata(driver);

	}

	@Test(priority = 42)
	public void CheckPositivePage() throws Exception {
		test = extent.createTest("Test 9 - Check Positive Page");
		CatagoryItem.Positive(driver);

	}

//	@Test(priority = 43)
//	public void CheckAnimalsPage() throws Exception {
//		test = extent.createTest("Test 10 - Check Animals Page");
//		CatagoryItem.animals(driver);
//	}
//
//	@Test(priority = 44)
//	public void CheckHumorPage() throws Exception {
//		test = extent.createTest("Test 11 - Check Humor Page");
//		CatagoryItem.humor(driver);
//	}
//
//	@Test(priority = 45)
//	public void CheckTravelPage() throws Exception {
//		test = extent.createTest("Test 12 - Check Travel Page");
//		CatagoryItem.travel(driver);
//	}
//
//	@Test(priority = 46)
//	public void CheckDiyPage() throws Exception {
//		test = extent.createTest("Test 13 - Check Diy Page");
//		CatagoryItem.diy(driver);
//	}

	@Test(priority = 47)
	public void CheckPopularPage() throws Exception {
		test = extent.createTest("Test 14 - Check Popular Page");
		CatagoryItem.popular(driver);

	}

//	@Test(priority = 48)
//	public void CheckTerendingPage() throws Exception {
//		test = extent.createTest("Test 15 - Check Terending Page");
//		CatagoryItem.Terending(driver);
//	}
//
//	@Test(priority = 49)
//	public void CheckCulturePage() throws Exception {
//		test = extent.createTest("Test 16 - Check Culture Page");
//		CatagoryItem.Culture(driver);
//	}
//
//	@Test(priority = 50)
//	public void CheckSportsPage() throws Exception {
//		test = extent.createTest("Test 17 - Check Sports Page");
//		CatagoryItem.Sports(driver);
//	}
//
//	@Test(priority = 51)
//	public void CheckTechnologyPage() throws Exception {
//		test = extent.createTest("Test 18 - Check Technology Page");
//		CatagoryItem.Technology(driver);
//	}

	@Test(priority = 52)
	public void CheckPeoplePage() throws Exception {
		test = extent.createTest("Test 19 - Check People Page");
		CatagoryItem.People(driver);
	}
//
//	@Test(priority = 53)
//	public void CheckEntertainmentPage() throws Exception {
//		test = extent.createTest("Test 20 - Check Entertainment Page");
//		CatagoryItem.Entertainment(driver);
//	}
//
//	@Test(priority = 54)
//	public void CheckLifestylePage() throws Exception {
//		test = extent.createTest("Test 21 - Check Lifestyle Page");
//		CatagoryItem.Lifestyle(driver);
//	}
//
//	@Test(priority = 55)
//	public void CheckRelationshipPage() throws Exception {
//		test = extent.createTest("Test 22 - Check Relationship Page");
//		CatagoryItem.Relationship(driver);
//	}
//
//	@Test(priority = 56)
//	public void CheckOpinionPage() throws Exception {
//		test = extent.createTest("Test 23 - Check Opinion Page");
//		CatagoryItem.Opinion(driver);
//
//	}

	@Test(priority = 57)
	public void CheckVideoPage() throws Exception {
		test = extent.createTest("Test 24 - Check Video Page");
		CatagoryItem.Video(driver);

	}

	@Test(priority = 58)
	public void CheckQuizPage() throws Exception {
		test = extent.createTest("Test 25 - Check Quiz Page");
		CatagoryItem.Quiz(driver);

	}

}
