package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Homepage extends Base {
	public Homepage(WebDriver driver) {
		// invoke the parent class constructor
		super(driver);
	}

	@FindBy(xpath = "//a[normalize-space()='Doctors']")
	WebElement doctorsBTN;
	@FindBy(xpath = "//a[normalize-space()='Forgot Password?']")
	WebElement ForgetPassBtn;

	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement resetPassEmail;

	@FindBy(xpath = "//button[normalize-space()='Send OTP']")
	WebElement SendOTPBtn;
	@FindBy(xpath = "//strong")
	WebElement checkingValidEmailOnSubmitBtn;
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	WebElement SubmitBtnAfterOTP;

	@FindBy(xpath = "//a[normalize-space()='Login']")
	WebElement login;
	@FindBy(xpath = "(//input[@name='credentials'])[1]")
	WebElement Loginemail;
	@FindBy(xpath = "(//input[@placeholder='Password'])[1]")
	WebElement LoginPass;
	@FindBy(xpath = "(//button[normalize-space()='Login Now'])[1]")
	WebElement Loginbtn;
	@FindBy(xpath = "//a[contains(.,'Register Now')]")
	WebElement Registerbtn;
	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement RegisterFname;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement RegisterLName;
	@FindBy(xpath = "//form[@action='https://maccure.adotrip.in/register']//input[@placeholder='Email']")
	WebElement RegisterEmail;
	@FindBy(xpath = "//form[@action='https://maccure.adotrip.in/register']//input[@placeholder='Password']")
	WebElement RegisterPassword;

	@FindBy(xpath = "//label[@for='level-1']/preceding-sibling::input[@type='checkbox']")
	WebElement RegistertermCheckBox;
	@FindBy(xpath = "//button[normalize-space()='Register Now']")
	WebElement RegisterNowBtn;
	@FindBy(xpath = "//span[@data-notify='message']")
	WebElement AlertLogin;
	@FindBy(xpath = "//div[@class='account-area change-form']//div[@class='account-close']")
	WebElement CloasePopupLogin;

	WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(20));

	public void clickLogin() {
		wt.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
		// TODO Auto-generated method stub
	}

	public void clickDoctor() {
		doctorsBTN.click();
	}

	public void userlogin(String email, String pass) {
		Loginemail.sendKeys(email);
		LoginPass.sendKeys(pass);
		Loginbtn.click();
		// TODO Auto-generated method stub
	}

	public void clickregister() {
		wt.until(ExpectedConditions.elementToBeClickable(Registerbtn));
		Registerbtn.click();
	}

	public void UserRegister(String Fname, String Lname, String email, String pass) {
		// TODO Auto-generated method stub
		RegisterFname.sendKeys(Fname);
		RegisterLName.sendKeys(Lname);
		RegisterEmail.sendKeys(email);
		RegisterPassword.sendKeys(pass);
		wt.until(ExpectedConditions.elementToBeSelected(RegistertermCheckBox));
		RegistertermCheckBox.isSelected();
		RegisterNowBtn.click();

	}

	public boolean isErrorMessageDisplayed() {
		return AlertLogin.isDisplayed();
	}

	public void closeLoginPopup() {
		wt.until(ExpectedConditions.visibilityOf(CloasePopupLogin));
		CloasePopupLogin.click();
	}

	public void ClickingForgetBtnAndEmail(String email) {
		wt.until(ExpectedConditions.visibilityOf(ForgetPassBtn));

		ForgetPassBtn.click();
		resetPassEmail.sendKeys(email);
		SendOTPBtn.click();
	}

	public void checkingResetPaswordEmail(String email) {
		String var = checkingValidEmailOnSubmitBtn.getText();
		try {
			wt.until(ExpectedConditions.visibilityOf(checkingValidEmailOnSubmitBtn));
			System.out.println("Element is visible.");
			Assert.assertEquals(var, email, "The EMAIL IS Same.");
		} catch (Exception e) {
			System.out.println("Element is not visible or does not exist.");
			Assert.fail("The EMAIL is not same or does not exist.");
		}
	}

	public void clickingSubmitBtn() {

		SubmitBtnAfterOTP.click();

	}
}
