package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GetHelppage extends Base {
	public GetHelppage(WebDriver driver) {
		// invoke the parent class constructor
		super(driver);
	}

	@FindBy(xpath = "//a[normalize-space()='Add New']")
	WebElement CreateaddNewBtn;
	@FindBy(xpath = "//input[@placeholder='Enter Name...']")
	WebElement GetHelpenterName;
	@FindBy(xpath = "//input[@placeholder='Enter Email...']")
	WebElement GetHelpEmail;
	@FindBy(xpath = "//input[@placeholder='Enter Subject...']")
	WebElement GetHelpSubject;
	@FindBy(xpath = "//textarea[@placeholder='Write Here...']")
	WebElement GetHelpwriteHere;
	@FindBy(xpath = " //input[@id='attachmentsspanspan']")
	WebElement dropYourFileOrClickToSel;
	@FindBy(xpath = "//button[normalize-space()='Add New']")
	WebElement AddTicket;

	public void createTicket(String Name, String email, String Subject, String message) {
		CreateaddNewBtn.click();
		GetHelpenterName.sendKeys(Name);
		GetHelpEmail.sendKeys(email);
		GetHelpSubject.sendKeys(Subject);
		GetHelpwriteHere.sendKeys(message);
	}

	public void UploadFile() {
		dropYourFileOrClickToSel.sendKeys("C:\\path\\to\\file\\example.txt");
		// scroll the page
		AddTicket.click();
	}

}
