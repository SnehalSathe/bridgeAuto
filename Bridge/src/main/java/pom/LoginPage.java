package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.WaitMethod;


public class LoginPage {
	@FindBy(xpath = "//input[@id='phoneNo']")private WebElement mobNo; //Enter Mobile Number
	@FindBy(xpath = "//button[@id='login_btn']")private WebElement proceed;      //proceed
	@FindBy(xpath = "//input[@id='otp']")private WebElement otp;       //Enter OTP
	@FindBy(xpath = "//button[@id='login_btn']")private WebElement login;// Click on continue
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterMobNo(String number) {
		mobNo.sendKeys(number);

	}

	public void clickOnProceed() {
		proceed.click();
	}

	public void enterOTP(String pass) {
		WaitMethod.waitFor(otp);
		otp.sendKeys(pass);
	}

	public void clickOnContinue() {
		login.click();
	}

}
