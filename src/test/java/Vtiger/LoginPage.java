package Vtiger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath = "//input[@name='user_name']")private WebElement untxt;
	@FindBy(xpath = "//input[@name='user_password']")private WebElement pwdtxt;
	@FindBy(xpath = "//input[@type='submit']")private WebElement loginbtn;
	
	//initialization
		public LoginPage(WebElement driver) {
			PageFactory.initElements(driver, this);
		}

		public WebElement getUntxt() {
			return untxt;
		}

		public WebElement getPwdtxt() {
			return pwdtxt;
		}

		public WebElement getLoginbtn() {
			return loginbtn;
		}
		
		
}
