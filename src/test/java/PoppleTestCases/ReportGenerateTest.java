package PoppleTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.chrome.ChromeOptions;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;

public class ReportGenerateTest {
	
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	//public static WebDriver driver;
	
	public static ChromeDriver driver;
 
  @BeforeSuite
  public void Setup() {
	  
	  
	  		//For Ubuntu
	  		htmlReporter = new ExtentHtmlReporter("ThePoppleTestResult-Automation.html");
	  
	  		// For windows test it 277467854789
		  //  htmlReporter = new ExtentHtmlReporter(("/home/wittyfeed/extentReports")+"/WebsiteTestResult-Automati.html");
		    extent = new ExtentReports();
		    extent.attachReporter(htmlReporter);
		    
		    extent.setSystemInfo("OS", "Linux");
		    extent.setSystemInfo("Host Name", "Test");
		    extent.setSystemInfo("Environment", "QA");
		    extent.setSystemInfo("User Name", "Manish Dangas");

		    htmlReporter.config().setChartVisibilityOnOpen(true);
		    htmlReporter.config().setDocumentTitle("Extent report");
		    htmlReporter.config().setReportName("Test Report");
		    htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);	  
		    
                       
		    //Chrome setup ubuntu
		    System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
			ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            chromeOptions.addArguments("--no-sandbox");
            chromeOptions.addArguments("--disable-dev-shm-usage");
            driver = new ChromeDriver(chromeOptions);	
            //webdriver = new ChromeDriver();
        	driver.manage().window().maximize();
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                       
		  
		    //Chrome setup windows
		    
//		     System.setProperty("webdriver.gecko.driver", "geckodriver");
//		    webdriver  = new FirefoxDriver();
			
//		    WebDriver driver = new ChromeDriver();
//            driver.manage().window().maximize();
//		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
		//	System.setProperty("webdriver.chrome.driver","chromedriver");
		//	driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  
  
  @AfterMethod
  public void getResults(ITestResult result) {
	   if(result.getStatus() == ITestResult.FAILURE)
	    {
	        test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case FAILED due to below issues:", ExtentColor.RED));
	        test.fail(result.getThrowable());
	    }
	    else if(result.getStatus() == ITestResult.SUCCESS)
	    {
	        test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
	    }
	    else
	    {
	        test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case SKIPPED", ExtentColor.ORANGE));
	        test.skip(result.getThrowable());	        
	    }
  }


  @AfterSuite
  public void tearDown() {
	  //webdriver.quit();
	  extent.flush();
  }

}
