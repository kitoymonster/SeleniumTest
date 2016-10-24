package testCases;
import org.openqa.selenium.WebDriver;

import pageObjects.FBHomeObjects;
import pageObjects.FBLoginObjects;
import library.Browser;
import library.Constants;
import library.Methods;

public class FBLogin  {

	public static boolean Login(String browserName, String sURL, String user, String pass) throws InterruptedException  {
		boolean returnValue = Constants.SELENIUM_FAILED;
		// TODO Auto-generated method stub
		FBLoginObjects fblogin = new FBLoginObjects();
		FBHomeObjects fbhome = new FBHomeObjects();
		Browser br = new Browser();
		Methods mt = new Methods();
		
		WebDriver driver = br.OpenURL(browserName, sURL);
		Thread.sleep(5000);
		try {
			mt.SetTextField(driver, fblogin.txtbEmail, user);
			mt.SetTextField(driver, fblogin.txtbPass, pass);
			mt.ButtonClick(driver, fblogin.btnLogin);
		 	
		// Check if fb is now in homepage
			if (mt.GetElementCount(driver, fbhome.linkAvatar) > 0)
				returnValue = Constants.SELENIUM_PASSED;
			
			driver.close();
			driver.quit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			driver.close();
			driver.quit();
		}
		
		return returnValue;
	}
}
