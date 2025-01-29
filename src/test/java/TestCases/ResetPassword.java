package TestCases;

import org.testng.annotations.Test;

import Pages.Dashboard;
import Pages.Homepage;
//import TestBase.BaseTest;

public class ResetPassword extends Login {
	public Homepage homepage;

	@Test
	public void ResetPasswordAfterLogin() {
		Dashboard dash = new Dashboard(driver);
		login();
		dash.passwordReset(p.getProperty("pass"), p.getProperty("newpass"));
	}

	@Test(groups = "reset")
	public void resetPasswordbeforeLogin() {
		homepage = new Homepage(driver);
		homepage.clickLogin();
		homepage.ClickingForgetBtnAndEmail(p.getProperty("email"));
		homepage.checkingResetPaswordEmail(p.getProperty("email"));
		homepage.clickingSubmitBtn();
	}
}
