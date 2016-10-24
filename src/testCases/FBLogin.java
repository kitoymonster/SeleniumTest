package testCases;
import org.openqa.selenium.WebDriver;

import pageObjects.Constants;
import pageObjects.FBHomeObjects;
import pageObjects.FBLoginObjects;
import library.Browser;
import library.Methods;

public class FBLogin  {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		FBLoginObjects fblogin = new FBLoginObjects();
		FBHomeObjects fbhome = new FBHomeObjects();
		Browser br = new Browser();
		Methods mt = new Methods();
		
		String sURL = "https://www.facebook.com";
		WebDriver driver = br.OpenURL("Chrome", sURL);
		
		mt.SetTextField(driver, fblogin.txtbEmail, Constants.fbUsername);
		mt.SetTextField(driver, fblogin.txtbPass, Constants.fbWrongPassword);
		mt.ButtonClick(driver, fblogin.btnLogin);
		 	
		// Check if fb is now in homepage
		if (mt.GetElementCount(driver, fbhome.linkAvatar) == 0)
			throw new RuntimeException("Test not implemented");
	}

}
