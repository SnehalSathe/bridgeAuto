package NavigoPOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Driver;
import utility.WaitMethod;

public class SignUpPage extends Driver {
	@FindBy(xpath = "//div[contains(text(),'Sign up using work email')]")private WebElement signUp; //
	@FindBy(xpath = "//input[@type='email']")private WebElement email;      //
	@FindBy(xpath = "//span[contains(text(),'Signup')]")private WebElement clicksignup;       //
	@FindBy(xpath = "//input[@type='tel']")private WebElement otp;// Enter OTP
	@FindBy(xpath = "//span[contains(text(),'Signup')]")private WebElement continu;// Enter OTP
	@FindBy(xpath = "(//input[@type='text'])[1]")private WebElement fName;// Enter OTP
	@FindBy(xpath = "(//input[@type='text'])[2]")private WebElement lName;// Enter OTP
	@FindBy(xpath = "(//input[@type='radio'])[1]")private WebElement male;// Enter OTP
	@FindBy(xpath = "//input[@id='mantine-kmf15jpud']")private WebElement date;// Enter OTP
	@FindBy(xpath = "(//input[@type='text'])[3]")private WebElement pNumber;



	
	
	
	public SignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnSignup() {
		signUp.click();

	}
	public void enterEmail(String mail) {
		email.sendKeys(mail);
	}

	public void clickOnsign() {
		clicksignup.click();
	}

	public void enterOTP(String pass) {
		WaitMethod.waitFor(otp);
		otp.sendKeys(pass);
	}

	public void clickOnContinue() {
		continu.click();
	}
	public void EnterFName(String name) {
		WaitMethod.waitFor(fName);
		fName.sendKeys(name);
	}
	public void EnterLName(String lname) {
		WaitMethod.waitFor(fName);
		lName.sendKeys(lname);
	}
	public void clickOnMale() {
		male.click();
	}

	public void enterDate() {
		JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("document.getElementById('mantine-kmf15jpud').value='13/08/1996'");
			
	}
	public void EnterNumber(String number) {
		
		pNumber.sendKeys(number);
	}

}
