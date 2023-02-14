package utility;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
public class Scroll extends Driver {
	public static void scrollDown(WebElement scrollElement) {
		JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView(true)", scrollElement  );
		
	}

}
