package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

//import Pages.AppointmentPage;
import Pages.DoctorPage;
import Pages.Homepage;
import TestBase.BaseTest;

public class SearchDoctor extends BaseTest {
	public DoctorPage Dp;
	public Homepage homepage;

	@Test(groups = "Smoke")
	public void SearchDoc() {
		Dp = new DoctorPage(driver);
		homepage = new Homepage(driver);
		homepage.clickDoctor();
		Dp.selectbranchFromDropdown();
		boolean isVisible = Dp.selectFirstBranchtextpresent();
		// Assert the visibility
		Assert.assertFalse(isVisible);
		Dp.selectSpecialitiesFromDropdown();
		Dp.searchFunctionBtn();
	}
}
