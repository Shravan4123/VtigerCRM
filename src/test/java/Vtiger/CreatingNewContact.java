package Vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewContact {
	@FindBy(xpath = "")private WebElement fname;
	@FindBy(xpath = "")private WebElement lname;
	@FindBy(xpath = "")private WebElement savebtn;

	public CreatingNewContact(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}
	
}
