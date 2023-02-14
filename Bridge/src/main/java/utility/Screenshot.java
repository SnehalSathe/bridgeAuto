package utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void clickScreenshotPassed(WebDriver driver,String name) throws IOException {
		LocalDateTime dateTime=LocalDateTime.now();
		DateTimeFormatter myPattern=DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
		String timestemp= dateTime.format(myPattern);
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\DELL\\Documents\\Automation\\PWA\\Screenshot\\Passed_Screenshot\\ "+name+"_"+timestemp+ ".png");
		FileHandler.copy(source, destination);


}
	public static void clickScreenshotFailed(WebDriver driver,String name) throws IOException {
		LocalDateTime dateTime=LocalDateTime.now();
		DateTimeFormatter myPattern=DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
		String timestemp= dateTime.format(myPattern);
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\DELL\\Documents\\Automation\\PWA\\Screenshot\\Failed_Screenshot\\ "+name+"_"+timestemp+ ".png");
		FileHandler.copy(source, destination);
}

}
