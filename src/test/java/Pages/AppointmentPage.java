package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class AppointmentPage extends Base {

	public AppointmentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@placeholder='Enter Name...']")
	WebElement enterNameFld;
	@FindBy(xpath = "//input[@placeholder='Mobile...']")
	WebElement mobileFld;
	@FindBy(xpath = "//input[@placeholder='Email...']")
	WebElement emailFld;
	@FindBy(xpath = "//input[@placeholder='Enter your age']")
	WebElement enterYourAgeFld;
	@FindBy(xpath = "//select[@name='age_type']")
	WebElement yearsDropdown;
	@FindBy(xpath = "//select[@name='type']")
	WebElement selectTypeDropdown;
	@FindBy(xpath = "//select[@name='gender']")
	WebElement selectGenderDropdown;
	@FindBy(xpath = "//textarea[@placeholder='Write Here...']")
	WebElement writeHereFld;
	@FindBy(xpath = "//input[@id='date']")
	WebElement scheduleDate;
	@FindBy(xpath = "//div[@class='dayContainer']")
	WebElement CheckCalenderVisible;
	
	@FindBy(xpath = "//span[@aria-current='date']")
	WebElement selectdateofBooking;
	
	//span[@aria-current='date']
	@FindBy(xpath = " //label[@class='package--amount']")
	WebElement selectDay;
	@FindBy(xpath = "//button[normalize-space()='Proceed']")
	WebElement proceedButton;

	public void FillAppointmentForm(String Name, String Mobile, String Email, String age) {
		enterNameFld.sendKeys(Name);
		mobileFld.sendKeys(Mobile);
		emailFld.sendKeys(Email);
		enterYourAgeFld.sendKeys(age);
	}

	public void PatientAgeDropdown() {
		Select PatientAge = new Select(yearsDropdown);
		PatientAge.selectByIndex(1);
	}

	public void ReportTypeDropdown() {
		Select PatientReport = new Select(selectTypeDropdown);
		PatientReport.selectByIndex(1);
	}

	public void SelectGenderDropdown() {
		Select PatientGender = new Select(selectGenderDropdown);
		PatientGender.selectByIndex(1);
	}

	public void messageField(String message) {
		scrollToElement(writeHereFld);
		writeHereFld.sendKeys(message);
	}

	public void selectdate() {
	
		scrollToElement(scheduleDate);
		scheduleDate.click();
		wt.until(ExpectedConditions.visibilityOf(CheckCalenderVisible));
		selectdateofBooking.click();
	}

	public void selectDayofBooking() {
		selectDay.click();
	}

	public void AppoinmentSubmit() {
		proceedButton.click();
	}
}
