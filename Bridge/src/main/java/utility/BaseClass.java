package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver loginBridge() {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
	      options.addArguments("--disable-notifications"); //set browser options
	      WebDriver driver = new ChromeDriver(options);
		driver.get("https://dev1.bridge.zyla.in/login");
		//((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());
		driver.manage().window().maximize();
		return driver;
		

		
}
	}



