package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pom.LoginPage;
import pom.ServicePage;
import utility.BaseClass;
import utility.Driver;


public class LoginTest extends Driver {
	@BeforeTest
	public void openBrowser() {
		driver = BaseClass.loginBridge();

}
	@Test
	public void pwaLogin()  {
		LoginPage login=new LoginPage(driver);
		
		
		login.enterMobNo("9873366558");
		login.clickOnProceed();
		login.enterOTP("44444");
		login.clickOnContinue();
		}
	@Test
	public void addService() {
		ServicePage servicepage= new ServicePage(driver);
		servicepage.clickOnMiscellaneous();
	}
	
}