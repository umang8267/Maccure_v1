package TestCases;

import org.testng.annotations.Test;

import Pages.Homepage;
import TestBase.BaseTest;

public class RegisterUser  extends BaseTest{
	public Homepage homepage;
	@Test (groups = "Smoke")
	public void RegisteerUSer() {
		homepage =new Homepage(driver);
		homepage.clickLogin();
		homepage.clickregister();
		homepage.UserRegister(p.getProperty("Fname"),p.getProperty("Lname"),p.getProperty("Registeremail"),p.getProperty("pass"));
	}
	
}
