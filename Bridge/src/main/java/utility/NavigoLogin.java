package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigoLogin {
	public static WebDriver loginNavigo() {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
	      options.addArguments("--disable-notifications"); //set browser options
	      WebDriver driver = new ChromeDriver(options);
		driver.get("http://staging.navigo.zyla.in/login");
		//((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());
		driver.manage().window().maximize();
		return driver;
	}
}
