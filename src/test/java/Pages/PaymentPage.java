package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends Base {

	public PaymentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//label[normalize-space()='Cash Payment']")
	WebElement cashPayment;
	@FindBy(xpath = "//label[@for='onlinePayment']")
	WebElement OnlinePayment;
	@FindBy(xpath = "//label[normalize-space()='Razorpay']")
	WebElement razorpay;
	@FindBy(xpath = "//button[normalize-space()='Confirm Appointment']")
	WebElement confirmAppointmentBTN;

	public void cashpayment() {
		cashPayment.click();
		confirmAppointmentBTN.click();
	}

	public void doOnlinePayment() {
		OnlinePayment.click();
		razorpay.click();
		confirmAppointmentBTN.click();
	}

}
