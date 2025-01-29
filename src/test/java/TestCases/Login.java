package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Dashboard;
import Pages.Homepage;
import TestBase.BaseTest;

public class Login extends BaseTest {
	@Test(groups = "Smoke")
	public void login() {
		Homepage homepage = new Homepage(driver);
		Dashboard dash = new Dashboard(driver);
		homepage.clickLogin();
		homepage.userlogin(p.getProperty("email"), p.getProperty("pass"));

		boolean isVisible = dash.isProfileTabVisible();
		Assert.assertTrue(isVisible, "Profile Tab should be visible");
	}

//	@Test(groups = "reset")
//	public void resetpass() {
//		Dashboard dash = new Dashboard(driver);
//		login();
//		dash.passwordReset(p.getProperty("pass"), p.getProperty("newpass"));
//	}

	@Test(groups = "Smoke")
	public void fillProfile() {
		Dashboard dash = new Dashboard(driver);
		login();
		dash.FillProfile(p.getProperty("Fname"), p.getProperty("Lname"), p.getProperty("number"),
				p.getProperty("Address"), p.getProperty("city"), p.getProperty("state"), p.getProperty("zip"));
	}
}