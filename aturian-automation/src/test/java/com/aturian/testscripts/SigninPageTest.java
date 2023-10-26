package com.aturian.testscripts;

import org.testng.annotations.Test;

import com.aturian.base.Base;
import com.aturian.pageObjects.LoginPage;
import com.aturian.utility.Log;

public class SigninPageTest extends Base {

	private LoginPage loginPage;

	// Method to loginPageTitleTest.
	@Test(groups = { "patient-portal", "smoke", "sign-in" })
	public void loginPageTitleTest() throws InterruptedException {

		// String expected_title = "Sign in";
		String testName = "Verify user is successfully able to navigate to the sign-in page";

		// Creating the test name to display in extent report
		test = extent.createTest(testName).assignAuthor("Ratin Kumar").assignCategory("patient-portal", "smoke",
				"sign-in");

		Log.startTestCase(testName);

		loginPage = new LoginPage();
		
		loginPage.signIn();

//		Log.info("Getting title of the login page");
//		String actualTitle = loginPage.titleOfThePage();
//		
//		Log.info("Verifying title of the page");
//		Assert.assertEquals(actualTitle, expected_title);

		Log.endTestCase(testName);

	}

}
