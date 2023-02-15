package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Scroll;
import utility.WaitMethod;

public class ServicePage {
	@FindBy(id="settings_navigation")private WebElement miscellaneous; //Miscellaneous
	@FindBy(xpath = "//h4[contains(text(),'Navigo Dashboard')]")private WebElement navigo;      //Navigo Dashboard
	@FindBy(xpath = "//p[contains(text(),'Services')]")private WebElement services;       //Services
	@FindBy(xpath = "//button[contains(text(),'+ Add New')]")private WebElement add;// Add new
	@FindBy(xpath = "(//input[@type='text'])[1]")private WebElement name;
	@FindBy(xpath = "//textarea[@placeholder='Description']")private WebElement description;// Add new
	@FindBy(xpath = "//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']")private WebElement instruction;// Add new
	@FindBy(xpath = "//button[contains(text(),'choose an image')]")private WebElement cover;// Add new
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")private WebElement sunday;// Add new
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")private WebElement monday;
	@FindBy(xpath = "(//input[@type='checkbox'])[3]")private WebElement tuesday;
	@FindBy(xpath = "(//input[@type='checkbox'])[4]")private WebElement wednesday;
	@FindBy(xpath = "(//input[@type='checkbox'])[5]")private WebElement thursday;
	@FindBy(xpath = "(//input[@type='checkbox'])[6]")private WebElement friday;
	@FindBy(xpath = "(//input[@type='checkbox'])[7]")private WebElement saturday;
	@FindBy(xpath ="(//input[@type='text'])[2]")private WebElement duration;
	@FindBy(xpath = "(//input[@type='number'])[1]")private WebElement minBookingNotice;
	@FindBy(xpath = "(//input[@type='number'])[2]")private WebElement maxAdvanceBooking;
	@FindBy(xpath = "(//input[@type='number'])[3]")private WebElement unitsPerSlot;
	@FindBy(xpath = "(//div[@role='button'])[31]")private WebElement breakStart;
	@FindBy(xpath = "(//div[@role='button'])[32]")private WebElement breakEnd;
	@FindBy(xpath = "(//input[@type='text'])[3]")private WebElement calendars;
	@FindBy(xpath = "(//input[@type='text'])[4]")private WebElement clientCode;
	@FindBy(xpath = "(//input[@type='number'])[4]")private WebElement maxSlot;
    @FindBy(xpath = "(//input[@type='checkbox'])[8]")private WebElement availedForFamily;
	@FindBy(xpath = "(//input[@type='checkbox'])[9]")private WebElement addressRequired;
	
	
	
	
public ServicePage (WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void clickOnMiscellaneous() {
	Scroll.scrollDown(miscellaneous);
	miscellaneous.click();
}

public void clickOnnavigo(String number) {
	navigo.click();

}

public void clickOnServices() {
	services.click();
}
	public void clickOnAdd() {
		add.click();
	}
	public void enterName(String addName) {
		name.sendKeys(addName);
	}
	public void enterDescription(String addDesc) {
	description.sendKeys(addDesc);
	}
	public void enterInstructions(String typeHere) {
		instruction.sendKeys(typeHere);
	}
	public void addCover() {
		cover.click();
	}
	public void clickOnSunday() {
		sunday.click();
	}
	public void clickOnMonday() {
		monday.click();
	}
	public void clickOnTuesday() {
		tuesday.click();
	}
	public void clickOnwednesday() {
		wednesday.click();
	}
	public void clickOnThursday() {
		thursday.click();
	}
	public void clickOnFriday() {
		friday.click();
	}
	public void clickOnSaturday() {
		saturday.click();
	}
	public void enterDuration(String time) {
		duration.sendKeys(time);
	}
	public void enterBookings(String minDays) {
		minBookingNotice.sendKeys(minDays);
	}
	
	public void enterBookings1(String maxDays) {
		maxAdvanceBooking.sendKeys(maxDays);
	}
	
	public void enterunitPerSlot(String slot) {
		unitsPerSlot.sendKeys(slot);
	}
	public void enterBreakStart(String startTime) {
		breakStart.sendKeys(startTime);
	}
	public void enterBreakEnd(String endTime) {
		breakEnd.sendKeys(endTime);
	}
	public void addCalendars() {
		calendars.click();
	}
	public void addclientCode() {
		clientCode.click();
	}
	public void addMaxSlot(String addSlot) {
		maxSlot.sendKeys(addSlot);
	}
	public void clickOnAvailForFamily() {
	availedForFamily.click();
	}
	public void clickOnAddressReq() {
		addressRequired.click();
	}
	
}