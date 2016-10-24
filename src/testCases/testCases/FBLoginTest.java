package testCases.testCases;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;
import library.Constants;
import testCases.FBLogin;

public class FBLoginTest {

	@Test
	public void LoginFail() throws InterruptedException {
		if (!FBLogin.FBLoginMain(Constants.fbUsername, Constants.fbWrongPassword))
			Reporter.getCurrentTestResult().setStatus(ITestResult.FAILURE);
		else
			Reporter.getCurrentTestResult().setStatus(ITestResult.SUCCESS);
	}
	
	@Test
	public void LoginPass() throws InterruptedException {
		if (FBLogin.FBLoginMain(Constants.fbUsername, Constants.fbPassword))
			Reporter.getCurrentTestResult().setStatus(ITestResult.SUCCESS);
		else
			Reporter.getCurrentTestResult().setStatus(ITestResult.FAILURE);
			
	}
}
