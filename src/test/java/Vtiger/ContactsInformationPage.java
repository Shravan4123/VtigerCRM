package Vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsInformationPage {
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")private WebElement continflink;
	
	public ContactsInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getContinflink() {
		return continflink;
	}
	
}
