package library;

import org.testng.ITestResult;

public class Constants {
	
	// Facebook login details
	public static final String fbURL = "https://www.facebook.com";
	public static final String fbUsername = "qtp.assessment.1@gmx.com";
	public static final String fbPassword = "p@ssword11";
	public static final String fbWrongPassword = "p@ssword1";
	
	// Selenium pass-fail
	public static final boolean SELENIUM_PASSED = true;
	public static final boolean SELENIUM_FAILED = false;
	
	// Chrome drivers
	public static final String chromePath = System.getProperty("user.dir") + "\\Browser Driver\\chromedriver.exe";
	public static final String chromeDriver = "webdriver.chrome.driver";
}
