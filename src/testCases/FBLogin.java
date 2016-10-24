package testCases;
import org.openqa.selenium.WebDriver;

import pageObjects.FBHomeObjects;
import pageObjects.FBLoginObjects;
import library.Browser;
import library.Methods;

public class FBLogin  {

	public static boolean FBLoginMain(String user, String pass) throws InterruptedException  {
		boolean returnValue = false;
		// TODO Auto-generated method stub
		FBLoginObjects fblogin = new FBLoginObjects();
		FBHomeObjects fbhome = new FBHomeObjects();
		Browser br = new Browser();
		Methods mt = new Methods();
		
		String sURL = "https://www.facebook.com";
		WebDriver driver = br.OpenURL("Chrome", sURL);
		Thread.sleep(2000);
		try {
			mt.SetTextField(driver, fblogin.txtbEmail, user);
			mt.SetTextField(driver, fblogin.txtbPass, pass);
			mt.ButtonClick(driver, fblogin.btnLogin);
		 	
		// Check if fb is now in homepage
			if (mt.GetElementCount(driver, fbhome.linkAvatar) > 0)
				returnValue = true;
			
			driver.close();
			driver.quit();
			
			return returnValue;
		} catch (Exception e) {
			driver.close();
			driver.quit();
			return false;
		}
	}
}
