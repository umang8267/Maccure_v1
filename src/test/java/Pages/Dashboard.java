package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dashboard extends Base {
	public Dashboard(WebDriver driver) {
		// invoke the parent class constructor
		super(driver);
	}

	@FindBy(xpath = "//img[@alt='logo']")
	WebElement Homepagelogo;
	@FindBy(xpath = "//span[@class='menu-title'][normalize-space()='Profile Settings']")
	WebElement ProfileTab;
	@FindBy(xpath = "//span[contains(text(),'History')]")
	WebElement HistoryTab;
	@FindBy(xpath = "//span[contains(text(),'Logout')]")
	WebElement LogoutTab;

	@FindBy(xpath = "//input[@placeholder='Enter First Name...']")
	WebElement enterFirstName;
	@FindBy(xpath = "//input[@placeholder='Enter Last Name...']")
	WebElement enterLastName;
	@FindBy(xpath = "//span[@role='combobox']")
	WebElement CountryDropdown;
	@FindBy(xpath = "//input[@role='searchbox']")
	WebElement CountrySearch;
	@FindBy(xpath = "//ul//li[.='India']")
	WebElement CountrySelect;
	
	@FindBy(xpath = "//input[@placeholder='Enter Number...']")
	WebElement enterNumber;
	@FindBy(xpath = "//input[@placeholder='Enter Address...']")
	WebElement enterAddress;
	@FindBy(xpath = "//input[@placeholder='Enter City...']")
	WebElement enterCity;
	@FindBy(xpath = "//input[@placeholder='Enter State...']")
	WebElement enterState;
	@FindBy(xpath = "//input[@name='zip_code']")
	WebElement enterZipCode;
	@FindBy(xpath = "//button[normalize-space()='Update']")
	WebElement updateButton;
	@FindBy(xpath = "//input[@name='current_password']")
	WebElement enterPassword;
	@FindBy(xpath = "//input[@name='password']")
	WebElement NewPassword;
	@FindBy(xpath = "//input[@name='password_confirmation']")
	WebElement ConfirmPassword;
	@FindBy(xpath = "//button[normalize-space()='Change']")
	WebElement changeBtn;

	@FindBy(xpath = "//a[normalize-space()='Get Support']")
	WebElement getSupport;
	@FindBy(xpath = "//span[normalize-space()='Logout']")
	WebElement lnkLogout;
	@FindBy(xpath = "//button[normalize-space()='Logout']")
	WebElement lnkLogoutBtn;
	
	public void Getsupportbtn() {
		getSupport.click();
	}

	public void passwordReset(String pass, String Newpass) {
		enterPassword.sendKeys(pass);
		NewPassword.sendKeys(Newpass);
		ConfirmPassword.sendKeys(Newpass);
		changeBtn.click();
	}

	public void FillProfile(String FirstName, String LastName, String number, String Address, String City, String State,
			String ZipCode) {
		enterFirstName.sendKeys(FirstName);
		enterLastName.sendKeys(LastName);
		CountryDropdown.click();
		CountrySearch.sendKeys("India");
		CountrySelect.click();
		
		scrollToElement(updateButton);
		enterNumber.clear();
		enterNumber.sendKeys(number);
		enterAddress.sendKeys(Address);
		enterCity.sendKeys(City);
		enterState.sendKeys(State);
		// enterZipCode.sendKeys(ZipCode);
		updateButton.click();
	}

	public boolean isProfileTabVisible() {
		return ProfileTab.isDisplayed();
	}

	public boolean isMyDashBoardPageExists()
	{
		try
		{
		return (ProfileTab.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public void clickLogout()
	{
		lnkLogout.click();
		lnkLogoutBtn.click();
	}

}
