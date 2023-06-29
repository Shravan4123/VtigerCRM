package Vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactsLookup_Page {

	@FindBy(xpath = "")private WebElement contlink;
	
	public contactsLookup_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getContlink() {
		return contlink;
	}
	
}
