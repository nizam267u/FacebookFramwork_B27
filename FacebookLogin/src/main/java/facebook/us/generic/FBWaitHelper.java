package facebook.us.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import facebook.us.basepage.FB_BasePage;

public class FBWaitHelper extends FB_BasePage{
	//public static WebDriver driver;
	public static void waitUntilElementToBeClickable(WebElement ele) {
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(ele));	
		
	}
}
