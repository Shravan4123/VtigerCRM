package Vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationLookupPage {
	@FindBy(xpath = "//img[@alt='Create Organization...']")private WebElement lookupclick;
	
	public OrganizationLookupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLookupclick() {
		return lookupclick;
	}
	
}
