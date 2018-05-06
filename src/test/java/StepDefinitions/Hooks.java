package StepDefinitions;

import java.io.File;
import java.lang.management.ManagementFactory;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	public static WebDriver driver;
	public static String scenarioName;
	public static String scenarioStatus;
	public static String SessionID;
	public boolean testResults;
	public static final String USERNAME = "sanjiv04mishra";
	public static final String ACCESS_KEY = "e31ec095-8842-4c6d-a02a-18f3f2448c8e";
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY+ "@ondemand.saucelabs.com:80/wd/hub";
	
	@Before("@Regression1")
	public void openBrowser(Scenario scenario) throws Exception {
		
		long threadId = Thread.currentThread().getId();
		String processName = ManagementFactory.getRuntimeMXBean().getName();
		System.out.println("Started in thread: " + threadId + ", in JVM: " + processName);
		

		String browserName= "Chrome";

		if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if (browserName.equalsIgnoreCase("Chrome")) {

			
			File file = new File("./Drivers/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());
			ChromeOptions options = new ChromeOptions();		
			driver = new ChromeDriver(options);

		}else if (browserName.equalsIgnoreCase("IE")) {

			DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
			caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			caps.setCapability("ignoreZoomSetting", true);
			System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver(caps);
		}
		else if (browserName.equalsIgnoreCase("Saucelabs")){
			
			
			DesiredCapabilities caps = new DesiredCapabilities();
				caps.setCapability("browser_name", "chrome");
				caps.setCapability("platform", "Windows 7");
				caps.setCapability("version", "latest");
				caps.setCapability("screen-resolution","1280x800");
				caps.setCapability("build","LocalTest"+"_"+System.currentTimeMillis());

					caps.setCapability("name", scenario.getName());
					caps.setCapability("build", System.getenv("JOB_NAME") + "__"+ System.getenv("BUILD_NUMBER"));
					
					
					driver = new RemoteWebDriver(new URL(URL), caps);
					
					SessionID = (((RemoteWebDriver) driver).getSessionId()).toString();
				}

				scenarioName = scenario.getName();
				System.out.println("Scenario id: " + scenario.getId());
				System.out.println("Scenario tag: " + scenario.getSourceTagNames());
				System.out.println("Scenario name: " + scenario.getName());
			}

	
		
@After("@Regression1")
public void closeBrowserAndEmbedScreenshot(Scenario scenario)
		throws Exception {	
//if (scenario.isFailed()) {
	
	try {
		TakesScreenshot TS = (TakesScreenshot) driver;

		// for the storing the screenshot in the project workspace
		File Location = TS.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Location, new File("./ErrorReports/"+ scenario.getName() + ".png"));				
		// for embedding the screenshot into cucumber report
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
						
	} catch (Exception e) {
	System.out.println("Unable to take screenshot :" + e);
	}

	//}
	driver.manage().deleteAllCookies();
	driver.quit();
}
}