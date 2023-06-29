package Vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "(//td[@class='tabUnSelected'])[3]")private WebElement orglink;
	@FindBy(xpath = "(//td[@class='tabUnSelected'])[4]")private WebElement conlink;
	@FindBy(xpath = "(//td[@class='tabUnSelected'])[5]")private WebElement opplink;
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")private WebElement adminimg;
	@FindBy(xpath = "//a[text()='Sign Out']")private WebElement signoutlink;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrglink() {
		return orglink;
	}

	public WebElement getConlink() {
		return conlink;
	}

	public WebElement getOpplink() {
		return opplink;
	}

	public WebElement getAdminig() {
		return adminimg;
	}

	public WebElement getSignoutlink() {
		return signoutlink;
	}
	
}
