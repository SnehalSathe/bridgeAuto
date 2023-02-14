package NavigoTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import NavigoPOM.SignUpPage;
import pom.LoginPage;
import utility.BaseClass;
import utility.Driver;
import utility.NavigoLogin;

public class SignUpTest extends Driver {
	@BeforeTest
	public void openBrowser() {
		driver = NavigoLogin.loginNavigo();

}
	@Test
	public void navSignUp()  {
	SignUpPage signUpPage= new SignUpPage(driver);
	signUpPage.clickOnSignup();
	signUpPage.enterEmail("tested@yes.com");
	signUpPage.clickOnsign();
	signUpPage.enterOTP("44444");
	signUpPage.clickOnContinue();
	
		
		}
	@Test
	public void onBoarding() {
		SignUpPage signUpPage= new SignUpPage(driver);
		signUpPage.EnterFName("soham");
		signUpPage.EnterLName("Patil");
		signUpPage.clickOnMale();
		signUpPage.enterDate();
		signUpPage.EnterNumber("9876543210");
		
	}

}
