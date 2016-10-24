package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.Constants;

public class Browser {
	public WebDriver driver;
	
	public WebDriver OpenBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty(Constants.chromeDriver, Constants.chromePath);
			this.driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox"))
			this.driver = new FirefoxDriver();
		return this.driver;
	}
	
	public WebDriver OpenURL(String browserName, String sURL) {
		this.driver = OpenBrowser(browserName);
		this.driver.navigate().to(sURL);
		this.driver.manage().window().maximize();
		return this.driver;
	}
	
}
