package Vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage {

	@FindBy(xpath = "")private WebElement orgNametxt;
	@FindBy(xpath = "")private WebElement industryDpdwn;
	@FindBy(xpath = "")private WebElement savebtn;
	
	public CreateOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrgNametxt() {
		return orgNametxt;
	}

	public WebElement getIndustryDpdwn() {
		return industryDpdwn;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}
	
}
