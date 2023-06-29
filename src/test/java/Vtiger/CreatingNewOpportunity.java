package Vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewOpportunity {
	@FindBy(xpath = "//span[@class='lvtHeaderText']")private WebElement firsttxt;
	
	public CreatingNewOpportunity(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirsttxt() {
		return firsttxt;
	}
}
