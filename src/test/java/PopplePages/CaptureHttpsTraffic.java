package PopplePages;

import java.io.File;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.UnknownHostException;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.proxy.CaptureType;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import de.sstoehr.harreader.HarReaderException;

public class CaptureHttpsTraffic {
	public static WebDriver driver;
	public static BrowserMobProxyServer proxy;

	@Test(priority = 1)
	public void CreatHarFile() throws HarReaderException {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		proxy = new BrowserMobProxyServer();
		proxy.start();

		Proxy seleniumProxy = ClientUtil.createSeleniumProxy(proxy);
		
		try {
			String hostIp = Inet4Address.getLocalHost().getHostAddress();
			seleniumProxy.setHttpProxy(hostIp + ":" + proxy.getPort());
			seleniumProxy.setSslProxy(hostIp + ":" + proxy.getPort());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		DesiredCapabilities seleniumCapabilities = new DesiredCapabilities();

		//seleniumCapabilities.setCapability(CapabilityType.PROXY, seleniumProxy);
		
		  ChromeOptions chromeOptions = new ChromeOptions();
          chromeOptions.addArguments("--headless");
          chromeOptions.addArguments("--no-sandbox");
          chromeOptions.addArguments("--disable-dev-shm-usage");
          driver = new ChromeDriver(chromeOptions);
          
          seleniumCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
         /// webDriver = new ChromeDriver(capabilities);
          driver = new ChromeDriver(seleniumCapabilities);


		proxy.enableHarCaptureTypes(CaptureType.RESPONSE_HEADERS);

		try {

			proxy.newHar("swtestacademy");

			

			driver.navigate().to("https://www.thepopple.com/lessons-to-learn-from-brad-pitts-breakups-71790");
			driver.manage().window().maximize();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("return window.stop");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			Har har = proxy.getHar();

			File harFile = new File("thepopple.har");
			har.writeTo(harFile);

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		driver.quit();
		proxy.stop();

	}

}
