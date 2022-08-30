package facebook.us.basepage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FB_BasePage {
	
	public static WebDriver driver;//interface instance
	public static Properties prop;//java utility class and prop is the object
	
	public FB_BasePage() {//created constructor
		
	prop=new Properties();//properties class object is created
	
	FileInputStream fis;
	try {
		fis = new FileInputStream("./src/main/java/facebook/us/config/Config.properties");
		prop.load(fis);
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	
	} catch (IOException e) {
		System.out.println(e.getMessage());
	}	
	}
	
	public static void initialization()	{
		//System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();//update version control
		driver=new ChromeDriver();//java keyword and chromedriver class
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	
	
}
