package facebook.us.elementspage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import facebook.us.basepage.FB_BasePage;

public class FBLoginElements extends FB_BasePage {

	public FBLoginElements() {
	//default constructor is used for not creating new obj 
	//and can call obj directly after creating
		PageFactory.initElements(driver, this);	
	//in order to initialize all elements in this class we need pageFactory class.
	//
	}
	
	@FindBy(id="email")//provide locator in order to find out the element
	@CacheLookup //utilize computer Cache memory in order to increase the performance
	private WebElement userName;//used WebElement in order to keep elements here

	public WebElement getUserName() {//user getter method
		return userName;
	}
	
	@FindBy(id="pass")
	@CacheLookup 
	private WebElement pwd;

	public WebElement getPwd() {
		return pwd;
	}
	
	@FindBy(xpath="//button[@name='login']")
	@CacheLookup 
	private WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}
	@FindBy(xpath="//*[text()='Group conversations']")
	@CacheLookup 
	private WebElement verifyText;

	public WebElement getVerifyText() {
		return verifyText;
	}
	
	public void getUseNameAndPwd(String userName, String pwd) {
		getUserName().sendKeys(userName);
		getPwd().sendKeys(pwd);
		
	}
}
