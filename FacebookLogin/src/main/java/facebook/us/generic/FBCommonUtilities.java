package facebook.us.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import facebook.us.basepage.FB_BasePage;

public class FBCommonUtilities extends FB_BasePage {
//ActionClick
	public static void getActionClick(WebElement elm) {
		 Actions acts= new Actions(driver);
		 acts.click(elm).build().perform();
		
	}
}
