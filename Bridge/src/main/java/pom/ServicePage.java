package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Scroll;
import utility.WaitMethod;

public class ServicePage {
	@FindBy(xpath = "//h3[contains(text(),'Miscellaneous')]")private WebElement miscellaneous; //Miscellaneous
	@FindBy(xpath = "//h4[contains(text(),'Navigo Dashboard')]")private WebElement navigo;      //Navigo Dashboard
	@FindBy(xpath = "//p[contains(text(),'Services')]")private WebElement services;       //Services
	@FindBy(xpath = "//button[contains(text(),'+ Add New')]")private WebElement add;// Add new



public ServicePage (WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void clickOnMiscellaneous() {
	WaitMethod.waitFor(miscellaneous);
	
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
}