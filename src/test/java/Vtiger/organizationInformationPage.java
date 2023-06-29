package Vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class organizationInformationPage {
	@FindBy(xpath = "")private WebElement orginfotxt;
	
	public organizationInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrginfotxt() {
		return orginfotxt;
	}
	
}
