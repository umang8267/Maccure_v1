package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Dashboard;
import Pages.Homepage;
import TestBase.BaseTest;
import Utilities.DataProviders;

public class LoginTDD extends BaseTest {

	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class, groups = "Datadriven", priority = 1) // getting
																													// data
	// provider from
	// different
	// class
	public void verify_loginDDT(String email, String pwd, String exp) {

		Homepage homepage = new Homepage(driver);
		Dashboard dash = new Dashboard(driver);
		homepage.clickLogin();
		homepage.userlogin(email, pwd);
		if (exp.equalsIgnoreCase("Valid")) {
			boolean targetPage = dash.isProfileTabVisible();

			Assert.assertTrue(targetPage, "Profile Tab should be visible");
			dash.clickLogout();
		} else {
			Assert.assertTrue(homepage.isErrorMessageDisplayed(),
					"Error message not displayed for invalid credentials!");

			homepage.closeLoginPopup();
		}
		
		if (exp.equalsIgnoreCase("Valid")) {
			boolean targetPage = dash.isProfileTabVisible();

			Assert.assertTrue(targetPage, "Profile Tab should be visible");
			dash.clickLogout();
		} else {
			Assert.assertTrue(homepage.isErrorMessageDisplayed(),
					"USER NOT LOGIN  for invalid credentials!");

			homepage.closeLoginPopup();
		}
		
		
	}
}
