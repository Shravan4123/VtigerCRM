package TestNGprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {

	public WebDriver driver;
	@Test
	public void loginTest() {
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
		
		
	}
	
}
