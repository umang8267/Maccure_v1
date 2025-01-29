package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DoctorPage extends Base {
	public DoctorPage(WebDriver driver) {
		// invoke the parent class constructor
		super(driver);
	}

	@FindBy(xpath = "(//a[@class='btn--base'][normalize-space()='Book Now'])[1]")
	WebElement bookNowBtn;
	@FindBy(xpath = "//span[contains(@title,'Select Branch')]")
	WebElement selectBranch;
	@FindBy(xpath = "//li[contains(.,'Janak Puri')]")
	WebElement selectBranchValue;
	@FindBy(xpath = "//span[contains(@title,'Select Specialities')]")
	WebElement selectSpecialities;
	@FindBy(xpath = "//li[contains(@aria-selected,'true')]")
	WebElement selectSpecialitiesvalue;
	@FindBy(xpath = "//input[@placeholder='Doctor Name']")
	WebElement Searchdoctor;
	@FindBy(xpath = "//button[normalize-space()='Search']")
	WebElement searchBtn;
	@FindBy(xpath = "//div[@class='data']")
	WebElement selectFirstBranchtext;

	public void selectbranchFromDropdown() {
		selectBranch.click();
		selectBranchValue.click();

	}

	public boolean selectFirstBranchtextpresent() {
		return selectFirstBranchtext.isDisplayed();

	}

	public void selectSpecialitiesFromDropdown() {
		try {
			// Wait for the 'Select Specialities' dropdown to be clickable and then click
			wt.until(ExpectedConditions.elementToBeClickable(selectSpecialities));
			selectSpecialities.click();

			// Wait for the 'Paediatrics' option to be visible and then click
			wt.until(ExpectedConditions.elementToBeClickable(selectSpecialitiesvalue));
			selectSpecialitiesvalue.click();
		} catch (Exception e) {
			System.out.println("Error occurred while selecting specialities: " + e.getMessage());
			throw e; // Re-throw the exception for debugging purposes
		}
	}

	public void searchFunctionBtn() {
		searchBtn.click();
	}

	public void searchDoc(String DoctorName) {
		Searchdoctor.sendKeys(DoctorName);
	}

	public void BooknowDoc() {
		scrollToElement(bookNowBtn);
		bookNowBtn.click();
	}

}
