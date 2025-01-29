package TestCases;

import org.testng.annotations.Test;

import Pages.AppointmentPage;
import Pages.DoctorPage;
import Pages.Homepage;
import TestBase.BaseTest;

public class BookDoctorAppointment extends BaseTest {
	Homepage homepage;
	DoctorPage dp;
	AppointmentPage Ap;

	@Test(groups = "Smoke")
	public void BookAppointment() throws InterruptedException {
		homepage = new Homepage(driver);
		dp = new DoctorPage(driver);
		Ap = new AppointmentPage(driver);
		homepage.clickDoctor();
		dp.BooknowDoc();
		Ap.FillAppointmentForm(p.getProperty("name"), p.getProperty("mobile"), p.getProperty("email"),
				p.getProperty("age"));
		Ap.PatientAgeDropdown();
		Ap.ReportTypeDropdown();
		Ap.SelectGenderDropdown();
		Ap.messageField(p.getProperty("message"));
		Ap.selectdate();
	}
}
