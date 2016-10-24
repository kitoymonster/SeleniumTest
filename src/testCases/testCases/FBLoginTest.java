package testCases.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import library.Constants;
import testCases.FBLogin;

public class FBLoginTest {
	public boolean bResult;
	
	@Test
	public void LoginFail() throws InterruptedException {
		bResult = FBLogin.Login("chrome", Constants.fbURL, Constants.fbUsername, Constants.fbWrongPassword);
		AssertJUnit.assertFalse(bResult);
	}
	
	@Test
	public void LoginPass() throws InterruptedException {
		bResult = FBLogin.Login("chrome", Constants.fbURL, Constants.fbUsername, Constants.fbPassword);
		AssertJUnit.assertTrue(bResult);
			
	}
	
}